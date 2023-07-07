package com.hospitalproject.controller;

import java.util.List;

import com.hospitalproject.entity.Patient;
import com.hospitalproject.repository.HRepository;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
@Controller
public class HController {
	@Inject
private HRepository hRepository;
@Post("/add")
public Patient  asdf(@Body Patient patient)
{
	System.out.println(1);
	hRepository.save(patient);
	System.out.println(2);
	return patient;
}
@Post("/aA")
public List<Patient> add(@Body List<Patient>   patient)
{	
	
	hRepository.saveAll(patient);
	System.out.println("D");
	return patient;
}
@Get("/get/all")
public List<Patient> getPa() {
	return  hRepository.findAll();
}
@Put("/put")
public Patient putData(Patient patient)
{
	hRepository.update(patient);
	return patient;
}
@Delete("/delete/{PatientId}")
public String deleteData(int PatientId)
{
	hRepository.deleteById(PatientId);
	return "Your Id is Deleted =="+PatientId ;	
}
}
