package com.happy.record.share.game.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    private static  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    public static  String format(Date date){
        return sdf.format(date);
    }

    public static Date addMinute(int minute){
        Calendar nowTime = Calendar.getInstance();
        nowTime.add(Calendar.MINUTE,minute);
        return nowTime.getTime();
    }
}
