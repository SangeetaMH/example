package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Doctors;
import com.example.demo.Repository.Doctorsrepository;

@Service
public class Doctorservice {
	private Doctorsrepository reposit;

	public Doctorservice(Doctorsrepository reposit) {
		super();
		this.reposit = reposit;
	}
	private Doctors adddoctors(Doctors doc)
	{
		System.out.println("hii");
		return reposit.save(doc);
		
	}
	private List<Doctors> addadoctorss(List<Doctors> docs)
	{
		return reposit.saveAll(docs);
	}
	private Doctors updatedoctors(Doctors doc)
	{
		return reposit.save(doc);
		
	}
	

}
