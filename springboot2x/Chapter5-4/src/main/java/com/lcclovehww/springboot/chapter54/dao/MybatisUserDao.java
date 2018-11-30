/**  
 * All rights Reserved, Designed By www.tct.com
 * @Title:  MybatisUserDao.java   
 * @Package com.lcclovehww.springboot.chapter54.dao   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 泰源云景科技     
 * @date:   2018年11月28日 上午11:07:55   
 * @version V1.0 
 * @Copyright: 2018 www.tct.com Inc. All rights reserved. 
 * 注意：本内容仅限于泰源云景科技内部传阅，禁止外泄以及用于其他的商业目
 */
package com.lcclovehww.springboot.chapter54.dao;

import org.springframework.stereotype.Repository;

import com.lcclovehww.springboot.chapter54.pojo.User;

/**   
 * @ClassName:  MybatisUserDao   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 泰源云景
 * @date:   2018年11月28日 上午11:07:55   
 *     
 * @Copyright: 2018 www.tct.com Inc. All rights reserved. 
 * 注意：本内容仅限于泰源云景科技有限公司内部传阅，禁止外泄以及用于其他的商业目 
 */

@Repository
public interface MybatisUserDao {
	public User getUser(Long id) throws Exception;
}