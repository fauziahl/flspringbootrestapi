package com.juaracoding.flspringbootrestapi.model;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 8/4/2023 9:21 PM
@Last Modified 8/4/2023 9:21 PM
Version 1.0
*/

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "MstBarang")
public class Barang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdBarang")
    @NotNull
    private Long idBarang;

    @Column(name = "NamaBarang")
    private String namaBarang;

    @Column(name = "Merk")
    private String merk;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IDKategoriBarang", referencedColumnName = "idkategoribarang")
    private KategoriBarang kategoriBarang;

    public KategoriBarang getKategoriBarang() {
        return kategoriBarang;
    }

    public void setKategoriBarang(KategoriBarang kategoriBarang) {
        this.kategoriBarang = kategoriBarang;
    }

    public Long getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(Long idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
}
