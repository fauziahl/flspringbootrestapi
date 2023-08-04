package com.juaracoding.flspringbootrestapi.model;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 8/1/2023 5:06 PM
@Last Modified 8/1/2023 5:06 PM
Version 1.0
*/

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "MstFakultas")
public class XFakultas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FakultasId")
    private Integer id;

    @Column(name = "Fakultas", length = 50, nullable = false, unique = true)
    private String strFakultas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStrFakultas() {
        return strFakultas;
    }

    public void setStrFakultas(String strFakultas) {
        this.strFakultas = strFakultas;
    }
}
