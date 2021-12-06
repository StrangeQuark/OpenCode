package com.t7s.opencode.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "api/java")
public class JavaController {

    private final JavaService javaService;

    @Autowired
    public JavaController(JavaService javaService) {
        this.javaService = javaService;
    }

    @PostMapping
    public String compileAndRunJava(@RequestBody String code) {
        String logs = javaService.runJava(code);

        return logs;
    }
}
