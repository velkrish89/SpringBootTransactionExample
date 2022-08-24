package com.springboot.learning.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.learning.Enitity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{

}
