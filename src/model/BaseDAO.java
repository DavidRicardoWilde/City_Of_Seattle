package model;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class BaseDAO<T> implements BaseDAOInf<T> {
	//property
	private Class entityClass;
	protected SessionFactory sessionFactory;
	
	//set-get function
		public void setSessionFactory(SessionFactory sessionFactory){
			this.sessionFactory=sessionFactory;
		}
		public SessionFactory getSessionFacotry(){
			return sessionFactory;
		}

	
	//function
	public void addObjt(T tObjt){
		try{
			System.out.println("this is add function in BaseDAO");
			Session session = sessionFactory.getCurrentSession();
			session.save(tObjt);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public <T> List queryBySQL(String sql, T... tObj){
		List list = null;
		return list;
	}
	
	public List queryByHql(String hqlQuery){
		System.out.println("this is queryByHql function");
		List list =null;
		String hqlStr = hqlQuery;
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery(hqlStr);
		list = query.list();
		
		return list;
	}
	
	public List queryList(){
		System.out.println("queryList1111111");
		try{
			System.out.println("queryList2222222222");
			Session session=sessionFactory.getCurrentSession();

			String hqlStr="from "+entityClass.getName();
			System.out.println("hqlStr = "+hqlStr);
			
			Query query=session.createQuery(hqlStr);
			System.out.println("queryList33333333333");
			
			List list = query.list();
			System.out.println("queryList444444444444");
			System.out.println(list);
			return list;
		}catch(Exception e){
			List list =null;
			System.out.println(e);
			return list;
		}
	}
	
//	public T queryObjt(String condition) {
//		T t = null;
//		
//		Session session = sessionFactory.getCurrentSession();
//		
//		String hqlStr=" from "+entityClass.getName()+" where '"+condition+"'";
//		
//		return t;
//	}
	
	public void testCode(){
		//System.out.println("testCode function");
	}
	
	
	protected BaseDAO(){
		Type genType = getClass().getGenericSuperclass();
		Type[] params = ((ParameterizedType)genType).getActualTypeArguments();
		entityClass =(Class)params[0];
	}
}
