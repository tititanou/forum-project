package forum.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import forum.models.Sujet;

@Entity
public class Message implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
    private String text;
    
    @ManyToOne
    @JoinColumn(name = "sujet")
    private Sujet sujet;
    
    @ManyToOne
    @JoinColumn(name = "user")
    private User user;

    public Message() {
	
    }

}
