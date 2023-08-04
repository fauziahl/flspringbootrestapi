package com.juaracoding.flspringbootrestapi.util;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 8/4/2023 8:47 PM
@Last Modified 8/4/2023 8:47 PM
Version 1.0
*/

public class ConstantMessage {

    public final static String REGEX_DATE_YYYYMMDD = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$";
    public final static String REGEX_DATE_DDMMYY = "";
    /*
        REGISTER
     */
    public final static String REGIS_USRNAME_NOT_EMPTY = "Username tidak boleh kosong";
    public final static String REGIS_PWD_NOT_EMPTY = "Password tidak boleh kosong";
    public final static String REGIS_EMAIL_NOT_EMPTY = "Email tidak boleh kosong";
    public final static String REGIS_NO_HP_NOT_EMPTY = "No HP tidak boleh kosong";
    public final static String ERROR_UNEXPECTED = "UNEXPECTED ERROR";
    public final static String ERROR_UNPROCCESSABLE = "Validation error. Check 'errors' field for details.";
    public final static String ERROR_NO_CONTENT = "PERMINTAAN TIDAK DAPAT DIPROSES";
    public final static String ERROR_DATA_INVALID = "DATA TIDAK VALID";
    public final static String ERROR_INTERNAL_SERVER = "INTERNAL SERVER ERROR";
    public final static String ERROR_MAIL_FORM_JSON = "Malformed JSON request";
    public final static String SUCCESS_CREATED = "Data Berhasil Dibuat !";
    public final static String ERROR_FAILED_CREATED = "Data Gagal Dibuat !";


}
