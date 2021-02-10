package com.fuckwarmane.DailyCTASystem.Controllers;

import com.fuckwarmane.DailyCTASystem.Services.DataStorage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping(value={"/index","/"})
    public String index()
    {
        return "index.html";
    }

    @GetMapping(value="/getBg")
    public @ResponseBody String getBg()
    {
        return DataStorage.getBg();
    }

    @GetMapping("/getNextBg")
    public @ResponseBody String getNextBg()
    {
        return DataStorage.getNextBg();
    }
}
