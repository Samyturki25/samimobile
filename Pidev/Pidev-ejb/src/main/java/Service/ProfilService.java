package Service;



import java.util.List;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Persistence.Profil;
import Service.ProfilServiceLocal;

@Stateless

public










class ProfilService implements ProfilServiceLocal{

	@PersistenceContext
	private EntityManager em;
	
	

	public ProfilService() {
		
	}

	@Override
	public void add(Profil pl) {
	
		em.merge(pl);
		
	}

	@Override
	public void remove(Profil pl) {
		em.remove(pl);
		
	}

	@Override
	public void update(Profil pl) {
		em.merge(pl);
		
	}


	public List<Profil> findAll()
	{
	return em.createQuery("select p from Profil p ",Profil.class).getResultList();
	
	
	}

	@Override
	public Profil getPofilByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

