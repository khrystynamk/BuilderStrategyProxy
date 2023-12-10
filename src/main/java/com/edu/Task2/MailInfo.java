package com.edu.Task2;

import com.edu.Task2.mails.MailCode;

public class MailInfo {
    private MailCode mailCode;
    public Client client;
    public String mailSubject;

    public String generateText() {
        return mailCode.generate();
    }

    public MailInfo(Client client, MailCode mailCode, String mailSubject) {
        this.client = client;
        this.mailCode = mailCode;
        this.mailSubject = mailSubject;
    }
}
