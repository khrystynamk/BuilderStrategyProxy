package com.edu.Task2;

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

    public void sendMail(MailInfo info) {
        TransactionalEmail message1 = TransactionalEmail
                .builder()
                .to(new SendContact(info.client.getEmail(), info.client.getName()))
                .from(new SendContact("mysak.pn@ucu.edu.ua", "Pani Khrystyna"))
                .htmlPart(info.generateText())
                .subject(info.mailSubject)
                .trackOpens(TrackOpens.ENABLED)
                .build();

        SendEmailsRequest request = SendEmailsRequest
                .builder()
                .message(message1) // you can add up to 50 messages per request
                .build();

        // act
        try {
            SendEmailsResponse response = request.sendWith(this.client);
            System.out.println(String.format("Successfully sent email to %s: ", info.client.getEmail()));
        } catch (MailjetException e) {
            System.err.println(String.format("Could not send email through Mailjet: %s", e.getMessage()));
        }
    }

    public MailSender() {
        ClientOptions options = ClientOptions.builder()
                .apiKey("388c6aa7cb5e26fe9a6e440691175968")
                .apiSecretKey("8155a2bede54a6a29a97a7b98741a033")
                .build();
        this.client = new MailjetClient(options);
    }
}


// UCU API key: 9b2388f06f2cbf5d120379938522cb2c
// UCU secret key: cb2fd06fcc30c20323df7d88378179c7

// Personal API key: 388c6aa7cb5e26fe9a6e440691175968
// Personal secret key: 8155a2bede54a6a29a97a7b98741a033
