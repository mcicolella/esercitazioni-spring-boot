package net.emmecilab.taskscheduler;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    @Scheduled(fixedRate = 3000)
    public void ScheduledTaskWithFixedRate() {
        System.out.println("Executed task with fixed rate at " + LocalDateTime.now());
    }

    @Scheduled(fixedDelay = 6000)
    public void ScheduledTaskWithFixedDelay() {
        System.out.println("Executed task with fixed delay at " + LocalDateTime.now());
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            throw new IllegalStateException(ex);
        }
    }

    @Scheduled(fixedRate = 2000, initialDelay = 4000)
    public void ScheduleTaskWithInitialDelay() {
        System.out.println("Executed task with initial delay at " + LocalDateTime.now());
    }

    @Scheduled(cron = "0 * * * * ?")
    public void ScheduleTaskWithCron() {
        System.out.println("Executed task with Cron at " + LocalDateTime.now());
    }

}
