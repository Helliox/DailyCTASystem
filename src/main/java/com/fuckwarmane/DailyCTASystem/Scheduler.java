package com.fuckwarmane.DailyCTASystem;

import com.fuckwarmane.DailyCTASystem.Services.DataStorage;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    @Scheduled(fixedRate = 6000)
    public void setBgInDataStorage()
    {
        DataStorage.incrementDay();
    }
}
