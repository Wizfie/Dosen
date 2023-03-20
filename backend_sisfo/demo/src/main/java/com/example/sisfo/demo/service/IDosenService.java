package com.example.sisfo.demo.service;

import java.util.List;

import com.example.sisfo.demo.model.Dosen;

public interface IDosenService {
    public Dosen loginDosen (String id, String password);
    public List<Dosen> getAllDosen();
}
