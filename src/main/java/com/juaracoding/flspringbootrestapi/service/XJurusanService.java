package com.juaracoding.flspringbootrestapi.service;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 8/4/2023 9:56 PM
@Last Modified 8/4/2023 9:56 PM
Version 1.0
*/

import com.juaracoding.flspringbootrestapi.core.IService;
import com.juaracoding.flspringbootrestapi.model.XJurusan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public class XJurusanService implements IService<XJurusan> {
    @Override
    public void mapColumn() {

    }

    @Override
    public Map<String, Object> save(XJurusan model, WebRequest request) {
        return null;
    }

    @Override
    public Map<String, Object> update(Long id, XJurusan model, WebRequest request) {
        return null;
    }

    @Override
    public Map<String, Object> delete(Long id, WebRequest request) {
        return null;
    }

    @Override
    public Map<String, Object> findAll(Pageable pageable, WebRequest request) {
        return null;
    }

    @Override
    public Map<String, Object> findByPage(Pageable pageable, WebRequest request, String columFirst, String valueFirst) {
        return null;
    }

    @Override
    public Map<String, Object> findById(Long id, WebRequest request) {
        return null;
    }

    @Override
    public Page<XJurusan> getDataByValue(Pageable pageable, String paramColumn, String paramValue) {
        return null;
    }

    @Override
    public List<XJurusan> getAllAkses() {
        return null;
    }

    @Override
    public Map<String, Object> uploadFile(List<XJurusan> listModel, MultipartFile multipartFile, WebRequest request) {
        return null;
    }

    @Override
    public List<XJurusan> dataToExport(WebRequest request, String columFirst, String valueFirst) {
        return null;
    }

    @Override
    public List<XJurusan> getDataToExport(String paramColumn, String paramValue) {
        return null;
    }
}
