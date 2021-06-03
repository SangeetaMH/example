package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Doctors;

public interface Doctorsrepository extends JpaRepository<Doctors, Integer> {

}
