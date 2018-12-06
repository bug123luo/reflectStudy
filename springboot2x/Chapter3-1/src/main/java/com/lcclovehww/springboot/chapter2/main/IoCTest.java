/**  
 * All rights Reserved, Designed By www.tct.com
 * @Title:  IoCTest.java   
 * @Package com.lcclovehww.springboot.chapter2.main   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 泰源云景科技     
 * @date:   2018年12月6日 下午7:39:14   
 * @version V1.0 
 * @Copyright: 2018 www.tct.com Inc. All rights reserved. 
 * 注意：本内容仅限于泰源云景科技内部传阅，禁止外泄以及用于其他的商业目
 */
package com.lcclovehww.springboot.chapter2.main;

import static org.assertj.core.api.Assertions.useRepresentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lcclovehww.springboot.chapter2.config.AppConfig;
import com.lcclovehww.springboot.chapter2.pojo.User;

import lombok.extern.slf4j.Slf4j;

/**   
 * @ClassName:  IoCTest   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 泰源云景
 * @date:   2018年12月6日 下午7:39:14   
 *     
 * @Copyright: 2018 www.tct.com Inc. All rights reserved. 
 * 注意：本内容仅限于泰源云景科技有限公司内部传阅，禁止外泄以及用于其他的商业目 
 */

@Slf4j
public class IoCTest {

	
	
	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		User user= ctx.getBean(User.class);
		log.info(user.getId().toString());
	}

}
