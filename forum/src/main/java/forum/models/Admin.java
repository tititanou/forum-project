package forum.models;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

import forum.models.User;

@Entity
@DiscriminatorColumn(name = "admin")
public class Admin extends User implements Serializable { /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	 

		public Admin() {
			super();
			// TODO Auto-generated constructor stub
		} 
	
}
