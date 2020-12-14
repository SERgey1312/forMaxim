package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainAdminController {

    @GetMapping("/")
    public String getHomePage(){
        return "homepage";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public String getAdminpanel(org.springframework.ui.Model model){
        return "admin_panel";
    }


}
