package Service;

import java.util.List;
import javax.ejb.Local;

import Persistence.Profil;

@Local
public interface ProfilServiceLocal {
	public void add(Profil pl);
	public void remove(Profil pl);
	public void update(Profil pl);
	public Profil getPofilByID(int id);
	public List<Profil> findAll();
	

}
