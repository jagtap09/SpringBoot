package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.StudentDao;
import com.jbk.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao dao;
	public  String insertData(Student s) {
		String msg= dao.insertData(s);;
	    return msg;
	}
	public String deleteData(int std_id) {
		String msg=dao.deleteData(std_id);
		return msg;
		
	}
	public String updateData(Student s,int std_id) {
		String msg=dao.updateData(s,std_id);
		return msg;
		
	}
	public Student getSingleData(int std_id) {
		Student s=dao.getsingleData(std_id);
		return s;
	}
	public List<Student> getAllRecord() {
		List <Student> list=dao.getAllRecord();
		return list;
	}

	
	
	

}
