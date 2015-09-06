package impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;

import model.Petani;
import model.Sawah;
import service.PetaniService;
@Transactional
public class PetaniImpl implements PetaniService {
	 private EntityManager em;
	//POJO Entity Manager
	    @PersistenceContext
		public synchronized void setEm(EntityManager em) {
			this.em = em;
		}

		public synchronized EntityManager getEm() {
			return em;
		}

	@Override
	public void save(Petani petani) {
		// TODO Auto-generated method stub
		if (petani.getId_petani() == 0) {
            // new
            em.persist(petani);
        } else {
            // update
            em.merge(petani);
        }
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Petani> findall() {
		// TODO Auto-generated method stub
//		Query query = getEm().createQuery("select from petani where id_petani = 1");
		Query selectQuery = getEm().createQuery("from Petani");
		return selectQuery.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Sawah> sawahfindbyid(long id_sawah) {
		// TODO Auto-generated method stub
		return (List<Sawah>) em.find(Sawah.class, id_sawah);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Petani> petanifindbyid(long id_petani) {
		return (List<Petani>) em.find(Petani.class, id_petani);
//		return em.find(Petani.class, id_petani);
		// TODO Auto-generated method stub
	
	}

}
