package com.hospAdmin.Hospital.Admin.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InvestigationLevel1 {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String investigationLevelId;
    @Column(name = "investigation_level1_name")
    private String investigationLevel1Name;
    private String unit;
    private String referenceRange;
    private String type;
    @OneToMany(cascade = CascadeType.ALL)
    private List<InvestigationLevel2> investigation_level2;
}
