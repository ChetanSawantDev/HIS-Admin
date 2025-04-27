package com.hospAdmin.Hospital.Admin.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InvestigationLevel2 {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String investigation_leve2_id;
    private String investigation_level2_name;
    private String unit;
    private String referenceRange;
    private String type;
    @OneToMany(cascade = CascadeType.ALL)
    private List<InvestigationLevel3> investigation_level3;
}
