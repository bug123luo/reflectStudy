/**  
 * All rights Reserved, Designed By www.tct.com
 * @Title:  AppCustomMapper.java   
 * @Package com.tct.db.mapper   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 泰源云景科技     
 * @date:   2018年11月6日 上午10:50:37   
 * @version V1.0 
 * @Copyright: 2018 www.tct.com Inc. All rights reserved. 
 * 注意：本内容仅限于泰源云景科技内部传阅，禁止外泄以及用于其他的商业目
 */
package com.tct.db.mapper;

import com.tct.db.po.AppCustom;
import com.tct.db.po.AppCustomQueryVo;

/**   
 * @ClassName:  AppCustomMapper   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 泰源云景
 * @date:   2018年11月6日 上午10:50:37   
 *     
 * @Copyright: 2018 www.tct.com Inc. All rights reserved. 
 * 注意：本内容仅限于泰源云景科技有限公司内部传阅，禁止外泄以及用于其他的商业目 
 */
public interface AppCustomMapper {
	AppCustom selectAppAllColumn(AppCustomQueryVo appCustomQueryVo);
}