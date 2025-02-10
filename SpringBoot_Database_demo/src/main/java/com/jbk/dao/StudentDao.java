package com.jbk.dao;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Student;


@Repository
public class StudentDao {
	@Autowired
	SessionFactory factory;
	
	
	
	public String insertData( Student s)
	{
		Session session= factory.openSession();
		Transaction tr=session.beginTransaction();
		
		session.persist(s);
		tr.commit();
		session.close();
		return "Data Inserted.....";
		
	}	
	
	public String deleteData(int std_id) {
	    Session session = factory.openSession();
	    Transaction tr = session.beginTransaction();
	    
	    Student s1 = session.get(Student.class, std_id);
	    
	        session.remove(s1);
	        tr.commit();
	        session.close();
	        return "Data deleted successfully."; 
	        
	}
	    
	        
		    public String updateData(Student s, int std_id) {
		    	Session session=factory.openSession();
		    	Transaction tr=session.beginTransaction();
		    	
		    	Student s1=session.get(Student.class,std_id);
		    	s1.setStd_age(s.getStd_age());
		    	s1.setStd_name(s.getStd_name());
		    	
		    	session.merge(s1);
		    	tr.commit();
		    	session.close();
		    	return "data updated....";
		    	
		    	
		    
	    }
		    public Student getsingleData(int std_id) {
		    	Session session=factory.openSession();
		    	Transaction tr=session.beginTransaction();
		    	
		    	String hqlQuery ="from Student where std_id =:myid";
		    	Query <Student> query =session.createQuery(hqlQuery, Student.class);
				query.setParameter("myid", std_id);
		    	
		    	Student s1=query.uniqueResult();
		    	tr.commit();
		    	session.close();
		    	return s1;
		    	
		    	
		    	
		    }
		    
		    public List<Student> getAllRecord(){
		    	Session session = factory.openSession();
				Transaction tr = session.beginTransaction();
				
				String hqlQuery ="from Student";
				
				Query<Student> query =session.createQuery(hqlQuery);
				List<Student> list =query.list();
				tr.commit();
				session.close();
				
				return list;
				
						

		    	
		    }
	
	
	
	
	
	
	   }

	


