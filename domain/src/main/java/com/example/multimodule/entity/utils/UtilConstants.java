package com.example.multimodule.entity.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilConstants {
    public static final String ID = "_id";
    public static final String CRN = "crn";
    public static final String FIRST_NAME = "firstName";
    public static final String LAST_NAME = "lastName";
    public static final String CREATED_DATE = "createdDate";

    public static SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static String convertDateToInputFormat(Date date) {
        if(date != null){
            return inputDateFormat.format(Date.from(date.toInstant()));
        }else{
            return "";
        }
    }


}
