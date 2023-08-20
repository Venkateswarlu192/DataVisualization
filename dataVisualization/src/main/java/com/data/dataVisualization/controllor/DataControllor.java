package com.data.dataVisualization.controllor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.dataVisualization.entity.DataEntity;
import com.data.dataVisualization.repository.DataRepository;
import com.data.dataVisualization.service.DataService;

@RestController
@RequestMapping("/api")
public class DataControllor {

	@Autowired
	private DataService service;
	
	@PostMapping("/data")
	public DataEntity getAllData(DataEntity dataEntity) {
		return service.add(dataEntity);
	}
	
}
