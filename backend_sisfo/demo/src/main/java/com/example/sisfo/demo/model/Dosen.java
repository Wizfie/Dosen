package com.example.sisfo.demo.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dosen")
public class Dosen {

    @Id
    private String id;

    @Column(columnDefinition = "TEXT")
    private String nama;

    @Column(columnDefinition = "TEXT")
    private String jengkel;

    @Column(columnDefinition = "TEXT")
    private String status;

    @Column(columnDefinition = "TEXT")
    private String email;

    @Column(columnDefinition = "TEXT")
    private String hp;

    @Column(columnDefinition = "TEXT")
    private String tlahir;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date tanglahir;

    @Column(columnDefinition = "TEXT")
    private String alamat;

    @Column(columnDefinition = "TEXT")
    private String namanpwp;

    @Column(columnDefinition = "TEXT")
    private String nomornpwp;

    @Column(columnDefinition = "TEXT")
    private String bank;

    @Column(columnDefinition = "TEXT")
    private String norek;

    @Column(columnDefinition = "TEXT")
    private String ktp;

    @Column(columnDefinition = "TEXT")
    private String pendidikan;

    @Column(columnDefinition = "TEXT")
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJengkel() {
        return jengkel;
    }

    public void setJengkel(String jengkel) {
        this.jengkel = jengkel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getTlahir() {
        return tlahir;
    }

    public void setTlahir(String tlahir) {
        this.tlahir = tlahir;
    }

    public Date getTanglahir() {
        return tanglahir;
    }

    public void setTanglahir(Date tanglahir) {
        this.tanglahir = tanglahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNamanpwp() {
        return namanpwp;
    }

    public void setNamanpwp(String namanpwp) {
        this.namanpwp = namanpwp;
    }

    public String getNomornpwp() {
        return nomornpwp;
    }

    public void setNomornpwp(String nomornpwp) {
        this.nomornpwp = nomornpwp;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getNorek() {
        return norek;
    }

    public void setNorek(String norek) {
        this.norek = norek;
    }

    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    

    
}
