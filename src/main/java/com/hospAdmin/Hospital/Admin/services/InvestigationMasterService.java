package com.hospAdmin.Hospital.Admin.services;

import com.hospAdmin.Hospital.Admin.entities.InvestigationLevel1;
import com.hospAdmin.Hospital.Admin.repositories.InvestigationLevel1Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestigationMasterService {
    @Autowired
    private InvestigationLevel1Repo investigationLevel1Repo;

    public void saveInvestigationMaster(InvestigationLevel1 investigationLevel1){
        investigationLevel1Repo.save(investigationLevel1);
    }

    public List<InvestigationLevel1> getAllInvestigationMaster(){
        return investigationLevel1Repo.findAll();
    }
}
