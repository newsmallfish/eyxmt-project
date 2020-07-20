package com.eyxmt.controller;

import com.eyxmt.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.MessagingException;

@Controller
public class MailController {
    @Autowired
    private MailService mailService;

    @RequestMapping("/test")
    @ResponseBody
    public String mailTest() throws MessagingException {
       // mailService.simpleMail("测试","测试内容","33670828@qq.com");

        mailService.mimeMail("测试","测试内容","33670828@qq.com");
        return "test";
    }
}
