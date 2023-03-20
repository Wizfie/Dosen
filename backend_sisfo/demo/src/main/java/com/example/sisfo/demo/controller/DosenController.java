package com.example.sisfo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sisfo.demo.model.Dosen;
import com.example.sisfo.demo.service.IDosenService;

@RestController
@CrossOrigin(origins = "http://localhost:8080/")
@RequestMapping("/api/dosen")
public class DosenController {
    @Autowired
    IDosenService dosenService;

    @PostMapping("/login")
    public Dosen loginDosen(@RequestBody Dosen dosen){
        return dosenService.loginDosen(dosen.getId(), dosen.getPassword());
    }

    @GetMapping("/getAll")
    public List<Dosen> getAllDosen() {
        return dosenService.getAllDosen();
    }
}
