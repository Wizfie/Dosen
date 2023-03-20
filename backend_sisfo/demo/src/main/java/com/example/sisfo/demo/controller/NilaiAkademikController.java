package com.example.sisfo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sisfo.demo.model.NilaiAkademik;
import com.example.sisfo.demo.service.INilaiAkademikService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api/nilaiakademik")
public class NilaiAkademikController {
    @Autowired
    INilaiAkademikService nilaiAkademikService;

    @GetMapping("/getAll")
    public List<NilaiAkademik> getAllNilaiAkademik() {
        return nilaiAkademikService.getAllNilaiAkademik();
    }

    @GetMapping("/getNilaiId/{id}")
    public NilaiAkademik getNilaiId(@PathVariable String id) {
        return nilaiAkademikService.getNilaiId(id);
    }

    @GetMapping("/getSearch/{prodi}/{kelas}/{tahunakademik}")
    public List<NilaiAkademik> getSearch(@PathVariable String prodi,@PathVariable String kelas,@PathVariable int tahunakademik) {
        return nilaiAkademikService.getSearch(prodi, kelas, tahunakademik);
    }
}
