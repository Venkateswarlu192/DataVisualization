package com.data.dataVisualization.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table
public class DataEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int intensity;
    private int likelihood;
    private int relevance;
    private int year;
    private String country;
    private String topics;
    private String region;
    private String city;
    
}
