package com.example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hongtao on 16/5/16.
 */
@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /*
     * 周期性执行的任务,每5秒执行一次。
     *
     * 执行周期:
     *      由fixedRate参数指定,这里是每5秒执行一次。
     *
     * 注意:被@Scheduled标注的方法,需要在入口类处标注@EnableScheduling才会生效。
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("The time is now " + dateFormat.format(new Date()));
    }

    //
    // 周期性执行的任务,每10秒执行一次。
    //
    // 执行周期:
    //      由cron参数指定。其用法如下:
    //
    //      "0 0 * * * *" = the top of every hour of every day.
    //      "*/10 * * * * *" = every ten seconds.
    //      "0 0 8-10 * * *" = 8, 9 and 10 o'clock of every day.
    //      "0 0/30 8-10 * * *" = 8:00, 8:30, 9:00, 9:30 and 10:oo every day.
    //      "0 0 9-17 * * MON-FRI" = on the hour nine-to-five weekdays.
    //      "0 0 0 25 12 ?" = every Christmas Day at midnight.
    //
    @Scheduled(cron = "*/10 * * * * *")
    public void reportCurrentTimeViaCron() {
        System.out.println("Cron: the time is now " + dateFormat.format(new Date()));
    }
}
