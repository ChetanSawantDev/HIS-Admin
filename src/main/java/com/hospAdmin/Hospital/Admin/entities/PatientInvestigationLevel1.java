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
public class PatientInvestigationLevel1 {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String patientInvestigationLevel1Id;

    private String patientId;

    private String result;

    @OneToOne
    @JoinColumn(name = "investigation_level1_id")
    private InvestigationLevel1 investigation;

    private String status;
    private Long enteredBy;
    private LocalDateTime entryDate;
    private String comments;
    @OneToMany(mappedBy = "parentInvestigation1",cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<PatientInvestigationLevel2> patientInvestigationLevel2List;
}
