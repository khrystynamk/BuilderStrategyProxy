package com.edu.Task2.mails;

import com.edu.Task2.Client;

public abstract class AbstractCode implements MailCode {
    public Client recepient;
    public AbstractCode(Client recepient) {
        this.recepient = recepient;
    }
}
