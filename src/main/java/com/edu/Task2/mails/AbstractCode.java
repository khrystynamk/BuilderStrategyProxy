package com.edu.task2.mails;

import com.edu.task2.Client;

public abstract class AbstractCode implements MailCode {
    public Client recepient;
    public AbstractCode(Client recepient) {
        this.recepient = recepient;
    }
}
