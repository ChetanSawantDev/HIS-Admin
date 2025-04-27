package com.hospAdmin.Hospital.Admin.services;

import com.hospAdmin.Hospital.Admin.entities.PatientMaster;
import com.hospAdmin.Hospital.Admin.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientMasterService {

    @Autowired
    private PatientRepository patientRepository;

    public List<PatientMaster> listOfAllPatients(){
        return patientRepository.findAll();
    }

    public void createNewPatient(PatientMaster patientMaster){
        patientRepository.save(patientMaster);
    }
}
