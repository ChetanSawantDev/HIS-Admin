package com.hospAdmin.Hospital.Admin.controllers;

import com.hospAdmin.Hospital.Admin.dto.PatientInvestigationRequestDto;
import com.hospAdmin.Hospital.Admin.services.PatientInvestigationService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patientInvestigation")
public class PatientInvestigationMasterController {

    @Autowired
    private PatientInvestigationService patientInvestigationService;

    @PostMapping("/request")
    public ResponseEntity<String> requestPateintInvestigation(@RequestBody PatientInvestigationRequestDto patientInvestigationRequestDto){
        try{
            patientInvestigationService.savePatientInvestigationLevel1(patientInvestigationRequestDto);
            return ResponseEntity.ok("Created Investigation !");
        }catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }
}
