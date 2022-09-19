package com.greatlearning.springMvcCrud.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.greatlearning.springMvcCrud.dao.model.Student;
import com.greatlearning.springMvcCrud.dao.model.Dao.StudentDao;

@Component
@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	//add Student
	public void addStu(Student student) {
		studentDao.addStudent(student);
	}
	
	//Get all Student
	public List<Student> getAllStu(){
		return studentDao.getallStudent();
	}
	
	public Student getById(Long Id) {
		return studentDao.getStdbyId(Id);
	}

	// update Student
	
		public void updateStu(Student stu)
		{
			studentDao.UpdateStd(stu);
		}
		
		
		//delete employee 
		
		public void deleteStu(Long id)
		{
			studentDao.delete(id);
		}
}
