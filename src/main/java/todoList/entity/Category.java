package todoList.entity;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "Categories")
	public class Category implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public Category () {
		
	}

	public Category (String _name) {
		this.name = _name;
	}
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String name;
	@OneToMany (mappedBy = "category")
	private List<Remember> remembers;
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Remember> getRemembers() {
		return remembers;
	}

	public void setRemembers(List<Remember> remembers) {
		this.remembers = remembers;
	}
	
	
	
}
