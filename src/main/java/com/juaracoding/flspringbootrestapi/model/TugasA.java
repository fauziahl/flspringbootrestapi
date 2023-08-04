package com.juaracoding.flspringbootrestapi.model;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 8/4/2023 2:49 PM
@Last Modified 8/4/2023 2:49 PM
Version 1.0
*/

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "MstTugasA")
public class TugasA {
    @Id
    @Column(name = "IDTugasA")
    @NotNull
    @NotEmpty
    @NotBlank
    private String id;

    @Column(name = "Nama", length = 40, nullable = false)
    @NotNull
    @NotEmpty
    @NotBlank
    private String nama;

    @Column(name = "Alamat", length = 500, nullable = false)
    @NotNull
    @NotEmpty
    @NotBlank
    private String alamat;

    @Column(name = "TanggalLahir", nullable = false)
    private LocalDate tanggalLahir;

    @Column(name = "JenisKelamin", nullable = false)
    @NotNull
    @NotEmpty
    @NotBlank
    private Character jenisKelamin;

    @Column(name = "MasihHidup", nullable = false, columnDefinition = "bit")
    private Integer masihHidup;

    @Column(name = "CreatedDate", length = 7, nullable = false)
    private Date createdDate = new Date();

    @Column(name = "CreatedBy", nullable = false)
    @NotNull
    private Integer createdBy = 1;

    @Column(name = "ModifiedDate", length = 7)
    private Date modifiedDate;

    @Column(name = "ModifiedBy")
    private Integer modifiedBy;

    @Column(name = "IsDelete", nullable = false)
    private Byte isDelete = 0;

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

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Character getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(Character jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Integer getMasihHidup() {
        return masihHidup;
    }

    public void setMasihHidup(Integer masihHidup) {
        this.masihHidup = masihHidup;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}
