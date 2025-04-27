package com.hospAdmin.Hospital.Admin.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientInvestigationLevel3 {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String patientInvestigationLevel3Id;

    private Long patientId;

    private String result;

    @OneToOne
    @JoinColumn(name = "parent_investigation2_id")
    private PatientInvestigationLevel2 parentInvestigation2;

    @ManyToOne
    @JoinColumn(name = "investigation_level3_id")
    private InvestigationLevel3 investigationLevel3;

    private String status;
    private Long enteredBy;
    private LocalDateTime entryDate;
    private String comments;
}
