package com.edu.Task2;

import com.edu.Task2.mails.BirthdayCode;

public class Main {
    public static void main(String[] args) {
        MailBox mailBox = new MailBox();
        Client recepient = new Client("yura.mysak@gmail.com", "Yurko", 30, Gender.MALE);
        MailInfo newEmail = new MailInfo(recepient, new BirthdayCode(recepient), "Congrats, you are older now!");
        mailBox.addMailInfo(newEmail);
        mailBox.sendAll();
    }
}
