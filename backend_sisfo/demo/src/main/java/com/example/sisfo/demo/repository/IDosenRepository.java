package com.example.sisfo.demo.repository;

import java.util.List;

import com.example.sisfo.demo.model.Dosen;

public interface IDosenRepository {
    public Dosen loginDosen (String id, String password); 
    public List<Dosen> getAllDosen();  
} 
