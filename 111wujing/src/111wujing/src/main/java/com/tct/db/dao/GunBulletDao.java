/**  
 * All rights Reserved, Designed By www.tct.com
 * @Title:  GunBulletDao.java   
 * @Package com.tct.db.dao   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 泰源云景科技     
 * @date:   2018年11月17日 下午6:22:18   
 * @version V1.0 
 * @Copyright: 2018 www.tct.com Inc. All rights reserved. 
 * 注意：本内容仅限于泰源云景科技内部传阅，禁止外泄以及用于其他的商业目
 */
package com.tct.db.dao;

import com.tct.codec.protocol.pojo.GetBulletNumberResMessage;
import com.tct.codec.protocol.pojo.ReportBulletNumberReqMessage;

/**   
 * @ClassName:  GunBulletDao   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 泰源云景
 * @date:   2018年11月17日 下午6:22:18   
 *     
 * @Copyright: 2018 www.tct.com Inc. All rights reserved. 
 * 注意：本内容仅限于泰源云景科技有限公司内部传阅，禁止外泄以及用于其他的商业目 
 */
public interface GunBulletDao {

	public int insertSelective(ReportBulletNumberReqMessage msg);
	
	public int updateTotalCount(GetBulletNumberResMessage gbnrMsg);
}
