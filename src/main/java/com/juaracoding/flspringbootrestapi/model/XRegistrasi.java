package com.juaracoding.flspringbootrestapi.model;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 7/31/2023 8:52 PM
@Last Modified 7/31/2023 8:52 PM
Version 1.0
*/

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "MstRegistrasi")
public class XRegistrasi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NIM", length = 10)
    private String nim;

    @NotEmpty(message = "tidak boleh kosong")
    @Column(name = "ProdiID")
    private Integer prodiId;

    @Column(name = "TanggalMasuk")
    private Date tanggalMasuk;

    @Column(name = "TanggalLulus")
    private Date tanggalLulus;

    @Column(name = "Status", length = 10)
    private String status;
}
