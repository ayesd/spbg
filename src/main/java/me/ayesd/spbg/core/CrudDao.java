package me.ayesd.spbg.core;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface CrudDao<T extends Entity> {
	public void insert(T entity) throws Exception;
	public void delete(String id) throws Exception ;
	public void delete(T entity) throws Exception ;
	public void update(T entity) throws Exception ;
	public void update(Map<String, Object> map) throws Exception ;
	public T get(String id) throws Exception ;	
	
	public void batchInsert(Collection<T> entities) throws Exception ;
	public void batchDelete(String[] ids) throws Exception ;
	public void batchDelete(Collection<T> entities) throws Exception ;
	public void batchUpdate(Collection<T> entities) throws Exception ;
	
	public List<T> listInPageByOrder(int currentPage, int pageSize,String sortString) throws Exception ;
}