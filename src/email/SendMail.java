// for this program to work download:
// javax.mail.jar and javax.activation.jar files
package email;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

    public static void main(String[] args) {

        String to = "benjaminthorpe19@gmail.com";

        String from = "marvelousbend@gmail.com";

        String host = "localhost";

        // get system properties
        Properties properties = System.getProperties();

        // setup mail server
        properties.setProperty("mail.smtp.host", host);

        // user authentication part
        properties.setProperty("mail.user", from);
        properties.setProperty("mail.password", "marve!0us");

        // get default session object
        Session session = Session.getDefaultInstance(properties);

        try {
            // create default mime message object
            MimeMessage message = new MimeMessage(session);

            //set from
            message.setFrom(new InternetAddress(from));

            // set to
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // set subject
            message.setSubject("Java Mail Test");

            // the message to send
            message.setText("Hey Benjamin how's everything goin'?");

            // send message
            Transport.send(message);
            System.out.println("Message sent successfully....");
        } catch (MessagingException me) {
            System.out.println("Error: " + me.getMessage());
        }
    }
}
