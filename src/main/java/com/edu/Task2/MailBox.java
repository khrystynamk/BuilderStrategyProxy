package com.edu.Task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<MailInfo>();
    private MailSender mailSender;

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public MailBox() {
        this.mailSender = new MailSender();
    }
    
    public void sendAll() {
        for (MailInfo info : infos) {
            mailSender.sendMail(info);
        }
    }
}
