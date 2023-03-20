package com.example.sisfo.demo.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.sisfo.demo.model.Dosen;
import com.example.sisfo.demo.repository.IDosenRepository;

@Repository
public class DosenRepository implements IDosenRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Dosen loginDosen(String id, String password) {
        String query = "SELECT * FROM dosen WHERE id = ? AND password = ?";
        return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Dosen.class), id, password);
    }

    @Override
    public List<Dosen> getAllDosen() {
        String query = "SELECT * FROM dosen";

        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Dosen.class));
    }

}
