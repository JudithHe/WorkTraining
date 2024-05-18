import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.conygre.training.entities.*;

public class TestCompactDiscs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = 
					Persistence.createEntityManagerFactory("conygrePersistentUnit");//factory name should be the same as the name is persistence.xml
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();


		//find entity by primary key(id)
		CompactDisc disc = em.find(CompactDisc.class, 11);

		System.out.println(disc.getTitle());
		//Clear the persistence context, causing all managed entities to become detached. 
		em.clear();

		disc.setTitle("A Rush of Blood to the Head");
		//disc.setTitle("Mylo Xyloto");

	
		Query allSpiceGirlsTracks = em.createQuery("select t.title from Track t where t.cdId  = 16");
		// a. Retrieve all CDs where the artist name starts with the letter ‘S’.

		// b. Retrieve the number of CDs.

		// c. Retrieve all CDs in a list in alphabetic order by title.

		// d. Retrieve all the tracks by the Spice Girls.

		// e. All tracks names and the album name for album with id of 16.

		// f. Create a parameterized query that will allow you to specify a title and the matching CDs will be returned.
		allSpiceGirlsTracks.getResultList().forEach(System.out::println);
		tx.commit();
		em.close();

		factory.close();
	}

}
