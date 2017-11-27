package presentation.mbeans;

import java.io.Serializable;


import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Persistence.Profil;
import Persistence.Publications;
import Service.ProfilServiceLocal;
import Service.PublicationServiceLocal;
;



@ManagedBean
@SessionScoped
public class PublicationBean {


	@EJB
	private PublicationServiceLocal pubi;

	
	private Publications publication;
	private List<Profil> profiles;
	public List<Profil> getProfiles() {
		return profiles;
	}








	public void setProfiles(List<Profil> profiles) {
		this.profiles = profiles;
	}


	private Profil ple;
	private ProfilServiceLocal catalog;
	public PublicationBean(){
		
	}


	

	
	


	/*public void init() {
		product = new Product();
		products = catalog.findAllProducts();
		formDisplayed = false;
		categories = catalog.findAllCategories();
		categoriesFilterOptions = new ArrayList<SelectItem>(
				categories.size() + 1);
		categoriesFilterOptions.add(new SelectItem("", "select one"));
		for (Category category : categories) {
			categoriesFilterOptions.add(new SelectItem(category.getName(),
					category.getName()));
		}
	}*/
	@PostConstruct
	
	
	public void init() {
		publication=new Publications();
		
		
		
	    
	}


	public String doSave() {
		
		
		pubi.createPublication(publication);
	
		return "";
		
		
		
	}

	public PublicationServiceLocal getPubi() {
		return pubi;
	}


	public void setPubi(PublicationServiceLocal pubi) {
		this.pubi = pubi;
	}


	public Publications getPublication() {
		return publication;
	}


	public void setPublication(Publications publication) {
		this.publication = publication;
	}

	


	




	



}
