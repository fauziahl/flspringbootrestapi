package com.juaracoding.flspringbootrestapi.util;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 8/4/2023 9:16 PM
@Last Modified 8/4/2023 9:16 PM
Version 1.0
*/

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TransformToDTO {
    private String sortBy = "";
    private String sort = "";


    /*
        DATA EXISTS NO CONDITION
     */
    public Map<String,Object> transformObject(Map<String,Object> mapz, List ls, Page page)
    {
        mapz.put("content",ls);
        mapz.put("currentPage",page.getNumber());
        mapz.put("totalItems",page.getTotalElements());
        mapz.put("totalPages",page.getTotalPages());
        mapz.put("sort",page.getSort());
        mapz.put("numberOfElements",page.getNumberOfElements());

        return mapz;
    }

    /*
        DATA EXISTS WITH CONDITION
     */
    public Map<String,Object> transformObject(Map<String,Object> mapz, List ls, Page page,Map<String,String> searchParams)//<PENAMBAHAN 07-03-2023>
    {
        sortBy = page.getSort().toString().split(":")[0];
        sortBy = sortBy.equals("UNSORTED")?"id":sortBy;
        sort   = sortBy.equals("UNSORTED")?"asc":page.getSort().toString().split(":")[1];
        mapz.put("content",ls);
        mapz.put("totalItems",page.getTotalElements());
        mapz.put("totalPages",page.getTotalPages());
        mapz.put("sort",sort.trim().toLowerCase());
        mapz.put("numberOfElements",page.getNumberOfElements());
        mapz.put("searchParam",searchParams);

        return mapz;
    }

    /*
        DATA NOT EXISTS WITH CONDITION PAGING
     */
    public Map<String,Object> transformObjectDataEmpty(Map<String,Object> mapz, Pageable pageable, Map<String,String> searchParams)//<PENAMBAHAN 07-03-2023>
    {
        sortBy = pageable.getSort().toString().split(":")[0];
        sort   = sortBy.equals("UNSORTED")?"asc":pageable.getSort().toString().split(":")[1];

        mapz.put("content",new ArrayList<>());
        mapz.put("totalItems",0);
        mapz.put("totalPages",0);
        mapz.put("sort",sort.trim().toLowerCase());
        mapz.put("numberOfElements",0);
        mapz.put("searchParam",searchParams);

        return mapz;
    }


    /*
        DATA NOT EXISTS WITH CONDITION OBJECT ONLY
     */
    public Map<String,Object> transformObjectDataEmpty(Map<String,Object> mapz, Map<String,String> searchParams)//<PENAMBAHAN 07-03-2023>
    {
        mapz.put("content",new Object());
        mapz.put("totalItems",0);
        mapz.put("totalPages",0);
        mapz.put("sort","asc");
        mapz.put("numberOfElements",0);
        mapz.put("searchParam",searchParams);

        return mapz;
    }
    public Map<String,Object> transformObjectDataSave(Map<String,Object> mapz,Long idDataSave, Map<String,String> searchParams)//<PENAMBAHAN 07-03-2023>
    {
        mapz.put("content",new Object());
        mapz.put("totalItems",0);
        mapz.put("totalPages",0);
        mapz.put("sort","asc");
        mapz.put("idDataSave",idDataSave);
        mapz.put("numberOfElements",0);
        mapz.put("searchParam",searchParams);

        return mapz;
    }

}
