package com.wuestenrot.demo.rest;

import com.wuestenrot.demo.api.Greeting;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/demo")
public class DemoRestController {

    @GetMapping("/greeting")
    public ResponseEntity<Greeting> greeting() {
        return ResponseEntity.ok(new Greeting("Hello", "N.N."));
    }


}
