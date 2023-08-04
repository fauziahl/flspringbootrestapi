package com.juaracoding.flspringbootrestapi.service;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 8/4/2023 9:18 PM
@Last Modified 8/4/2023 9:18 PM
Version 1.0
*/

import com.juaracoding.flspringbootrestapi.core.IService;
import com.juaracoding.flspringbootrestapi.model.Barang;
import com.juaracoding.flspringbootrestapi.repo.BarangRepo;
import com.juaracoding.flspringbootrestapi.util.TransformToDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    PLATFORM CODE 01 -> misal 01 kode untuk Internal Perusahaan X
    MODUL CODE 11

    FV -> UNTUK GAGAL VALIDASI
    FE -> UNTUK ERROR
    FV-01-11-002
 */
@Service
@Transactional
public class BarangService implements IService<Barang> {
    private BarangRepo barangRepo;
    private String[] strExceptionArr = new String[2];
    @Autowired
    private ModelMapper modelMapper;
    private Map<String,Object> objectMapper = new HashMap<String,Object>();
    private TransformToDTO transformToDTO = new TransformToDTO();
    private Map<String,String> mapColumnSearch = new HashMap<String,String>();

    private Map<Integer, Integer> mapItemPerPage = new HashMap<Integer, Integer>();

    public BarangService(BarangRepo barangRepo) {
        mapColumn();
        strExceptionArr[0] = "BarangService";
        this.barangRepo = barangRepo;
    }

    @Override
    public void mapColumn() {
        mapColumnSearch.put("id","ID AKSES");
        mapColumnSearch.put("nama","NAMA AKSES");
    }

    @Override
    public Map<String, Object> save(Barang model, WebRequest request) {
        return null;
    }
    @Override
    public Map<String, Object> update(Long id, Barang model, WebRequest request) {
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
    public Map<String, Object> findByPage(Pageable pageable, WebRequest request,
                                          String columFirst, String valueFirst) {
        return null;
    }
    @Override
    public Map<String, Object> findById(Long id, WebRequest request) {
        return null;
    }

    @Override
    public Page<Barang> getDataByValue(Pageable pageable, String paramColumn, String paramValue) {
        return null;
    }

    @Override
    public List<Barang> getAllAkses() {
        return null;
    }

    @Override
    public Map<String, Object> uploadFile(List<Barang> listModel, MultipartFile multipartFile, WebRequest request) {
        return null;
    }

    @Override
    public List<Barang> dataToExport(WebRequest request, String columFirst, String valueFirst) {
        return null;
    }

    @Override
    public List<Barang> getDataToExport(String paramColumn, String paramValue) {
        return null;
    }
}

