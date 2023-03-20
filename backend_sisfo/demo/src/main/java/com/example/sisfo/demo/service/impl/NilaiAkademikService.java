package com.example.sisfo.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sisfo.demo.model.NilaiAkademik;
import com.example.sisfo.demo.repository.INilaiAkademikRepository;
import com.example.sisfo.demo.service.INilaiAkademikService;

@Service
public class NilaiAkademikService implements INilaiAkademikService {

    @Autowired
    INilaiAkademikRepository nilaiAkademikRepository;

    @Override
    public List<NilaiAkademik> getAllNilaiAkademik() {
        return nilaiAkademikRepository.getAllNilaiAkademik();
    }

    @Override
    public NilaiAkademik getNilaiId(String id) {
        return nilaiAkademikRepository.getNilaiId(id);
    }

    @Override
    public List<NilaiAkademik> getSearch(String prodi, String kelas, int tahunakademik) {
        return nilaiAkademikRepository.getSearch(prodi, kelas, tahunakademik);
    }

    
    
}
