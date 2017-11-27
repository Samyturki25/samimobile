package Service;

import java.util.List;

import javax.ejb.Local;

import Persistence.Publications;
@Local
public interface PublicationServiceLocal {

	
	List<Publications> findPublicationsByprofil(Publications pub);
	void createPublication(Publications pub);
	Publications findPublicationById(int id);
	 void removePublication(Publications pub);
	 List<Publications> findAllPublication();
}
