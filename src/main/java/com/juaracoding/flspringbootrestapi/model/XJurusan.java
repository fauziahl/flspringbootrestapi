package com.juaracoding.flspringbootrestapi.model;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 8/1/2023 5:11 PM
@Last Modified 8/1/2023 5:11 PM
Version 1.0
*/

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "MstJurusan")

public class XJurusan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JurusanId")
    private Integer id;

    @Column(name = "Jurusan", length = 50, nullable = false, unique = true)
    private String strJurusan;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FakultasId", referencedColumnName = "FakultasId", nullable = false)
    private XFakultas fakultas;

    public XFakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(XFakultas fakultas) {
        this.fakultas = fakultas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStrJurusan() {
        return strJurusan;
    }

    public void setStrJurusan(String strJurusan) {
        this.strJurusan = strJurusan;
    }
}
