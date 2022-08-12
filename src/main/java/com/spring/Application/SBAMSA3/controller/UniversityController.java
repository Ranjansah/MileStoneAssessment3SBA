package com.spring.Application.SBAMSA3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Application.SBAMSA3.exception.UserNotFoundException;
import com.spring.Application.SBAMSA3.service.UniversityService;
import com.spring.Application.SBAMSA3.university.University;

@RestController
public class UniversityController {
	
	@Autowired
	private UniversityService uniservice;
	
	@RequestMapping("/Uni")
	public List<University> getAllUniversities()
	{
		List<University> uni =uniservice.getAllUniversities();
		if(uni.size()<=0)
			throw new UserNotFoundException("Universities are not available");
		return uni;
	}
	@GetMapping("/Uni/{id}")
	public University getUniversity(@PathVariable Integer id)
	{
		University uni=uniservice.getUniversity(id);
		
		if(uni==null)
			throw new UserNotFoundException("Id is not present");
		return uni;
	}
	@RequestMapping(method=RequestMethod.POST,value="/Uni")
	public void addUniversity(@RequestBody University uni)
	{
		uniservice.addUniversity(uni);
	}

	@RequestMapping(method=RequestMethod.PUT,value="/Uni/{id}")
	public void UpdateUniversity(@PathVariable Integer id ,@RequestBody University uni)
	{
		uniservice.addUniversity(uni);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/Uni/{id}")
	public void UpdateUniversity(@PathVariable Integer id )
	{
		uniservice.deleteUniversity(id);
	}
}


