package com.batch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batch.entity.User;
import com.batch.services.DashboardService;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

	@Autowired
	private DashboardService dashboardService;

	@GetMapping("/end-year/{endYear}")
	public List<User> getDataByEndYear(@PathVariable int endYear) {
		return dashboardService.getDataByEndYear(endYear);
	}

	@GetMapping("/topics/{topic}")
	public List<User> getDataByTopic(@PathVariable String topic) {
		return dashboardService.getDataByTopic(topic);
	}

	@GetMapping("/sector/{sector}")
	public List<User> getDataBySector(@PathVariable String sector) {
		return dashboardService.getDataBySector(sector);
	}

	@GetMapping("/region/{region}")
	public List<User> getDataByRegion(@PathVariable String region) {
		return dashboardService.getDataByRegion(region);
	}

	@GetMapping("/pestle/{pestle}")
	public List<User> getDataByPestle(@PathVariable String pestle) {
		return dashboardService.getDataByPestle(pestle);
	}

	@GetMapping("/source/{source}")
	public List<User> getDataBySource(@PathVariable String source) {
		return dashboardService.getDataBySource(source);
	}

	@GetMapping("/swot/{swot}")
	public List<User> getDataBySwot(@PathVariable String swot) {
		return dashboardService.getDataBySwot(swot);
	}

//    @GetMapping("/city/{city}")
//    public List<User> getDataByCity(@PathVariable String city) {
//        return dashboardService.getDataByCity(city);
//    }
//    
//    @GetMapping("/city/{city}")
//    public List<User> getDataByCountry(@PathVariable String country) {
//        return dashboardService.getDataBySwot(country);
//    }

}