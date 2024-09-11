package com.neoteric.project.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "aadhar",schema = "swiggy1")
@Data

public class AadharEntity {
    public AadharEntity() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aadharnumber")
    public Integer aadharNumber;
    @Column(name = "name")
    public String name;
    @OneToMany(mappedBy =" myMappedbByTestEntity" )
    public AddressEntity addressEntity;

}


