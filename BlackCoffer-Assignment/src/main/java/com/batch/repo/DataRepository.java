package com.batch.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batch.entity.User;

public interface DataRepository extends JpaRepository<User, String> {
	List<User> findByEndYear(int endYear);

    List<User> findByTopic(String topic);

    List<User> findBySector(String sector);

    List<User> findByRegion(String region);

    List<User> findByPestle(String pestle);

    List<User> findBySource(String source);

    List<User> findBySwot(String swot);
    
//    List<User> findByCity(String city);
//    
//    List<User> FindByCountry(String country);
}
