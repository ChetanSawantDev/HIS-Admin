package com.hospAdmin.Hospital.Admin.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hospAdmin.Hospital.Admin.entities.InvestigationLevel1;
import com.hospAdmin.Hospital.Admin.services.InvestigationMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investigations")
public class InvestigationMasterController {

    @Autowired
    private InvestigationMasterService investigationMasterService;

    @PostMapping("/create")
    public ResponseEntity<String> createNewInvestigation(@RequestBody InvestigationLevel1 investigationMaster){
        try{
            investigationMasterService.saveInvestigationMaster(investigationMaster);
            return ResponseEntity.ok("Created Investigation");
        }catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @GetMapping("/getAllInvestigations")
    public ResponseEntity<List<InvestigationLevel1>> getAllInvestigations() {
        try {
            List<InvestigationLevel1> list = investigationMasterService.getAllInvestigationMaster();
            return ResponseEntity.ok(list);
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }

}
