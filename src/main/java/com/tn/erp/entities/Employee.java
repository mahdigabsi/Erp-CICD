package com.tn.erp.entities;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Getter
@Setter
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String role;
    private String department;

}