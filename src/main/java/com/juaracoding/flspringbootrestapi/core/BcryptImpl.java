package com.juaracoding.flspringbootrestapi.core;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 8/4/2023 8:03 PM
@Last Modified 8/4/2023 8:03 PM
Version 1.0
*/

import java.util.function.Function;

public class BcryptImpl {
    private static final BcryptCustom bcrypt = new BcryptCustom(11);

    public static String hash(String password) {
        return bcrypt.hash(password);
    }

    public static boolean verifyAndUpdateHash(String password, String hash, Function<String, Boolean> updateFunc) {
        return bcrypt.verifyAndUpdateHash(password, hash, updateFunc);
    }

    public static boolean verifyHash(String password , String hash)
    {
        return bcrypt.verifyHash(password,hash);
    }

    public static void main(String[] args) {
//        String[] mutableHash = new String[1];
//        Function<String, Boolean> update = hash -> { mutableHash[0] = hash; return true; };

        String strUserName = "Paul";
        String strPwd = "Paul123";
        String unamePwd = strUserName + strPwd;
        String strAfterEncrypt1 = hash(unamePwd);//PaulPaul123
        String strAfterEncrypt2 = hash(unamePwd);
        System.out.println(strAfterEncrypt1);
        System.out.println(strAfterEncrypt2);
//        System.out.println("$2a$11$J4OHsXr6yGRrGT7kx1LNVekbgRFpBXRZy77/vIRBjRzokzlFIlzKy".equals("$2a$11$mt0dQUuM1ClG2XavuiAbtOaiNX8wrs2gEPwwfHBk4FJ2Ct7IGNcx."));
    }
}
