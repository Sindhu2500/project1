package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Dto.ProjectDto;

public class ProjectDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public String create(ProjectDto dto) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
		return "value is inserted";
	}

	public ProjectDto login(String email) {
		// TODO Auto-generated method stub
		ProjectDto d1 = entityManager.find(ProjectDto.class, email);
		return d1;
	}

	public void signup(ProjectDto dto) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
		
	}

	public void result(ProjectDto dto) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
		
		
	}

	public void update(int usn, String name) {
		// TODO Auto-generated method stub
		ProjectDto d1 = entityManager.find(ProjectDto.class, usn);
		d1.setName(name);
		entityTransaction.begin();
		entityManager.merge(d1);
		entityTransaction.commit();
		System.out.println("data is updated");
	}

	public String fetch(int usn) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		ProjectDto d1=entityManager.find(ProjectDto.class, usn);
		String str=" "+d1.getName();
		entityTransaction.commit();
		return str;
	}
		
	}
	
	


