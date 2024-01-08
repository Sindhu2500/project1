package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.StudentDto;

public class StudentDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public String create(StudentDto dto) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(dto);
	    entityTransaction.commit();
		return "data is inserted";
	}

	public String delete(StudentDto dto) {
		// TODO Auto-generated method stub
		StudentDto dto2=entityManager.find(StudentDto.class , dto);
				if(dto!=null) {
		entityTransaction.begin();
		entityManager.remove(dto);
		entityTransaction.commit();
		return "data is deleted";
				}
				else {
					return "data is not deleted";
		
				}
		
		//return null;
	}

	public void update(int sid1, long phno1) {
		// TODO Auto-generated method stub
		StudentDto dto=	entityManager.find(StudentDto.class, sid1);
		dto.setPhno(phno1);
		entityTransaction.begin();
		entityManager.merge(dto);
		entityTransaction.commit();
		System.out.println("data is updated");
		
	}

	public String fetch(int sid1) {
		// TODO Auto-generated method stub
		
			entityTransaction.begin();
			StudentDto dto=entityManager.find(StudentDto.class, sid1);
			String str=" "+dto.getSid()+" "+dto.getPhno()+" "+dto.getGender();
			entityTransaction.commit();	
			return str;
	}

	
}
