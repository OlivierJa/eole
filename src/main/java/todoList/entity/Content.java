package todoList.entity;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Contents")
	public class Content implements Serializable {

	private static final long serialVersionUID = 1L;

	public Content () {
		
	}

	public Content(String _message, List<Object> _objects) {
		this.message = _message;
		this.objects = _objects;

	}
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String message;
	private List<Object> objects;
	private Remember remember;
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	@OneToOne
	public Remember getRemember() {
		return remember;
	}

	public void setRemember(Remember remember) {
		this.remember = remember;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private List<Object> getObjects() {
		return objects;
	}

	private void setObjects(List<Object> objects) {
		this.objects = objects;
	}
	
	
}
