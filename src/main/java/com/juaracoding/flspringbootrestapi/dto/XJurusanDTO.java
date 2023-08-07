package com.juaracoding.flspringbootrestapi.dto;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 8/7/2023 2:51 PM
@Last Modified 8/7/2023 2:51 PM
Version 1.0
*/

public class XJurusanDTO {
    private String strJurusan;
    private XFakultasDTO fakultas;

    public String getStrJurusan() {
        return strJurusan;
    }

    public void setStrJurusan(String strJurusan) {
        this.strJurusan = strJurusan;
    }

    public XFakultasDTO getFakultas() {
        return fakultas;
    }

    public void setFakultas(XFakultasDTO fakultas) {
        this.fakultas = fakultas;
    }
}
