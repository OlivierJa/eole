package todoList.restfull.ressource;

import java.util.UUID;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import todoList.entity.Category;
import todoList.responseType.CommonResult;
import todoList.service.CategoryService;

@Path("Category")
public class CategoryRessource {

	private CategoryService categoryService = null;
	
	public CategoryRessource (){
		this.categoryService = new CategoryService();
	}

@GET
@Path("{id}")
@Produces(MediaType.APPLICATION_JSON)
public Category getCategoryById(@PathParam("id") UUID _id) {
	
	CommonResult commonResult = categoryService.getCategory(_id);
	
	if (commonResult.state) {
		return null;

	}else{
		return (Category) commonResult.result;
	}
	

}

@POST
@Path("{}")
@Consumes(MediaType.APPLICATION_JSON)
public UUID createCategory(String _name) {

	CommonResult commonResult = categoryService.createCategory(_name);
	
	if (commonResult.state) {
		return null;

	}else{
		return (UUID) commonResult.result;
	}
}

}


