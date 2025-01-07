/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author NURFAUZIYAH
 */

import javax.persistence.*;

@Entity
@Table(name = "tb_karyawan")

public class Karyawan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_karyawan")
    private int id_karyawan;
    @Column(name="nama_karyawan")
    private String nama_karyawan;
    @Column(name="jabatan")
    private String jabatan;
    @Column(name="no_telp")
    private String no_telp;
    @Column(name="alamat")
    private String alamat;
    @Column(name="status")
    private String status;
    
    // Getter and Setter
    public int getID() {
        return id_karyawan;
    }
    
    public String getNama() {
        return nama_karyawan;
    }
    
    public void setNama(String nama_karyawan) {
        this.nama_karyawan = nama_karyawan;
    }
    
    public String getJabatan() {
        return jabatan;
    }
    
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    public String getNo_telp() {
        return no_telp;
    }
    
    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
