package com.cfm.CFM.CFMService.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CFMQTHTService extends CFMBaseService{
    public CFMQTHTService(ModelMapper modelMapper) {
        super(modelMapper);
    }
}
