package com.edu.task2;

import com.edu.task2.mails.MailCode;

public class MailInfo {
    public Client client;
    private MailCode mailCode;
    public String mailSubject;

    public MailInfo(Client client, MailCode mailCode, String mailSubject) {
        this.client = client;
        this.mailCode = mailCode;
        this.mailSubject = mailSubject;
    }

    public String generateText() {
        return mailCode.generate();
    }

}
