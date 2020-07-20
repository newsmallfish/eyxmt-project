package com.eyxmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;


public interface MailService {
    public void simpleMail(String subject,String text,String to);

    public void mimeMail(String subject,String text,String to) throws MessagingException;
}
