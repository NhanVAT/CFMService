package com.cfm.CFM.CFMService.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CFMDanhMucService extends CFMBaseService {
    public CFMDanhMucService(ModelMapper modelMapper) {
        super(modelMapper);
    }
}
