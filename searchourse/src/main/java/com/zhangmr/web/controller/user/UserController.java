package com.zhangmr.web.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UserController {


    @GetMapping("/user/login")
    public String loginPage() {
        return "user/login";
    }
}
