package ma.ac.emi.ginfo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ac.emi.ginfo.entities.Course;
import ma.ac.emi.ginfo.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public int getCourseNumber() {
		// TODO Auto-generated method stub
		return courseRepository.findAll().size();
	}

	@Override
	public void saveCourse(Course course) {
		// TODO Auto-generated method stub
		this.courseRepository.save(course);
	}

	@Override
	public Course getCourseById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Course> optional = courseRepository.findById(id);
		Course course = null;
		if(optional.isPresent()) {
			course = optional.get();
			
		}else {
			throw new RuntimeException("Course not Found for id :"+id);
		}
		return course;
	}

	@Override
	public void deleteCourseById(Integer id) {
		// TODO Auto-generated method stub
		this.courseRepository.deleteById(id);
	}
	
	
}
