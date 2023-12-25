package com.edu.task2;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.transactional.SendContact;
import com.mailjet.client.transactional.SendEmailsRequest;
import com.mailjet.client.transactional.TrackOpens;
import com.mailjet.client.transactional.TransactionalEmail;
import com.mailjet.client.transactional.response.SendEmailsResponse;

public class MailSender {
    private MailjetClient client;

    public MailSender() {
        ClientOptions options = ClientOptions.builder()
                .apiKey("388c6aa7cb5e26fe9a6e440691175968")
                .apiSecretKey("8155a2bede54a6a29a97a7b98741a033")
                .build();
        this.client = new MailjetClient(options);
    }

    public void sendMail(MailInfo info) {
        TransactionalEmail message = TransactionalEmail
                .builder()
                .to(new SendContact(info.client.getEmail(), info.client.getName()))
                .from(new SendContact("mysak.pn@ucu.edu.ua", "Pani Khrystyna"))
                .htmlPart(info.generateText())
                .subject(info.mailSubject)
                .trackOpens(TrackOpens.ENABLED)
                .build();

        SendEmailsRequest request = SendEmailsRequest
                .builder()
                .message(message)
                .build();

        // act
        try {
            SendEmailsResponse response = request.sendWith(this.client);
            System.out.println(String.format("Successfully sent email to %s: ",
             info.client.getEmail()));
        } catch (MailjetException e) {
            System.err.println(String.format("Could not send email through Mailjet: %s",
             e.getMessage()));
        }
    }
}
