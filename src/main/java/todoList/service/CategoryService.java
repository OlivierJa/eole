package todoList.service;

import java.util.UUID;
import todoList.dao.DaoFactory;
import todoList.entity.Category;
import todoList.responseType.CommonResult;

public class CategoryService {

	public CommonResult createCategory(String _name) {

		boolean error = false;
		UUID categoryId = null;
		Category category = new Category(_name);

		try {
		categoryId = DaoFactory.getInstance().getCategoryDao().createCategory(category);
		} 
		catch (Exception exception) {
			error = true;
			System.out.println(exception.toString());
		}
		return new CommonResult (error, categoryId.toString());
	}

	public CommonResult getCategory(UUID _id) {
		
		boolean error = false;
		Category category = null;
		
		try {
			category = DaoFactory.getInstance().getCategoryDao().getCategoryById(_id);
			} 
		catch (Exception exception) {
				error = true;
				System.out.println(exception.toString());
			}
		return new CommonResult (error, category);	
	}
}
