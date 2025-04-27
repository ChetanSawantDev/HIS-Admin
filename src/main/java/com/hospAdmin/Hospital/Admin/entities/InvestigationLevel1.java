package com.hospAdmin.Hospital.Admin.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InvestigationLevel1 {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String investigation_level_id;
    private String investigation_level1_name;
    private String unit;
    private String referenceRange;
    private String type;
    @OneToMany(cascade = CascadeType.ALL)
    private List<InvestigationLevel2> investigation_level2;
}
