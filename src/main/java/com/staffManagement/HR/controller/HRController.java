package com.staffManagement.HR.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HRController {

    @GetMapping("/hr")
    public String hrHome() {
        return "hr-home"; // make hr-home.html later
    }
}