package com.hospAdmin.Hospital.Admin.repositories;

import com.hospAdmin.Hospital.Admin.entities.PatientInvestigationLevel3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientInvestigationLevel3Repo extends JpaRepository<PatientInvestigationLevel3, String> {
}
