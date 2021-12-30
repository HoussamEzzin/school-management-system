package ma.ac.emi.ginfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ac.emi.ginfo.entities.Course;
import ma.ac.emi.ginfo.entities.Professor;
import ma.ac.emi.ginfo.service.CourseService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@Autowired
	
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello world";
	}
	
	@GetMapping("/courses")
	public List<Course> showAllCourses(){
		return courseService.getAllCourses();
	}
	
	@GetMapping("/professors")
	public List<Professor> showAllProfessors(){
		return profe
	}
}
