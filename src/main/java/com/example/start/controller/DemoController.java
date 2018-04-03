package com.example.start.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**   
* ......................我佛慈悲......................* 
*													*
*                       _oo0oo_ 					*
*                      o8888888o 					*
*                      88" . "88 					*
*                      (| -_- |) 					*
*                      0\  =  /0 					*
*                    ___/`---'\___ 					*
*                  .' \\|     |// '. 				*	
*                 / \\|||  :  |||// \ 				*
*                / _||||| -卍-|||||- \ 				*
*               |   | \\\  -  /// |   | 			*
*               | \_|  ''\---/''  |_/ | 			*
*               \  .-\__  '-'  ___/-. / 			*
*             ___'. .'  /--.--\  `. .'___ 			*
*          ."" '<  `.___\_<|>_/___.' >' "". 		*
*         | | :  `- \`.;`\ _ /`;.`/ - ` : | | 		*
*         \  \ `_.   \_ __\ /__ _/   .-` /  / 		*
*     =====`-.____`.___ \_____/___.-`___.-'===== 	*
*                       `=---=' 					*
*                      								*
*..................佛祖开光 ,永无BUG...................	*
* 
*    佛曰:    										*
*             写字楼里写字间，写字间里程序员；    				*
*             程序人员写程序，又拿程序换酒钱。    				*
*             酒醒只在网上坐，酒醉还来网下眠；    				*
*             酒醉酒醒日复日，网上网下年复年。    				*
*             但愿老死电脑间，不愿鞠躬老板前；    				*
*             奔驰宝马贵者趣，公交自行程序员。    				*
*             别人笑我忒疯癫，我笑自己命太贱；    				*
*             不见满街漂亮妹，哪个归得程序员？   				*
....................................................*
* Filename:    DemoController.java   
* Copyright:   Copyright (c)2010  
* Company:     SANDUO  
* @version:    1.0   
* @since:  JDK 1.7.0_67  
* Create at:   2018年3月2日 下午4:05:46   
* Description:  
*   
* Modification History:   
* Date         Author      Version     Description   
* ---------------------------------------------------
* 2018年3月2日      SANDUO       1.0        1.0 Version   
*/
@RestController
public class DemoController {
    
    @RequestMapping("/hello")
    public String index() {
        
        return "Hello SpringBoot";
    }
}

