import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class Pew {

    public static void main(String[] args) {
        final String username = "mesbanking@yahoo.com";
        final String password = "lolipops20009";
        final String recipient = "protennis95@gmail.com";
        final String subject = "message-subject";
        final String emailmessage = "message";

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.mail.yahoo.com");
        props.put("mail.smtp.port", "25");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,    InternetAddress.parse(recipient));
            message.setSubject(subject);
            message.setText(emailmessage);

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
           }

    }

}