package com.hospAdmin.Hospital.Admin.repositories;

import com.hospAdmin.Hospital.Admin.entities.PatientMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<PatientMaster,String> {
}
