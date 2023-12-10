package com.edu.Task2.mails;

import com.edu.Task2.Client;

public class NewsCode extends AbstractCode {
    public NewsCode(Client recepient) {
        super(recepient);
    }

    @Override
    public String generate(){
        return String.format("<h1>Attention, %s</h1><h3>This is a very important new letter!</h3>", this.recepient.getName());
    }
}
