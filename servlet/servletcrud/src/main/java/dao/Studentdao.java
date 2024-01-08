package dao;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	import dto.Studentdto;

	public class Studentdao {
	 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	 EntityManager entityManager=entityManagerFactory.createEntityManager();
	 EntityTransaction entityTransaction=entityManager.getTransaction();
	 
	public String create(Studentdto studentdto) {

	entityTransaction.begin();
	entityManager.persist(studentdto);
	entityTransaction.commit();
	return "data is inserted successfully";

	}

	public String delete(int sid1)
	{

	Studentdto std=entityManager.find(Studentdto.class,sid1);
	if(std!=null)
	 {
	entityTransaction.begin();
	entityManager.remove(std);
	entityTransaction.commit();

	return  "data is deleted";
	}
	else {
	return "no data found";
	}
	 
	}

	public void update(int sid1, long ph_no1) {
		// TODO Auto-generated method stub
		Studentdto sst=entityManager.find(Studentdto.class, sid1);

		sst.setSphno(ph_no1);
		entityTransaction.begin();
		entityManager.merge(sst);
		entityTransaction.commit();
		System.out.println("data is updated");
	}
	
	
	public Studentdto fetchById(int sid11) {
		// TODO Auto-generated method stub
		Studentdto sst=entityManager.find(Studentdto.class, sid11);
		return sst ;
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


