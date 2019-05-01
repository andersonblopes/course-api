package com.lopes.springbootquickstart.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findByTopiciD(String topicId);

	public List<Course> findByName(String name);

	public List<Course> findByDescription(String Description);

}
