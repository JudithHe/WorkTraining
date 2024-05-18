import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.conygre.training.entities.CompactDisc;


public class LifecycleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("conygrePersistentUnit");
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		//find by primary key
		CompactDisc cd = em.find(CompactDisc.class, 12);
		
		//cd.setTitle("My new title");
		//object was in a managed state, database will change
		tx.commit();
		em.close();
		//object was detached after em was closed, database won't change
		cd.setTitle("My really nice new title");
		
		EntityManager em2 = factory.createEntityManager();
		EntityTransaction tx2 = em2.getTransaction();
		tx2.begin();

		//Because a detatched entity has had its properties copied into a managed version of the entity.
		//database will be changed(title changed)
		em2.merge(cd);
		
		
		
		tx2.commit();
		em2.close();
		
	}

}
