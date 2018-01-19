import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

    public static void main(String[]args) throws IOException {
    	
    	
    	
    	 {
    		    byte b1 = (byte) 11042;                 // 1 byte  
    		    long l1 = b1;                 //  one byte to 8 bytes, assigned implicitly
    		    
    		    System.out.println("byte value: " + b1);               //  prints 10
    		    System.out.println("Converted long value: " + l1);     //  prints 10
    		  }
    	
    	

      /*  final String username = "gaikwadrahul8208@outlook.com";
        final String password = "pass";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "outlook.office365.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("gaikwadrahul8208@outlook.com"));
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse("gaikwadrahul8208@gmail.com"));
            message.setSubject("Test");
            message.setText("HI");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }*/
    }
}