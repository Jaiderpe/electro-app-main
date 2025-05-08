package com.electroapp.electro_app.infrastructure.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electroapp.electro_app.application.services.IRegionService;
import com.electroapp.electro_app.domain.entities.Region;

@RestController
@RequestMapping("/api/region")
public class RegionController {
    @Autowired
    private IRegionService RegionService;

    @GetMapping
    public List<Region> list() {
        return RegionService.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> view(@PathVariable Long id) {
        Optional<Region> RegionOptional = RegionService.findById(id);
        if (RegionOptional.isPresent()) {
            return ResponseEntity.ok(RegionOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Region Region) {
        return ResponseEntity.status(HttpStatus.CREATED).body(RegionService.save(Region));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Optional<Region> RegionOptional = RegionService.delete(id);
        if (RegionOptional.isPresent()) {
            return ResponseEntity.ok(RegionOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

}
