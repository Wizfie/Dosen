package com.example.sisfo.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sisfo.demo.model.Dosen;
import com.example.sisfo.demo.repository.IDosenRepository;
import com.example.sisfo.demo.service.IDosenService;

@Service
public class DosenService implements IDosenService {

    @Autowired
    IDosenRepository dosenRepository;

    @Override
    public Dosen loginDosen(String id, String password) {
        return dosenRepository.loginDosen(id, password);
    }

    @Override
    public List<Dosen> getAllDosen() {
        return dosenRepository.getAllDosen();
    }
    
}
