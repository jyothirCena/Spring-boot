package com.jyothir.local.controller;

import com.jyothir.local.dto.ServiceRequestDto;
import com.jyothir.local.dto.ServiceResponseDto;
import com.jyothir.local.mapper.ServiceMapper;
import com.jyothir.local.model.ServiceList;
import com.jyothir.local.service.ServiceListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/service")
public class ServiceController {

    @Autowired
    private ServiceListService serviceListService;

    @PostMapping
    public ResponseEntity<ServiceResponseDto> createService(@RequestBody ServiceRequestDto requestDto){
        ServiceList service = serviceListService.createService(requestDto);
        ServiceResponseDto savedService = ServiceMapper.mapToServiceResponseDto(service);
        return new ResponseEntity<>(savedService, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ServiceList> getServiceById(@PathVariable("id") int serviceId){
        return ResponseEntity.ok(serviceListService.getServiceById(serviceId));
    }

    @GetMapping("/all")
    public ResponseEntity<List<ServiceList>> getAllServices(){
        return ResponseEntity.ok(serviceListService.getAllServices());
    }
}
