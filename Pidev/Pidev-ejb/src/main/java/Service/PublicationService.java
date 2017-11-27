package Service;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;


import Persistence.Publications;



/**
 * Entity implementation class for Entity: PublicationService
 *
 */
@Stateless

public class PublicationService implements PublicationServiceLocal {

	@PersistenceContext
	private EntityManager em;
	public List<Publications> findPublicationsByprofil(Publications pub) {
			return em.createQuery("select p from Publications p where p.Profil=:c",
							Publications.class).setParameter("c", pub)
					.getResultList();
		}
 
	
	public PublicationService() {
	}

	public void createPublication(Publications pub) {
		em.merge(pub);
	}

	

	public Publications findPublicationById(int id) {
		return em.find(Publications.class, id);
	}

	public List<Publications> findAllPublication() {
		return em.createQuery("select p from Publications p", Publications.class)
				.getResultList();
	}

	public void removePublication(Publications pub) {
		em.remove(em.merge(pub));
	}
		
	}
   

