package com.itszt.contorller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;


@Controller
public class LoginController {
    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("login")
    public String login() {
        logger.info("登录");
        System.out.println("logger = " + "");
        return "index";
    }
}
