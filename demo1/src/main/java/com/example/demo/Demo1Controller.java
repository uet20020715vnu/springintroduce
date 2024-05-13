package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController

public class Demo1Controller {
    @GetMapping("/student")
    public String getStudent(@RequestParam String name) {
        return name;
    }
        @PostMapping("/student")
        public String postStudent(@RequestBody String name) {
            return name + " is a student";
        }
    @GetMapping("/student/{stt}")
    public String sttStudent(@PathVariable("stt") String stt) {
        return stt + "tuoi";
    }
}
