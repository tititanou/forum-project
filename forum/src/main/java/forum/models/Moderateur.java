package forum.models;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue(value = "moderateur")
public class Moderateur extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	public Moderateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
