package com.eyxmt.service.impl;

import com.eyxmt.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSenderImpl javaMailSender;
    @Value("${spring.mail.username}")
    private String from;

    public void simpleMail(String subject,String text,String to){

        SimpleMailMessage message=new SimpleMailMessage();
        message.setSubject(subject);
        message.setText(text);
        message.setFrom(from);
        message.setTo(to);
        javaMailSender.send(message);

    }

    public void mimeMail(String subject,String text,String to) throws MessagingException {
        MimeMessage message=javaMailSender.createMimeMessage();
        MimeMessageHelper helper=new MimeMessageHelper(message,true);

        helper.setSubject(subject);
        helper.setText(text,true);
        helper.addAttachment("",new File("F:\\李萍1.doc"));
        helper.setFrom(from);
        helper.setTo(to);
        javaMailSender.send(message);

    }
}
