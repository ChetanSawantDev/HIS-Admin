package com.hospAdmin.Hospital.Admin.services;

import com.hospAdmin.Hospital.Admin.dto.PatientInvestigationRequestDto;
import com.hospAdmin.Hospital.Admin.entities.InvestigationLevel1;
import com.hospAdmin.Hospital.Admin.entities.PatientInvestigationLevel1;
import com.hospAdmin.Hospital.Admin.entities.PatientInvestigationLevel3;
import com.hospAdmin.Hospital.Admin.repositories.InvestigationLevel1Repo;
import com.hospAdmin.Hospital.Admin.repositories.PatientInvestigationLevel1Repo;
import org.hibernate.grammars.hql.HqlParser;
import org.hibernate.type.descriptor.java.LocalDateTimeJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PatientInvestigationService {
    @Autowired
    private PatientInvestigationLevel1Repo patientInvestigationLevel1Repo;

    @Autowired
    private InvestigationLevel1Repo investigationLevel1Repo;

    public void savePatientInvestigationLevel1(PatientInvestigationRequestDto patientInvestigationRequestDto){
        Optional<InvestigationLevel1> investigationLevel1 = investigationLevel1Repo.findByInvestigation_level_id(patientInvestigationRequestDto.investigationLevel1Id);
        if(investigationLevel1.isPresent()){

//            PatientInvestigationLevel3 patientInvestigationLevel3 = PatientInvestigationLevel3.builder()
//                    .investigationLevel3(investigationLevel1)
//



            PatientInvestigationLevel1 patientInvestigationLevel1 =  PatientInvestigationLevel1.builder()
                    .investigation(investigationLevel1.get())
                    .patientId(patientInvestigationRequestDto.patientId)
                    .result("")
                    .comments("")
                    .entryDate(LocalDateTime.now())
                    .status("REQUESTED")
                    .build();

        }
//        patientInvestigationLevel1Repo.save(patientInvestigationLevel1);
    }

    public List<PatientInvestigationLevel1> getAllPatientInvestigations(){
        return patientInvestigationLevel1Repo.findAll();
    }

    public PatientInvestigationLevel1 getPatientInvestigationById(String patientInvestigationLevelId){
        return patientInvestigationLevel1Repo.findBypatientInvestigationLevel1Id(patientInvestigationLevelId);
    }
}
