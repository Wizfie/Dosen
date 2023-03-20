package com.example.sisfo.demo.service;

import java.util.List;

import com.example.sisfo.demo.model.NilaiAkademik;

public interface INilaiAkademikService {
    public List<NilaiAkademik> getAllNilaiAkademik();
    public NilaiAkademik getNilaiId(String id);
    public List<NilaiAkademik> getSearch(String prodi, String kelas, int tahunakademik);
}
