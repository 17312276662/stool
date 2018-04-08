package com.xinhua.stool.inters;

import java.util.List;

/**
 * �������Զ�����mapper��Ӧ����ɾ�Ĳ����
 * @author Sun mengJie
 *
 * @param <T>
 */
public interface ICommonDao<T> {

	/**
	 * ���淽����������Ӻ�ɾ������
	 * @param record
	 * @return
	 */
	int save(T record);
	
	/**
	 * �߼�ɾ��
	 * @param guid
	 * @return
	 */
	int deleteLogically(String guid);
	
	/**
	 * ����ɾ��
	 * @param guid
	 * @return
	 */
	int deletePhysically(String guid);
	
	/**
	 * ��ѯ��һ���
	 * @param guid
	 * @return
	 */
	T findOnly(String guid);
	
	/**
	 * ��ѯ�б���
	 * @param record
	 * @param sort
	 * @return
	 */
	List<T> findAll(T record,String sort);
}
