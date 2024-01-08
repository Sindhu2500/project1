package ServeletsCrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ServeletsCrud.dto.StudentDto;

public class Studentdao {
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

	public void delete1(int cid) {
		// TODO Auto-generated method stub
		
		StudentDto s1=entityManager.find(StudentDto.class, cid);
		entityTransaction.begin();
		entityManager.remove(s1);
		entityTransaction.commit();
	}

	public String fetch(int sid1) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		StudentDto d2=entityManager.find(StudentDto.class, sid1);
		String str=" "+d2.getStd_name()+" "+d2.getGender()+" "+d2.getPh_no();
		entityTransaction.commit();
		return str;
		}

	public List<StudentDto> fetchAll() {
		// TODO Auto-generated method stub
		Query query= entityManager.createQuery("Select Neha from StudentDto Neha");
		List<StudentDto> d1=query.getResultList();
		return d1;
		}

	public void update(int id, long no) {
		// TODO Auto-generated method stub
		StudentDto d1 = entityManager.find(StudentDto.class, id);
		d1.setPh_no(no);
		entityTransaction.begin();
		entityManager.merge(d1);
		entityTransaction.commit();
		System.out.println("data is updated");
	}

	public void update1(StudentDto dto) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.merge(dto);
		entityTransaction.commit();
	}

	public String delete(int d1) {
		// TODO Auto-generated method stub
		StudentDto std = entityManager.find(StudentDto.class, d1);
		if (std != null) {
			entityTransaction.begin();
			entityManager.remove(std);
			entityTransaction.commit();
			return "data is updated";
		} else
			return "data not found";
	}
}
