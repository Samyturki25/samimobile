package Persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity:Blog
 *
 */
@Entity

public class Blog implements Serializable {

	@Id
	private int Id;
	private String publication;
	private static final long serialVersionUID = 1L;

	public Blog() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getPublication() {
		return this.publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}
   
}
