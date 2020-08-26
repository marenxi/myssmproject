package com.itszt.contorller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;


@Controller
public class LoginController {
    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("login")
    public String login(String username,String userpwd) {
        logger.info("登录");
        System.out.println(username);
        System.out.println(userpwd);
        return "order";
    }
}
