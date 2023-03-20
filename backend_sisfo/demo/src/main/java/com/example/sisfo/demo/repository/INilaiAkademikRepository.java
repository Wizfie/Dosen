package com.example.sisfo.demo.repository;

import java.util.List;

import com.example.sisfo.demo.model.NilaiAkademik;

public interface INilaiAkademikRepository {
    public List<NilaiAkademik> getAllNilaiAkademik();
    public NilaiAkademik getNilaiId(String id); 
    public List<NilaiAkademik> getSearch(String prodi, String kelas, int tahunakademik);
}
