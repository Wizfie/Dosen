package com.example.sisfo.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nilaiakademik")
public class NilaiAkademik {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int nim;

    @Column(columnDefinition = "TEXT")
    private String nama;

    @Column(columnDefinition = "TEXT")
    private String uts;

    @Column(columnDefinition = "TEXT")
    private String uas;

    @Column(columnDefinition = "TEXT")
    private String tugas;

    @Column(columnDefinition = "TEXT")
    private String kuis;

    @Column(columnDefinition = "TEXT")
    private String akhir;

    @Column(columnDefinition = "TEXT")
    private String huruf;

    private Double angka;

    @Column(columnDefinition = "TEXT")
    private String kodemk;

    @Column(columnDefinition = "TEXT")
    private String namamk;

    private int sks;

    private int tahunakademik;

    @Column(columnDefinition = "TEXT")
    private String prodi;

    @Column(columnDefinition = "TEXT")
    private String dosen;

    @Column(columnDefinition = "TEXT")
    private String kelas;

    @Column(columnDefinition = "TEXT")
    private String status;

    @Column(columnDefinition = "TEXT")
    private String statusmk;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUts() {
        return uts;
    }

    public void setUts(String uts) {
        this.uts = uts;
    }

    public String getUas() {
        return uas;
    }

    public void setUas(String uas) {
        this.uas = uas;
    }

    public String getTugas() {
        return tugas;
    }

    public void setTugas(String tugas) {
        this.tugas = tugas;
    }

    public String getKuis() {
        return kuis;
    }

    public void setKuis(String kuis) {
        this.kuis = kuis;
    }

    public String getAkhir() {
        return akhir;
    }

    public void setAkhir(String akhir) {
        this.akhir = akhir;
    }

    public String getHuruf() {
        return huruf;
    }

    public void setHuruf(String huruf) {
        this.huruf = huruf;
    }

    public Double getAngka() {
        return angka;
    }

    public void setAngka(Double angka) {
        this.angka = angka;
    }

    public String getKodemk() {
        return kodemk;
    }

    public void setKodemk(String kodemk) {
        this.kodemk = kodemk;
    }

    public String getNamamk() {
        return namamk;
    }

    public void setNamamk(String namamk) {
        this.namamk = namamk;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getTahunakademik() {
        return tahunakademik;
    }

    public void setTahunakademik(int tahunakademik) {
        this.tahunakademik = tahunakademik;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusmk() {
        return statusmk;
    }

    public void setStatusmk(String statusmk) {
        this.statusmk = statusmk;
    }

    

}
