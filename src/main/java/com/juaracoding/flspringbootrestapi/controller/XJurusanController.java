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

import com.juaracoding.flspringbootrestapi.dto.XJurusanDTO;
import com.juaracoding.flspringbootrestapi.model.XFakultas;
import com.juaracoding.flspringbootrestapi.model.XJurusan;
import com.juaracoding.flspringbootrestapi.repo.XJurusanRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jurusan")
public class XJurusanController {

    @Autowired
    XJurusanRepo jurusanRepo;

    @Autowired
    ModelMapper modelMapper;

    @GetMapping("/getAll")
    public List<XJurusanDTO> getAllData() {
        List<XJurusan> daftarJurusan = jurusanRepo.findAll();
        List<XJurusanDTO> daftarJurusanDTO = modelMapper.map(daftarJurusan, new TypeToken<List<XJurusanDTO>>() {}.getType());
        return daftarJurusanDTO;
    }

    @PostMapping("/input-jurusan")
    public String postJurusanList(@RequestBody List<XJurusan> jurusanDto) {
        jurusanRepo.saveAll(jurusanDto);
        return jurusanDto.size()+" data berhasil ditambahkan";
    }

}
