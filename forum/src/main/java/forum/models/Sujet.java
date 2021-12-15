package forum.models;

import java.util.Date;

public class Sujet {

	private Long id;
	private String libelle;
	private Date dateCreation;
	private Long auteurId;
	@Override
	public String toString() {
		return "Sujet [id=" + id + ", libelle=" + libelle + ", dateCreation=" + dateCreation + ", auteurId=" + auteurId
				+ "]";
	}
	public Sujet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
