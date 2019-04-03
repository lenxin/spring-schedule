package org.xin.task;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
public class TestTask {
    @Scheduled(cron = "0/5 * * * * ?")
    public void test() {
        System.out.println("任务执行:" + System.currentTimeMillis());
    }
}
