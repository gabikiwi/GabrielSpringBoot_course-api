package com.kiwi.io.springbootquickstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

/*  
 * This is immutable and you can not apply POST method
 * 
 * private List<Topic> topics = Arrays.asList(
			
			new Topic ("spring", "Spring Framework", "Spring Framework Description"),
			new Topic ("java", "Core Java", "Core Java Description"),
			new Topic ("javascript", "JavaScript", "JavaScript Description")
			
				
			);
*/	
	
	
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			
			new Topic ("spring", "Spring Framework", "Spring Framework Description"),
			new Topic ("java", "Core Java", "Core Java Description"),
			new Topic ("javascript", "JavaScript", "JavaScript Description")
			
				
			));
	
	
	public List<Topic> getAllTopics () {
		
		
		return topics;		
	}
	

	
	
	public Topic getTopic (String topicId) {
		
		
		
		//return topics.get(Integer.parseInt(topicId));
		return topics.stream().filter(t -> t.getId().equals(topicId)).findFirst().get();
				
	}




	public void addTopic(Topic pTopic) {
		topics.add(pTopic);
		
	}




	public void updateTopic(Topic pTopic, String pId) {
		for (int i=0; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(pId)) {
				topics.set(i, pTopic);
				return;
			}
				
	  }
		
	}




	public String deleteTopic(String pId) {
		// TODO Auto-generated method stub
		topics.removeIf(t -> t.getId().equals(pId));
		
		return "your " + pId + " has been deleted";
	}
	
	
	
}
	

