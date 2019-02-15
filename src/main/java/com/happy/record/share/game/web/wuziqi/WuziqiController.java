package com.happy.record.share.game.web.wuziqi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WuziqiController {
    private static final Logger logger = LoggerFactory.getLogger(WuziqiController.class);

    @Value("${spring.application.name:wuziqi}")
    private  String name;
    @RequestMapping(value = "/wuziqi")
    public String index(Map<String, Object> model){
        model.put("name",name);
        logger.info("name");
        return "wuziqitpl";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
