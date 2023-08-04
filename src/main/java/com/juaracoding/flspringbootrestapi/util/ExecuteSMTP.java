package com.juaracoding.flspringbootrestapi.util;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 8/4/2023 8:48 PM
@Last Modified 8/4/2023 8:48 PM
Version 1.0
*/

import com.juaracoding.flspringbootrestapi.configuration.OtherConfig;
import com.juaracoding.flspringbootrestapi.core.SMTPCore;

public class ExecuteSMTP {
    StringBuilder stringBuilder = new StringBuilder();
    private String [] strException = new String[2];

    public ExecuteSMTP() {
        strException[0] = "ExecuteSMTP";
    }

    public Boolean sendSMTPToken(String mailAddress, String subject, String [] strVerification,String pathFile)
    {
        try
        {
            if(OtherConfig.getFlagSMTPActive().equalsIgnoreCase("y") && !mailAddress.equals(""))
            {
                String strContent = new ReadTextFileSB(pathFile).getContentFile();
                strContent = strContent.replace("#JKVM3NH",strVerification[0]);//Kepentingan
                strContent = strContent.replace("XF#31NN",strVerification[1]);//Nama Lengkap
                strContent = strContent.replace("8U0_1GH$",strVerification[2]);//TOKEN

                String [] strEmail = {mailAddress};
                SMTPCore sc = new SMTPCore();
                return  sc.sendMailWithAttachment(strEmail,
                        subject,
                        strContent,
                        "SSL",null);
            }
        }
        catch (Exception e)
        {
            strException[1]="sendToken(String mailAddress, String subject, String purpose, String token) -- LINE 38";
            LoggingFile.exceptionStringz(strException,e,OtherConfig.getFlagLogging());
            return false;
        }
        return true;
    }
}
