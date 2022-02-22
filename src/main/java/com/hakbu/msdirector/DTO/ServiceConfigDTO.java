package com.hakbu.msdirector.DTO;

import java.net.URL;
import java.util.List;

import javax.validation.constraints.NotBlank;

import com.hakbu.msdirector.model.BCE;
import com.hakbu.msdirector.model.Method;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ServiceConfigDTO {
    @Getter
    @Setter
    @NoArgsConstructor
    public static class ServiceConfigRequest{
        @NotBlank
        private String serviceId;
        private BCE type;
        @NotBlank
        private String name;
        private String inputType;
        private String outputType;
        private String errorHandling;
        private List<Long> nextService;
        private Method method;
        private URL url;
        private URL dockerAddress;
    }
}
