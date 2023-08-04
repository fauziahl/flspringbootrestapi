package com.juaracoding.flspringbootrestapi.repo;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 7/27/2023 3:34 PM
@Last Modified 7/27/2023 3:34 PM
Version 1.0
*/

import com.juaracoding.flspringbootrestapi.model.Peserta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface PesertaRepo extends JpaRepository<Peserta,Integer> {
    List<Peserta> findByNama(String nama);
    void deleteById(Integer id);
    void deleteByNama(String nama);
    Integer countByBatch(String batch);
    List<Peserta> findTop4ByBatch(String batch);
    List<Peserta> findDistinctByBatch (String batch);
    List<Peserta> findTop4ByBatchAndAlamatContaining(String batch, String alamatMengandung);
    List<Peserta> findTop4ByBatchAndAlamatContains(String batch, String alamatMengandung);

    @Query(value = "SELECT * FROM cobaJPA.Peserta WHERE nama = ?1 and batch = ?2", nativeQuery = true)
    List<Peserta> xFindNameBatch(String nama, String batch);



}

