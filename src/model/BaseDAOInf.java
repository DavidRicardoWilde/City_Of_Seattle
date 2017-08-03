package model;

import java.util.List;

public interface BaseDAOInf<T> {
//	public <T> List queryBySQL(String sql, T... Obj);
	
//	public List queryList();
	
	public List queryByHql(String hqlQuery);
	
	public void testCode();
	
//	public List queryBySql();
//	public T queryObjt(String condition);
}
