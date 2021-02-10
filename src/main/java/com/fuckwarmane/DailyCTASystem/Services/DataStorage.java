package com.fuckwarmane.DailyCTASystem.Services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope("appliaction")
public class DataStorage {

    static private int wholeWeek = 5;
    static private int currentDay = 0;
    static private List<String> bgList = new ArrayList<>();

    public static void initialize()
    {
        bgList.add("Warsong Gulch");
        bgList.add("Arathi Basin");
        bgList.add("Eye of the Storm");
        bgList.add("Strand of the Ancients");
        bgList.add("Isle of Conquest");
        bgList.add("Alterac Valley");
    }

    public static void incrementDay()
    {
        if(currentDay == wholeWeek)
        {
            currentDay=0;
        }
        else
        {
            currentDay++;
        }
    }

    public static String getBg()
    {
        return bgList.get(currentDay);
    }

    public static String getNextBg()
    {
        if(currentDay == wholeWeek)
        {
            return bgList.get(0);
        }
        else
        {
            return bgList.get(currentDay+1);
        }
    }
}
