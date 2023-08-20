package com.data.dataVisualization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.dataVisualization.entity.DataEntity;

@Repository
public interface DataRepository extends JpaRepository<DataEntity, Long> {

}
