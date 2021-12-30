package ma.ac.emi.ginfo.service;

import java.util.List;

import ma.ac.emi.ginfo.entities.Course;

public interface CourseService {
	List<Course> getAllCourses();
	int getCourseNumber(); 
	void saveCourse(Course course); 
	Course getCourseById(Integer id);
	void deleteCourseById(Integer id);
	

}
