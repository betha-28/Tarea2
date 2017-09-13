package pe.edu.cibertec.proyemp.test.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class JpaTest {
	
	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		super();
		this.manager = manager;
	}

	public static void main(String[] args){
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("persistenceUnit");
		
		EntityManager em=factory.createEntityManager();
		
		JpaTest test=new JpaTest(em);
		
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		test.crearClientes();
		
		tx.commit();
	}

	private void crearClientes() {
		// TODO Auto-generated method stub
	}

}
