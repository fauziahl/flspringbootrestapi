package com.juaracoding.flspringbootrestapi.repo;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 8/4/2023 9:20 PM
@Last Modified 8/4/2023 9:20 PM
Version 1.0
*/

import com.juaracoding.flspringbootrestapi.model.Barang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarangRepo extends JpaRepository<Barang, Long> {

}
