package com.edu.task2.mails;

import com.edu.task2.Client;

public class BirthdayCode extends AbstractCode {
    public BirthdayCode(Client recepient) {
        super(recepient);
    }

    @Override
    public String generate() {
        return String.format("<h1>Happy Birthday, %s</h1><h3>You are now %s years old!</h3>",
                            this.recepient.getName(), this.recepient.getAge());
    }
}
