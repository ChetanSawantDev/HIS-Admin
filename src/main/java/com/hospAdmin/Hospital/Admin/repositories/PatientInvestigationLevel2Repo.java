package com.hospAdmin.Hospital.Admin.repositories;

import com.hospAdmin.Hospital.Admin.entities.PatientInvestigationLevel2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientInvestigationLevel2Repo extends JpaRepository<PatientInvestigationLevel2,String> {
}
