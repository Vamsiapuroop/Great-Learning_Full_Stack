package com.greatlearning.springMvcCrud.dao.model.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.springMvcCrud.dao.model.Student;

@Component
public class StudentDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	// Add Student
	@Transactional
	public void addStudent(Student student) {
		hibernateTemplate.save(student);
	}
	
	//get all students
	public List<Student> getallStudent(){
		return hibernateTemplate.loadAll(Student.class);
	}
	
	//get student by id
	public Student getStdbyId(Long id) {
		return hibernateTemplate.get(Student.class, id);
	}
	
	//Update Student
	@Transactional
	public void UpdateStd(Student student)
	{
		hibernateTemplate.update(student);
	}
	//Delete Student
	@Transactional
	public void delete(Long id) {
		hibernateTemplate.delete(hibernateTemplate.load(Student.class, id));
	}

	
}

