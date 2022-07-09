package com.cfm.CFM.CFMService.service;

import com.cfm.CFM.CFMService.dto.CFMUserDto;
import com.cfm.CFM.CFMService.repository.CFMUserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CFMQTHTService extends CFMBaseService {
    private final CFMUserRepository cfmUserRepository;

    public CFMQTHTService(ModelMapper modelMapper, CFMUserRepository cfmUserRepository) {
        super(modelMapper);
        this.cfmUserRepository = cfmUserRepository;
    }

    public CFMUserDto testGetUsetInDatabase() {
        CFMUserDto result = new CFMUserDto();
        try {
//            List<CFMUser> cfmUsers = this.cfmUserRepository.findByLogin("admin");
//
//            result = this.mapList(cfmUsers, CFMUserDto.class).get(0);

        } catch (Exception ex) {
            return null;
        }
        return result;
    }
}
