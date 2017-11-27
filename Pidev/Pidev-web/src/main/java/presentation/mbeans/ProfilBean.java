package presentation.mbeans;

import java.io.Serializable;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;




import Persistence.Profil;
import Service.ProfilServiceLocal;


@ManagedBean
@SessionScoped
public class ProfilBean implements Serializable {

	private static final long serialVersionUID = -9107031652753540690L;

	@EJB
	private ProfilServiceLocal catalog;

	private Profil profil;
	private Profil pl;
	private List<Profil> profils;
	
	


	

	
	
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

	public String doSave() {
	
		catalog.add(profil);
		profils = catalog.findAll();
		return "Newprofil?faces-redirect=true";
		
		
		
	}

	@PostConstruct
	
	
	public void init() {
		
		profil=new Profil();
		
	    
	}

	

	/*public void handleFileUpload(FileUploadEvent event) {
		byte[] picture = event.getFile().getContents();
		product.setPicture(picture);
	}*/

	public Profil getProfil() {
		return profil;
	}

	public void setProfil(Profil profil) {
		this.profil = profil;
	}

	public List<Profil> getProfils() {
		return profils;
	}

	public void setProfils(List<Profil> products) {
		this.profils= products;
	}

	public Profil getPl() {
		return pl;
	}

	public void setPl(Profil pl) {
		this.pl = pl;
	}

	




	



}
