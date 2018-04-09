package com.xinhua.stool.sutil;

import java.util.List;

/**
 * 列表工具类
 * @author Sun mengJie
 *
 */
public class ListUtil {

	/**
	 * 列表不为空
	 * @param list
	 * @return
	 */
	public static boolean notEmpty(List<?> list){
		
		return list !=null && list.size()>0;
	}
	
	/**
	 * list为空的对象
	 * @param list
	 * @return
	 */
	public static boolean empty(List<?> list){
		
		return list != null && list.size() == 0;
	}
}
