package com.lopes.springbootquickstart.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/{id)")
	public List<Course> getAllCourses(@PathVariable String topicId) {
		return courseService.getAllCourses(topicId);
	}

	@GetMapping("/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}

	@PostMapping
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}

	@PutMapping("/{id}")
	public void updateCourse(@RequestBody Course course) {
		courseService.updateCourse(course);
	}

	@DeleteMapping("/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}

}
