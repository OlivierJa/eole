package todoList.dao.jpa;

import todoList.entity.Category;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import todoList.dao.ICategoryDao;

public class JpaCategoryDao implements ICategoryDao{

	private EntityManagerFactory emf;
	
	public JpaCategoryDao(EntityManagerFactory _emf) {
		this.emf = _emf;
	}
	
	public Category getCategoryById(UUID _id) {
		EntityManager em = emf.createEntityManager();
		
		try {
		return em.find(Category.class, _id);
		}finally {
			em.close();
		}
	}

	public UUID createCategory(Category _category) throws Exception {
		UUID result = null;
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(_category);
			em.getTransaction().commit();
			result = _category.getId();
			} 
		catch (Exception exception) {
			throw exception;
			}	
		finally 
			{
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
			em.close();
			}
		return result;
	}
}
