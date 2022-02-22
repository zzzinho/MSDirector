package com.hakbu.msdirector.service;

import java.util.List;

import com.hakbu.msdirector.DTO.ServiceConfigDTO.ServiceConfigRequest;
import com.hakbu.msdirector.model.ServiceConfig;
import com.hakbu.msdirector.repository.ServiceConfigRepository;

import org.springframework.transaction.annotation.Transactional;
import org.webjars.NotFoundException;

@Transactional
public class ServiceConfigServiceImpl implements ServiceConfigService {
    private final ServiceConfigRepository serviceConfigRepository;

    public ServiceConfigServiceImpl(ServiceConfigRepository serviceConfigRepository){
        this.serviceConfigRepository = serviceConfigRepository;
    }

    @Override
    public List<ServiceConfig> findAll() {
        return serviceConfigRepository.findAll();
    }
    public ServiceConfig createServiceConfig(ServiceConfigRequest serviceConfigRequest){
        List<ServiceConfig> nexts = serviceConfigRepository.findAllById(serviceConfigRequest.getNextService());
        ServiceConfig serviceConfig =   ServiceConfig.builder().serviceId(serviceConfigRequest.getServiceId())
                                                                .type(serviceConfigRequest.getType())
                                                                .name(serviceConfigRequest.getName())
                                                                .inputType(serviceConfigRequest.getInputType())
                                                                .outputType(serviceConfigRequest.getOutputType())
                                                                .errorHandling(serviceConfigRequest.getErrorHandling())
                                                                .nextService(nexts)
                                                                .method(serviceConfigRequest.getMethod())
                                                                .url(serviceConfigRequest.getUrl())
                                                                .dockerAddress(serviceConfigRequest.getDockerAddress())
                                                                .build();
                                                         
                                                        
        return serviceConfig;
    }

    @Override
    public ServiceConfig findById(Long id) {
        return serviceConfigRepository.findById(id).orElseThrow(() -> new NotFoundException("wrong id"));
    }
}
