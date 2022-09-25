package com.centime.assignment.service;

import com.centime.assignment.model.PersonName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.actuate.health.Health;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceThreeService {

    private static final Logger LOG = LogManager.getLogger(ServiceThreeService.class);

    public ResponseEntity<String> checkServiceHealth() {
        LOG.info("inside service up service method.");
        return new ResponseEntity<>(Health.up().build().getStatus().toString(), HttpStatus.OK);
    }
    public ResponseEntity<String> getConcatenatedString(PersonName personName) {
        LOG.info("inside concatenate service method.");
        return new ResponseEntity<>(personName.getName() + " " + personName.getSurname(), HttpStatus.OK);
    }
}
