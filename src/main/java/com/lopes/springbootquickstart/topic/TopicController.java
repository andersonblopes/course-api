package com.lopes.springbootquickstart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(new Topic("Sping", "Spring Framework", "Spring Framework Description"),
				new Topic("Java", "Core Java", "Core java Description"),
				new Topic("javascript", "javascript", "javascript Description"));

	}

}
