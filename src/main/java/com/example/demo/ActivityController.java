package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {
    @RequestMapping(value = "/activity/save", method = RequestMethod.POST)
    public ResponseEntity<String> save () {
        return new ResponseEntity<String>("Save", HttpStatus.OK);
    }

    @RequestMapping(value = "/activity/publish", method = RequestMethod.POST)
    public ResponseEntity<String> publish () {
        return new ResponseEntity<String>("Publish", HttpStatus.OK);
    }

    @RequestMapping(value = "/activity/validate", method = RequestMethod.POST)
    public ResponseEntity<String> validate () {
        return new ResponseEntity<String>("Validate", HttpStatus.OK);
    }

    @RequestMapping(value = "/activity/execute", method = RequestMethod.POST)
    public ActivityResult execute () {
        return new ActivityResult("true");
    }
}
