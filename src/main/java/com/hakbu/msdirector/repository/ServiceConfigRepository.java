package com.hakbu.msdirector.repository;

import java.util.List;

import com.hakbu.msdirector.model.ServiceConfig;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceConfigRepository extends CrudRepository<ServiceConfig, Long> {
    List<ServiceConfig> findAll();    
    List<ServiceConfig> findAllById(List<Long> ids);
}
