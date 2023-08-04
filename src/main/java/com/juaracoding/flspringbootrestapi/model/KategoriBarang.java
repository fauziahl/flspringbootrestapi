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

import javax.persistence.*;

@Entity
@Table(name = "MstKategoriBarang")
public class KategoriBarang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdKategoriBarang")
    private Long idKategoriBarang;
    @Column(name = "KategoriBarang")
    private String kategoriBarang;
    public Long getIdKategoriBarang() {
        return idKategoriBarang;
    }
    public void setIdKategoriBarang(Long idKategoriBarang) {
        this.idKategoriBarang = idKategoriBarang;
    }
    public String getKategoriBarang() {
        return kategoriBarang;
    }
    public void setKategoriBarang(String kategoriBarang) {
        this.kategoriBarang = kategoriBarang;
    }
}

