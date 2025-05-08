package com.electroapp.electro_app.application.services;

import java.util.List;
import java.util.Optional;

import com.electroapp.electro_app.domain.entities.City;

public interface ICityService {
    List<City> findAll();

    Optional<City> findById(Long id);

    City save(City City);
    
    Optional<City> update(Long id, City City);

    Optional<City> delete(Long id);    
 

}
