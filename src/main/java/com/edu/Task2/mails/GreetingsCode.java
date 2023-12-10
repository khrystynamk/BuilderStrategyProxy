package com.edu.Task2.mails;

import com.edu.Task2.Client;

public class GreetingsCode extends AbstractCode {
    public GreetingsCode(Client recepient) {
        super(recepient);
    }

    @Override
    public String generate(){
        return String.format("<h1>Welcome, %s</h1><h3>Good to see you!</h3>", this.recepient.getName());
    }
}
