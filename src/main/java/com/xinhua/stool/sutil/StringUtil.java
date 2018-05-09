package com.xinhua.stool.sutil;

import java.util.UUID;

import com.xinhua.stool.constants.StringConstants;

/**
 * 字符串相关的方法
 * @author Sun mengJie
 *
 */
public class StringUtil {

	/**
	 * 不为null
	 * @param str
	 * @return
	 */
	public static boolean notNull(String str){
		
		return str != null;
	}
	
	/**
	 * null判定
	 * @param str
	 * @return
	 */
	public static boolean isNull(String str){
		
		return str == null;
	}
	
	/**
	 * 是否不为空字符串
	 * @param str
	 * @return
	 */
	public static boolean notBlank(String str){
		
		return (str == null)?false:(!StringConstants.EMPTY.equals(str));
	}
	
	/**
	 * 判断是否为空字符串
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str){
		
		return (str == null)?true:(StringConstants.EMPTY.equals(str));
	}
	
	/**
	 * 判断是否为空格等空白字符串
	 * @param str
	 * @return
	 */
	public static boolean isBlanks(String str){
		
		if(str == null){
			
			return true;
		}
		str = str.replace(StringConstants.ENTER_N, StringConstants.EMPTY);
		str = str.replace(StringConstants.ENTER_R, StringConstants.EMPTY);
		str = str.replace(StringConstants.TAB, StringConstants.EMPTY);
		
		
		return StringConstants.EMPTY.equals(str);
	}
	
	/**
	 * 获取uuid
	 * @return
	 */
	public static String getUUID() {
		
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replace(StringConstants.LINE, StringConstants.EMPTY);
	
	}
}
