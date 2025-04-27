package com.hospAdmin.Hospital.Admin.repositories;

import com.hospAdmin.Hospital.Admin.entities.InvestigationLevel2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestigationLevel2Repo extends JpaRepository<InvestigationLevel2, String> {
}
