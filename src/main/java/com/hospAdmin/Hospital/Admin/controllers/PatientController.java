package com.hospAdmin.Hospital.Admin.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hospAdmin.Hospital.Admin.entities.PatientMaster;
import com.hospAdmin.Hospital.Admin.services.PatientMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientMasterService patientMasterService;

    @PostMapping("/create")
    public ResponseEntity<String>  registerNewPatient(@RequestBody PatientMaster patientMaster){
        try{
            patientMasterService.createNewPatient(patientMaster);
            return ResponseEntity.ok("Patient Created Successfully !");
        }catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @GetMapping("/getAllPatient")
    public ResponseEntity<String> getAllPatients(){
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            return ResponseEntity.ok(objectMapper.writeValueAsString(patientMasterService.listOfAllPatients()));
        }catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

}
