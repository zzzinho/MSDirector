package com.hakbu.msdirector.model;

import java.net.URL;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ServiceConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String serviceId;
    private BCE type;
    private String name;
    private String inputType;
    private String outputType;
    private String errorHandling;
    private List<ServiceConfig> nextService;
    private Method method;
    private URL url;
    private URL dockerAddress;
}
