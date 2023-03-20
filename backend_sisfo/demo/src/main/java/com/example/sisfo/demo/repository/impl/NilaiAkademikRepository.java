package com.example.sisfo.demo.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.sisfo.demo.model.NilaiAkademik;
import com.example.sisfo.demo.repository.INilaiAkademikRepository;

@Repository
public class NilaiAkademikRepository implements INilaiAkademikRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public List<NilaiAkademik> getAllNilaiAkademik() {
        String query = "SELECT * FROM nilaiakademik";

        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(NilaiAkademik.class));
    }


    @Override
    public NilaiAkademik getNilaiId(String id) {
        String query = "SELECT * FROM nilaiakademik WHERE id = ?";

        return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(NilaiAkademik.class), id);
    }


    @Override
    public List<NilaiAkademik> getSearch(String prodi, String kelas, int tahunakademik) {
        String query = "SELECT * FROM nilaiakademik WHERE prodi= ? AND kelas= ? AND tahunakademik= ?";

        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(NilaiAkademik.class), prodi, kelas, tahunakademik);
    }


    
    
}
