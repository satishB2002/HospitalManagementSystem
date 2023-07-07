package com.hospitalproject.repository;

import com.hospitalproject.entity.Patient;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface HRepository extends JpaRepository<Patient, Integer>{

}
