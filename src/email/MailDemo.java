// for this program to work download:
// javax.mail.jar and javax.activation.jar files
package email;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailDemo {

    public static void main(String[] args) throws Exception {

        String to = "benjaminthorpe19@gmail.com";

        String from = "marvelousbend@gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.starttls.enable", "true"); // can be optional
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465"); // 25 also works

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, "marve!0us");
            }
        });

        String msgBody = "Sending email using JavaMail API Test 3...";

        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from, "NetBeans 12.0"));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to, "Mr. Recipient"));
            msg.setSubject("Java Mail API Test");
            msg.setText(msgBody);

            System.out.println("Sending Email...");
            Transport.send(msg);
            System.out.println("Email sent successfully...");

        } catch (AddressException e) {
            System.out.println("Error 1: " + e.getMessage());
        } catch (MessagingException e) {
            System.out.println("Error 2: " + e.getLocalizedMessage());
            System.out.println("Please Disable Less Secure App Access in your Google account");
            System.out.println("Please put the correct username and password");
        } catch (Exception e) {
            System.out.println("Error g: " + e.getMessage());
        }
    }
}
