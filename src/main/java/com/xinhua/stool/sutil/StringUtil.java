package com.xinhua.stool.sutil;

import java.util.UUID;

import com.xinhua.stool.constants.StringConstants;

/**
 * �ַ�����صķ���
 * @author Sun mengJie
 *
 */
public class StringUtil {

	/**
	 * ��Ϊnull
	 * @param str
	 * @return
	 */
	public static boolean notNull(String str){
		
		return str != null;
	}
	
	/**
	 * null�ж�
	 * @param str
	 * @return
	 */
	public static boolean isNull(String str){
		
		return str == null;
	}
	
	/**
	 * �Ƿ�Ϊ���ַ���
	 * @param str
	 * @return
	 */
	public static boolean notBlank(String str){
		
		return (str == null)?false:(!StringConstants.EMPTY.equals(str));
	}
	
	/**
	 * �ж��Ƿ�Ϊ���ַ���
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str){
		
		return (str == null)?true:(StringConstants.EMPTY.equals(str));
	}
	
	/**
	 * �ж��Ƿ�Ϊ�ո�ȿհ��ַ���
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
	 * ��ȡuuid
	 * @return
	 */
	public static String getUUID() {
		
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replace(StringConstants.LINE, StringConstants.EMPTY);
	
	}
}
