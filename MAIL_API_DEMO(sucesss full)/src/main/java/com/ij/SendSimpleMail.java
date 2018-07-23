/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
public class SendSimpleMail {
	public static void main(String[] args) throws IOException {
	      Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.smtp.host", "smtp.gmail.com");
	      props.put("mail.smtp.port", "587");
	      props.put("mail.debug", "true");
	      Session session = Session.getInstance(props,
	  		  new Authenticator() {
	  			protected PasswordAuthentication getPasswordAuthentication() {
	  				return new PasswordAuthentication("shaikhirfanjalil543@gmail.com", "8888361212");
	  			}
	  		  });
	      try {
	        MimeMessage msg = new MimeMessage(session);
	        msg.setFrom(new InternetAddress("shaikhirfanjalil543@gmail.com"));
	        msg.setRecipients(Message.RecipientType.TO, "java.irfan99@yahoo.com");
	        msg.setSubject("Simple Test Mail");
	        msg.setSentDate(new Date());
	        msg.setText("Hello World!");
	        Multipart multipart = new MimeMultipart();
	        
	        MimeBodyPart textPart = new MimeBodyPart();
	        String textContent = "Please find the Attachment.";
	        textPart.setText(textContent);
	        multipart.addBodyPart(textPart);
	        
	        MimeBodyPart attachementPart = new MimeBodyPart();
	        attachementPart.attachFile(new File("E:/irfan/IMAGES/Images/irfan/beauty/a1.jpg"));
	        multipart.addBodyPart(attachementPart);

	        msg.setContent(multipart);
	        Transport.send(msg);
		System.out.println("---Done---");
	      } catch (MessagingException mex) {
	    	mex.printStackTrace();
	      }
	}
	}


