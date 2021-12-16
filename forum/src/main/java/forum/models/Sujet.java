package forum.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Sujet implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String libelle;
	private Date dateCreation;
	
	@ManyToOne
	@JoinColumn(name ="user")
	private User user;
	
	

	@Override
	public String toString() {
		return "Sujet [id=" + id + ", libelle=" + libelle + ", dateCreation=" + dateCreation + ", user=" + user + "]";
	}



	public Sujet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
