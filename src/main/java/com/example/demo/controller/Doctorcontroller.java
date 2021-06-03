package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.Doctorsrepository;

@RestController
public class Doctorcontroller {
@Autowired
private Doctorsrepository repository;

public Doctorcontroller(Doctorsrepository repository) {
	super();
	this.repository = repository;
}
  


















}
