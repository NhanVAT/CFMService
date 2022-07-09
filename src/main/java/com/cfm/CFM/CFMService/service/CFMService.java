package com.cfm.CFM.CFMService.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CFMService extends CFMBaseService {

    public CFMService(ModelMapper modelMapper) {
        super(modelMapper);
    }

}
