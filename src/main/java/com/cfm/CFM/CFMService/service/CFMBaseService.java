package com.cfm.CFM.CFMService.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CFMBaseService {
    private final ModelMapper modelMapper;

    public CFMBaseService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    <S, T> List<T> mapList(List<S> source, Class<T> targetClass) {
        return source
                .stream()
                .map(element -> modelMapper.map(element, targetClass))
                .collect(Collectors.toList());
    }
}
