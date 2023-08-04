package com.juaracoding.flspringbootrestapi.controller;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 8/1/2023 5:33 PM
@Last Modified 8/1/2023 5:33 PM
Version 1.0
*/

import com.juaracoding.flspringbootrestapi.model.XFakultas;
import com.juaracoding.flspringbootrestapi.repo.XFakultasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fakultas")
public class XFakultasController {

    @Autowired
    XFakultasRepo fakultasRepo;

    @GetMapping("/getAll")
    public List<XFakultas> getAllData() {
        List<XFakultas> daftarFakultas = fakultasRepo.findAll();
        return daftarFakultas;
    }

    @PostMapping("/input-fakultas")
    public String postFakultasList(@RequestBody List<XFakultas> fakultas) {
        fakultasRepo.saveAll(fakultas);
        return fakultas.size()+" data berhasil ditambahkan";
    }

}
