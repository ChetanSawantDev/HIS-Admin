package com.hospAdmin.Hospital.Admin.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PatientMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String patient_id;
    private String mrn_no;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String date_of_birth;
    private int age_in_years;
    private int age_in_months;
    private int age_in_days;
    private int gender;
    private String marital_status;
    private String blood_group;
    private String nationality;
    private String address;
    private String mobile_no;
    private String email_id;
    private String patient_status;
    private String patient_login;
    private String patient_password;
    private String country;;
    private String city;
    private String district;
    private String deceased_date;
    private String deceased_reason;

}
