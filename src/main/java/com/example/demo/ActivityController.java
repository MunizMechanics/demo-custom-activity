package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<String> save (@RequestBody Map<String, Object> payload) {
        return new ResponseEntity<String>("Save", HttpStatus.OK);
    }

    @RequestMapping(value = "/publish", method = RequestMethod.POST)
    public ResponseEntity<String> publish (@RequestBody Map<String, Object> payload) {
        return new ResponseEntity<String>("Publish", HttpStatus.OK);
    }

    @RequestMapping(value = "/validate", method = RequestMethod.POST)
    public ResponseEntity<String> validate (@RequestBody Map<String, Object> payload) {
        return new ResponseEntity<String>("Validate", HttpStatus.OK);
    }

    @RequestMapping(value = "/execute", method = RequestMethod.POST)
    public ActivityResult execute (@RequestBody Map<String, Object> payload) {
        return new ActivityResult("true");
    }
}
