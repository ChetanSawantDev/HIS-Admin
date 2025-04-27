package com.hospAdmin.Hospital.Admin.repositories;

import com.hospAdmin.Hospital.Admin.entities.PatientInvestigationLevel1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientInvestigationLevel1Repo extends JpaRepository<PatientInvestigationLevel1,String> {
    PatientInvestigationLevel1 findBypatientInvestigationLevel1Id(String patientInvestigationLevel1Id);
}
