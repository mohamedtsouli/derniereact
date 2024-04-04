package com.example.derniereact;

import com.example.derniereact.entities.Patient;
import com.example.derniereact.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PatientMvApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(PatientMvApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null,"Hasssan",new Date(),false,34));
        patientRepository.save(new Patient(null,"Zineb",new Date(),false,88));
        patientRepository.save(new Patient(null,"Mohamed",new Date(),true,16));







    }
}