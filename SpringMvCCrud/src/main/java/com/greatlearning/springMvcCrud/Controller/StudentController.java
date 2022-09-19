package com.greatlearning.springMvcCrud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.springMvcCrud.dao.model.Student;
import com.greatlearning.springMvcCrud.dao.service.StudentService;

@Controller


public class StudentController {
	
	@Autowired
	StudentService studentservice;
	
	@GetMapping("/addStudent")
	public String addStu() {
		return "add-student";
	}
	//Add Student Data
	@PostMapping("/insertStudent")
	public String insertStudent(@ModelAttribute ("insertStudent") Student student) {
		studentservice.addStu(student);
		return "redirect:/studentReport";
		
	}
	@GetMapping("/studentReport")
	public String loadStudent(Model theModel) {
		theModel.addAttribute("student", studentservice.getAllStu());
		theModel.addAttribute("title","Student Report");
		return "student-report";
		
	}
	
	@GetMapping("/editStudent/{id}")
	public String editStudent(@PathVariable(value="id") Long id,Model m) {
		Student stu=studentservice.getById(id);
		m.addAttribute("student",stu);
		m.addAttribute("title","Edit Student");
		
		return "edit-student";
	}
	
	@PostMapping("/editStudent/updateStudent")
	public String UpdateStudent(@ModelAttribute("updateStudent") Student stu) {
		studentservice.updateStu(stu);
		return "redirect:/studentReport";
		
	}
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentservice.deleteStu(id);
		
		return "redirect:/studentReport";
	
	
	
}
}