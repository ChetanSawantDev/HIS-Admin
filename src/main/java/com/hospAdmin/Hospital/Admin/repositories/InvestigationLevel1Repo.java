package com.hospAdmin.Hospital.Admin.repositories;

import com.hospAdmin.Hospital.Admin.entities.InvestigationLevel1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InvestigationLevel1Repo extends JpaRepository<InvestigationLevel1, String> {
    Optional<InvestigationLevel1> findByInvestigation_level_id(String investigation_level_id);

}
