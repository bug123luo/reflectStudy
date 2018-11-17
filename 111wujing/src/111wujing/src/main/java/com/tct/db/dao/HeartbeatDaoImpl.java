/**  
 * All rights Reserved, Designed By www.tct.com
 * @Title:  HeartbeatDao.java   
 * @Package com.tct.db.dao   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 泰源云景科技     
 * @date:   2018年11月8日 下午3:40:36   
 * @version V1.0 
 * @Copyright: 2018 www.tct.com Inc. All rights reserved. 
 * 注意：本内容仅限于泰源云景科技内部传阅，禁止外泄以及用于其他的商业目
 */
package com.tct.db.dao;

import java.util.ArrayList;

import javax.management.relation.RoleUnresolved;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.tct.codec.protocol.pojo.DeviceHeartReqMessage;
import com.tct.codec.protocol.pojo.WatchHeartReqMessage;
import com.tct.codec.protocol.pojo.WatchHeartReqMessageBody.Guninfo;
import com.tct.db.mapper.AppCustomMapper;
import com.tct.db.mapper.AppDynamicDataCustomMapper;
import com.tct.db.mapper.AppGunCustomMapper;
import com.tct.db.mapper.GunCustomMapper;
import com.tct.db.mapper.GunLocationCustomMapper;
import com.tct.db.po.AppCustom;
import com.tct.db.po.AppCustomQueryVo;
import com.tct.db.po.AppDynamicDataCustom;
import com.tct.db.po.AppGunCustom;
import com.tct.db.po.AppGunCustomQueryVo;
import com.tct.db.po.GunCustom;
import com.tct.db.po.GunCustomQueryVo;
import com.tct.db.po.GunLocationCustom;
import com.tct.util.StringConstant;
import com.tct.util.StringUtil;

import lombok.extern.slf4j.Slf4j;


/**   
 * @ClassName:  HeartbeatDao   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 泰源云景
 * @date:   2018年11月8日 下午3:40:36   
 *     
 * @Copyright: 2018 www.tct.com Inc. All rights reserved. 
 * 注意：本内容仅限于泰源云景科技有限公司内部传阅，禁止外泄以及用于其他的商业目 
 */

@Slf4j
@Component("heartbeatDao")
public class HeartbeatDaoImpl implements HeartbeatDao{
	
	@Autowired
	AppDynamicDataCustomMapper addcDao;
	
	@Autowired
	GunLocationCustomMapper glcDao;
		
	@Autowired
	GunCustomMapper gcDao;
	
	@Autowired
	AppCustomMapper acDao;
	
	@Autowired
	AppGunCustomMapper accDao;
	
	@Transactional
	public int insertAppHeartbeatSelective(WatchHeartReqMessage wHRMsg) {
		int i=0;
		
		AppCustomQueryVo appCustomQueryVo = new AppCustomQueryVo();
		AppCustom appCustom = new AppCustom();
		appCustom.setAppImei(wHRMsg.getUniqueIdentification());
		appCustomQueryVo.setAppCustom(appCustom);
		AppCustom appCustomTemp = acDao.selectAppAllColumn(appCustomQueryVo); 
		
		AppDynamicDataCustom appDynamicDataCustom = new AppDynamicDataCustom();
		appDynamicDataCustom.setAppBatteryPower(wHRMsg.getMessageBody().getAppBatteryPower());
		appDynamicDataCustom.setAppId(Integer.valueOf(appCustomTemp.getId()));
		appDynamicDataCustom.setExceptionType(Integer.valueOf(wHRMsg.getMessageBody().getExceptionCode()));
		appDynamicDataCustom.setCreateTime(StringUtil.getDate(wHRMsg.getSendTime()));
		addcDao.insertSelective(appDynamicDataCustom);
		
		ArrayList<Guninfo> gList = wHRMsg.getMessageBody().getGunList();
		GunCustom gunCustom = new GunCustom();
		GunLocationCustom gunLocationCustom = new GunLocationCustom();
		gunLocationCustom.setAppId(appDynamicDataCustom.getAppId());
		gunLocationCustom.setAreaCode(wHRMsg.getMessageBody().getAreaCode());
		gunLocationCustom.setCreateTime(StringUtil.getDate(wHRMsg.getSendTime()));
		gunLocationCustom.setLongitude(wHRMsg.getMessageBody().getLo());
		gunLocationCustom.setLatitude(wHRMsg.getMessageBody().getLa());
		for(Guninfo guninfo:gList) {
			gunLocationCustom.setGunId(guninfo.getGunId());
			gunLocationCustom.setGunDeviceBatteryPower(guninfo.getGunDeviceBatteryPower());
			glcDao.insertSelective(gunLocationCustom);
			
			gunCustom.setRealTimeState(Integer.valueOf(guninfo.getRealTimeState()));
			gcDao.updateByGunId(gunCustom);
		}
		
		i=1;
		return i;
	}
	
	@Transactional
	public int intsertDeviceSelective(DeviceHeartReqMessage dhrm) {
		
		int i =0;
		
		GunCustomQueryVo gunCustomQueryVo = new GunCustomQueryVo();
		GunCustom gunCustom = new GunCustom();
		gunCustom.setGunImei(dhrm.getUniqueIdentification());
		gunCustomQueryVo.setGunCustom(gunCustom);
		GunCustom gunCustomTemp = gcDao.selectAllColumnByGunImei(gunCustomQueryVo);
		
		AppGunCustomQueryVo appGunCustomQueryVo = new AppGunCustomQueryVo();
		AppGunCustom appGunCustom = new AppGunCustom();
		appGunCustom.setGunId(gunCustomTemp.getGunId());
		appGunCustom.setAllotState(Integer.valueOf(StringConstant.GUN_ALLOTED_STATE));
		appGunCustomQueryVo.setAppGunCustom(appGunCustom);
		AppGunCustom appGunCustomTemp=accDao.selectAllColumn(appGunCustomQueryVo);
		
		GunLocationCustom gunLocationCustom = new GunLocationCustom();
		gunLocationCustom.setAppId(appGunCustomTemp.getAppId());
		gunLocationCustom.setGunId(gunCustomTemp.getGunId());
		gunLocationCustom.setGunMac(gunCustomTemp.getGunMac());
		gunLocationCustom.setAreaCode(dhrm.getMessageBody().getAreaCode());
		gunLocationCustom.setDirector(dhrm.getMessageBody().getDirector());
		gunLocationCustom.setGunDeviceBatteryPower(dhrm.getMessageBody().getGunDeviceBatteryPower());
		gunLocationCustom.setGunDeviceState(Integer.valueOf(dhrm.getMessageBody().getInPosition()));
		gunLocationCustom.setCreateTime(StringUtil.getDate(dhrm.getSendTime()));
		gunLocationCustom.setLongitude(dhrm.getMessageBody().getLo());
		gunLocationCustom.setLatitude(dhrm.getMessageBody().getLa());
		glcDao.insertSelective(gunLocationCustom);
		
		return 1;
	}
	
}