package com.centime.assignment.controller;

import com.centime.assignment.model.PersonName;
import com.centime.assignment.service.ServiceThreeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service-three")
public class ServiceThreeController {

    private static final Logger LOG = LogManager.getLogger(ServiceThreeController.class);

    @Autowired
    private ServiceThreeService serviceThreeService;

    @GetMapping("/health")
    public ResponseEntity<String> checkServiceHealth() {
        LOG.info("inside service health controller method.");
        return serviceThreeService.checkServiceHealth();
    }


    @PostMapping("/concatenate")
    public ResponseEntity<String> getConcatenatedString(@RequestBody PersonName personName) {
        LOG.info("inside concatenate controller method.");
        return serviceThreeService.getConcatenatedString(personName);
    }
}
