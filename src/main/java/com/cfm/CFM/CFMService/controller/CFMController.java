package com.cfm.CFM.CFMService.controller;

import com.cfm.CFM.CFMService.dto.CFMUserDto;
import com.cfm.CFM.CFMService.model.Response;
import com.cfm.CFM.CFMService.service.CFMQTHTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/com/cfm/cfmservice")
public class CFMController {
    @Autowired
    private CFMQTHTService cfmqthtService;

    @GetMapping(value = {"/", "/testAPI"})
    public String testAPI() {
        return "Test API success";
    }

    @GetMapping(value = {"testGetUsetInDatabase"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public CFMUserDto testGetUsetInDatabase() {
        return cfmqthtService.testGetUsetInDatabase();
    }

    ResponseEntity<Object> createResponse(HttpStatus httpStatus, String errorCode, String jwt, String message) {
        Response result = new Response();
        result.setErrorCode(errorCode);
        result.setMessage(message);
        result.setJwt(jwt);

        return new ResponseEntity<>(result, httpStatus);
    }

    ResponseEntity<Object> createResponse(HttpStatus httpStatus, Response response) {
        return new ResponseEntity<>(response, httpStatus);
    }
}
