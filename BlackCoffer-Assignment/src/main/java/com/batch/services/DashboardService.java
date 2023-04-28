package com.batch.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batch.entity.User;
import com.batch.repo.DataRepository;

@Service
public class DashboardService {
	
	@Autowired
	private DataRepository dataRepository;
	
	public List<User> getDataByEndYear(int endYear) {
        return dataRepository.findByEndYear(endYear);
    }

    public List<User> getDataByTopic(String topic) {
        return dataRepository.findByTopic(topic);
    }

    public List<User> getDataBySector(String sector) {
        return dataRepository.findBySector(sector);
    }

    public List<User> getDataByRegion(String region) {
        return dataRepository.findByRegion(region);
    }

    public List<User> getDataByPestle(String pestle) {
        return dataRepository.findByPestle(pestle);
    }

    public List<User> getDataBySource(String source) {
        return dataRepository.findBySource(source);
    }

    public List<User> getDataBySwot(String swot) {
        return dataRepository.findBySwot(swot);
    }
    
//    public List<User> getDataByCity(String city){
//    	return dataRepository.findByCity(city);
//    }
//    
//    public List<User> getDataByCountry(String country){
//    	return dataRepository.findByCity(country);
//    }
}
