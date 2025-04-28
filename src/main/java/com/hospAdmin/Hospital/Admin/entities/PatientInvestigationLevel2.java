package com.hospAdmin.Hospital.Admin.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientInvestigationLevel2 {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String patientInvestigationLevel2Id;

    private String patientId;

    private String result;

    @OneToOne
    @JoinColumn(name = "investigation_level2_id")
    private InvestigationLevel2 investigationLevel2;

    @ManyToOne
    @JoinColumn(name = "parent_investigation1_id")
    private PatientInvestigationLevel1 parentInvestigation1;

    private String comments;
    @OneToMany(mappedBy = "parentInvestigation2",cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<PatientInvestigationLevel3> patientInvestigationLevel3List;
}
