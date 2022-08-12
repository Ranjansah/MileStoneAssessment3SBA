package com.spring.Application.SBAMSA3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Application.SBAMSA3.repository.UniversityRepository;
import com.spring.Application.SBAMSA3.university.University;

@Service
public class UniversityService {
	
	@Autowired
	public UniversityRepository uniRepo;
	
	public List<University> getAllUniversities()
	{
		List<University> unis=new ArrayList<>();
		uniRepo.findAll().forEach(unis::add);
		return  unis;
	}

	public University getUniversity(Integer id)
	{
		try
		{
			return uniRepo.findById(id).get();
		}
		catch(Exception e)
		{
			return null;
		}
	}
	
	public void addUniversity(University uni)
	{
		uniRepo.save(uni);
	}
	public void updateUniversity(Integer id, University uni)
	{
		uniRepo.save(uni);
	}
	
	public void deleteUniversity(Integer id)
	{
		uniRepo.deleteById(id);
	}
}



