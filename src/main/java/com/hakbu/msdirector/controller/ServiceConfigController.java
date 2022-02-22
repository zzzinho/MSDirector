package com.hakbu.msdirector.controller;

import java.util.List;

import javax.validation.Valid;

import com.hakbu.msdirector.DTO.ServiceConfigDTO.ServiceConfigRequest;
import com.hakbu.msdirector.model.ServiceConfig;
import com.hakbu.msdirector.service.ServiceConfigService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping(value = "/v1/service")
public class ServiceConfigController {
    private final ServiceConfigService serviceConfigService;

    public ServiceConfigController(ServiceConfigService serviceConfigService){
        this.serviceConfigService = serviceConfigService;
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public ResponseEntity<ServiceConfig> createServiceConfig(@Valid @RequestBody ServiceConfigRequest serviceConfigRequest) {
        ServiceConfig serviceConfig = serviceConfigService.createServiceConfig(serviceConfigRequest);
        return ResponseEntity.ok().body(serviceConfig);
    }

    @RequestMapping(value="", method=RequestMethod.GET)
    public ResponseEntity<List<ServiceConfig>> listServiceConfig() {
        List<ServiceConfig> services = serviceConfigService.findAll();
        return ResponseEntity.ok().body(services);
    }
    
    @RequestMapping(value="/{serviceId}", method=RequestMethod.GET)
    public ResponseEntity<ServiceConfig> findById(@PathVariable Long serviceId) {
        ServiceConfig serviceConfig = serviceConfigService.findById(serviceId);
        return ResponseEntity.ok().body(serviceConfig);
    }
}
