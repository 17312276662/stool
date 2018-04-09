package com.xinhua.stool.sutil;

import java.util.List;

/**
 * �б�����
 * @author Sun mengJie
 *
 */
public class ListUtil {

	/**
	 * �б�Ϊ��
	 * @param list
	 * @return
	 */
	public static boolean notEmpty(List<?> list){
		
		return list !=null && list.size()>0;
	}
	
	/**
	 * listΪ�յĶ���
	 * @param list
	 * @return
	 */
	public static boolean empty(List<?> list){
		
		return list != null && list.size() == 0;
	}
}
