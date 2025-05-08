package com.electroapp.electro_app.infrastructure.repository.country;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.electroapp.electro_app.application.services.ICityService;
import com.electroapp.electro_app.domain.entities.City;

@Service
public class CityImpl implements ICityService {
    @Autowired
    private CityRepository repository;

    @Transactional(readOnly = true)
    @Override
    public List<City> findAll() {
        return (List<City>) repository.findAll();
    }

    @Override
    public Optional<City> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public City save(City City) {
        return repository.save(City);
    }

    @Override
    public Optional<City> update(Long id, City City) {
        Optional<City> CityOld = repository.findById(id);
        if(CityOld.isPresent()){
            City CityDb = CityOld.orElseThrow();
            CityDb.setName(City.getName());
            return Optional.of(repository.save(CityDb));
        }
        return Optional.empty();
    }

    @Override
    public Optional<City> delete(Long id) {
        Optional<City> CityOptional = repository.findById(id);
        CityOptional.ifPresent(CitytDb -> {
            repository.delete(CitytDb);
        });
        return CityOptional;        
    }

}
