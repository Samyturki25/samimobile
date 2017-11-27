package Persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;





@Entity

public class Profil implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String nom;
	private String prenom;
	private String email;
	private Date date_naissance;
	private int telephone;
	private String image;
	@OneToMany(mappedBy="prof")
	private List<Publications> publication;
	
	public List<Publications> getPublication() {
		return publication;
	}



	public void setPublication(List<Publications> publication) {
		this.publication = publication;
	}



	public String getImage() {
		return image;
	}
	
	

	public void setImage(String image) {
		this.image = image;
	}

	private static final long serialVersionUID = 1L;

	public Profil() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	
	public Date getDate_naissance() {
		return date_naissance;
	}



	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}



	public int getTelephone() {
		return this.telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
   
}
