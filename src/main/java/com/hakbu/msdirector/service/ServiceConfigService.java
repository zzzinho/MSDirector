package com.hakbu.msdirector.service;

import java.util.List;

import com.hakbu.msdirector.DTO.ServiceConfigDTO.ServiceConfigRequest;
import com.hakbu.msdirector.model.ServiceConfig;

import org.springframework.stereotype.Service;

@Service
public interface ServiceConfigService {
    public List<ServiceConfig> findAll();
    public ServiceConfig createServiceConfig(ServiceConfigRequest serviceConfigRequest);
    public ServiceConfig findById(Long id);
}
