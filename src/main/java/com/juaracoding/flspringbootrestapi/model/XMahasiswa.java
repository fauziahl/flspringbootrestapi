//package com.juaracoding.flspringbootrestapi.model;
///*
//IntelliJ IDEA 2023.1.2 (Community Edition)
//Build #IC-231.9011.34, built on May 16, 2023
//@Author Asus a.k.a. Fauziah Latifah
//Java Developer
//Created on 7/24/2023 9:04 PM
//@Last Modified 7/24/2023 9:04 PM
//Version 1.0
//*/
//
//import java.util.Date;
//import java.util.List;
//import java.util.regex.Pattern;
//
//public class XMahasiswa {
//    private Long idMahasiswa;
//    private String namaMahasiswa;
//    private String jenisKelamin;
//    private Date tanggalLahir;
//    private List<XMataKuliah> xMataKuliahList;
//
//    public Long getIdMahasiswa() {
//        return idMahasiswa;
//    }
//
//    public void setIdMahasiswa(Long idMahasiswa) {
//        this.idMahasiswa = idMahasiswa;
//    }
//
//    public String getNamaMahasiswa() {
//        return namaMahasiswa;
//    }
//
//    public void setNamaMahasiswa(String namaMahasiswa) {
//        this.namaMahasiswa = namaMahasiswa;
//    }
//
//    public String getJenisKelamin() {
//        return jenisKelamin;
//    }
//
//    public void setJenisKelamin(String jenisKelamin) {
//        this.jenisKelamin = jenisKelamin;
//    }
//
//    public Date getTanggalLahir() {
//        return tanggalLahir;
//    }
//
//    public void setTanggalLahir(Date tanggalLahir) {
//        this.tanggalLahir = tanggalLahir;
//    }
//
//    public List<XMataKuliah> getxMataKuliahList() {
//        return xMataKuliahList;
//    }
//
//    public void setxMataKuliahList(List<XMataKuliah> xMataKuliahList) {
//        this.xMataKuliahList = xMataKuliahList;
//    }
//
//        public static Boolean emailValidation(String strInput)
//        {
//        if(Pattern.compile("^\\w{2,}$")
//        .matcher("bay9")
//        .matches())
//        {
////            System.out.println("VALID");
//            return true;
//        }else{
//           //System.out.println("TIDAK VALID");
//        }
//        return false;
//        }
//}
//
