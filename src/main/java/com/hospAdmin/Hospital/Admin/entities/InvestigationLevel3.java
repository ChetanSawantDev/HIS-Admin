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
public class InvestigationLevel3 {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String investigation_leve3_id;
    private String investigation_level3_name;
    private String unit;
    private String referenceRange;
    private String type;
}
