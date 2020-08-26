package com.itszt.contorller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class OrderController {
    private final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @RequestMapping("/order")
    public String index() {
        return "order";
    }
}
