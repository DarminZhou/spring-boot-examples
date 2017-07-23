package com.zhoudm.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/19.
 */
@Component
public class Scheduler2Task {
    private static final SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime(){
        System.out.println("现在时间："+dateFormat.format(new Date()));
    }
}
