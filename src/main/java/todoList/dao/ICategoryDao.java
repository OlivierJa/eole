package todoList.dao;

import todoList.entity.Category;
import java.util.UUID;

public interface ICategoryDao {

	Category getCategoryById(UUID _id);
	UUID createCategory(Category _category) throws Exception;
	
}
