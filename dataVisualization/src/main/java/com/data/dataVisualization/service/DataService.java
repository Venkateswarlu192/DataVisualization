package com.data.dataVisualization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.dataVisualization.entity.DataEntity;
import com.data.dataVisualization.repository.DataRepository;


@Service
public class DataService {

	@Autowired
	private DataRepository repository;
	
	public DataEntity add(DataEntity entity) {
		return repository.save(entity);
	}
	
}
