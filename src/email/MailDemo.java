/*  for this program to work, download:
    javax.mail.jar and javax.activation.jar files.

    If you intend to use your personal email, for testing
    please enable Less Secure Apps in your Gmail account,
    and turn off 2 Steps Verification
 */
package email;

import java.util.Properties;
import javax.mail.Authenticator;
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

        // setting up the mail server
        Properties properties = new Properties();
        // properties.put("mail.smtp.socketFactory.port", "465"); // optional
        // properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); // optional

        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.starttls.enable", "true"); // recommended for security
        properties.put("mail.smtp.auth", "true");
        // default port is 465, use port 587 when starting TLS
        properties.put("mail.smtp.port", "587"); // optional

        // Authenticating the user and password
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, "marve!0us");
            }
        });

        String messageContent = "Sending email using JavaMail API Test 4...";

        try {
            Message mimeMessage = new MimeMessage(session);

            // from which user/email address
            mimeMessage.setFrom(new InternetAddress(from, "NetBeans 12.0"));

            // add recipient
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            mimeMessage.setSubject("Java Mail API Test");
            mimeMessage.setText(messageContent);

            System.out.println("Sending Email...");
            Transport.send(mimeMessage);
            System.out.println("Email sent successfully...");

        } catch (AddressException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (MessagingException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please Enable Less Secure App Access in your Google account.\n"
                    + "Please put the correct username and password");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
