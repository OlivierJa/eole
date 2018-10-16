package todoList.dao;

import todoList.dao.jpa.JpaCategoryDao;

public class DaoFactory {

	private static DaoFactory instance;
	private ICategoryDao categoryDao;
	
	public static DaoFactory getInstance( ) {
		if(instance == null) {
			instance = new DaoFactory();
	}
	
	return instance;
	}
	
	public ICategoryDao getCategoryDao() {
		if(categoryDao == null) {
			categoryDao = new JpaCategoryDao(jpaConnector.getEntityManagerFactory());
	}
	
	return categoryDao;
}

}