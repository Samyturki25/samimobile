package Persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Publications
 *
 */
@Entity

public class Publications implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String description;
	private String commentaire;
	@ManyToOne
	private Profil prof;
	public Profil getProf() {
		return prof;
	}
	public void setProf(Profil prof) {
		this.prof = prof;
	}

	private static final long serialVersionUID = 1L;

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Publications() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
   
}
