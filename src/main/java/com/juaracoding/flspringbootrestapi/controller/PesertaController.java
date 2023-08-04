package com.juaracoding.flspringbootrestapi.controller;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 7/27/2023 3:35 PM
@Last Modified 7/27/2023 3:35 PM
Version 1.0
*/

import com.juaracoding.flspringbootrestapi.model.Peserta;
import com.juaracoding.flspringbootrestapi.repo.PesertaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/peserta")
public class PesertaController {

    @Autowired
    PesertaRepo pesertaRepo;

    @GetMapping("/")
    public List<Peserta> getAllData() {
        List<Peserta> daftarPeserta = pesertaRepo.findAll();
        return daftarPeserta;
    }

    @PostMapping("/")
    public String postData(@RequestBody Peserta peserta) {
        pesertaRepo.save(peserta);
        return peserta.getNama() + " berhasil ditambahkan";
    }

    @PostMapping("/batch")
    public String postDataList(@RequestBody List<Peserta> peserta) {
        pesertaRepo.saveAll(peserta);
        return peserta.size()+" data berhasil ditambahkan";
    }

    @GetMapping("/search-peserta-by-nama")
    public List<Peserta> searchPesertaByNama(@RequestParam(value = "nama") String nama) {
        List<Peserta> hasil = pesertaRepo.findByNama(nama);
        return hasil;
    }

    @GetMapping("/search-peserta-by-id")
    public Peserta searchPesertaById(@RequestParam(value = "nama") Integer id) {
        Optional<Peserta> hasil = pesertaRepo.findById(id);
        return hasil.get();
    }

    @PostMapping("/delete-peserta-by-id")
    public String deletePesertaById(@RequestParam(value = "id") Integer id) {
        pesertaRepo.deleteById(id);
        return "data berhasil dihapus";
    }

    @PostMapping("/delete-peserta-by-nama")
    public String deletePesertaByNama(@RequestParam(value = "nama") String nama) {
        pesertaRepo.deleteByNama(nama);
        return "Peserta bernama " + nama + " berhasil dihapus";
    }

    @DeleteMapping("/delete-peserta-by-id/{id}")
    public String deletePesertaId(@PathVariable(value = "id") Integer id) {
        pesertaRepo.deleteById(id);
        return "peserta dengan ID "+id+" berhasil dihapus";
    }
    @PostMapping("/hitung-peserta-batch")
    public Integer hitungPesertaBatch(@RequestParam(value = "batch") String batch) {
        Integer hasil = pesertaRepo.countByBatch(batch);
        return hasil;
    }

    @GetMapping("/findtop/{batch}")
    public List<Peserta> findTop4ByBatch(@PathVariable(value = "batch") String batch) {
        List<Peserta> peserta = pesertaRepo.findTop4ByBatch(batch);
        return peserta;
    }

    @GetMapping("/distinct/{batch}")
    public List<Peserta> findDistinctByBatch(@PathVariable(value = "batch") String batch) {
        List<Peserta> peserta = pesertaRepo.findDistinctByBatch(batch);
        return peserta;
    }

    @GetMapping("/search-4-peserta-by-batch-and-kota")
    public List<Peserta> searchPesertaByBatchAndKota(@RequestParam(value = "batch") String batch,
                                                     @RequestParam(value = "kota") String kota) {
        List<Peserta> hasil = pesertaRepo.findTop4ByBatchAndAlamatContaining(batch, kota);
        return hasil;
    }

    @GetMapping("/findtop/contains")
    public List<Peserta> findTop4ByBatchAndAlamatContains(
            @RequestParam(value = "batch") String strBatch,
            @RequestParam(value = "alamatMengandung") String alamatMengandung) {
        List<Peserta> peserta = pesertaRepo.
                findTop4ByBatchAndAlamatContains(strBatch,alamatMengandung);
        return peserta;
    }

    @GetMapping("/find-nama-batch")
    public List<Peserta> findByNamaBatch(
            @RequestParam(value = "nama") String strNama,
            @RequestParam(value = "batch") String strBatch) {
        List<Peserta> peserta = pesertaRepo.
                xFindNameBatch(strNama,strBatch);
        return peserta;
    }


}


