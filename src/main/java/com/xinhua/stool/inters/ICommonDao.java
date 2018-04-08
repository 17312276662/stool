package com.xinhua.stool.inters;

import java.util.List;

/**
 * 基础的自动生成mapper对应的增删改查操作
 * @author Sun mengJie
 *
 * @param <T>
 */
public interface ICommonDao<T> {

	/**
	 * 保存方法，包括添加和删除方法
	 * @param record
	 * @return
	 */
	int save(T record);
	
	/**
	 * 逻辑删除
	 * @param guid
	 * @return
	 */
	int deleteLogically(String guid);
	
	/**
	 * 物理删除
	 * @param guid
	 * @return
	 */
	int deletePhysically(String guid);
	
	/**
	 * 查询单一结果
	 * @param guid
	 * @return
	 */
	T findOnly(String guid);
	
	/**
	 * 查询列表结果
	 * @param record
	 * @param sort
	 * @return
	 */
	List<T> findAll(T record,String sort);
}
