package com.yy.cloud.baseplatform.authserver.service;

import org.springframework.mail.javamail.JavaMailSender;

public interface EmailService {

    JavaMailSender getMailSender();

}
