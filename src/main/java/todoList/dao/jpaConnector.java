package todoList.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class jpaConnector {

	private static EntityManagerFactory emf;
	private jpaConnector () {
		
	}
	
	public static EntityManagerFactory getEntityManagerFactory () {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("PU-TODODB");
		}
		return emf;
	}

	public static void closeEntityManagerFactory ( ) {
		if (emf != null && emf.isOpen())
			emf.close();
	}
	
}
