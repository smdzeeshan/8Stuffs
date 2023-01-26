package com.mac;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class HappyBirthdayOutlookCom {
	static String recipient = "smdzeeshanhaider@gmail.com";
	static String sender = "smdzeeshanhaider@outlook.com";
	static String host = "smtp-mail.outlook.com";
	static String password = "InXdsadia623336$$";
	static String Subject = "EMail from Java";

	public static void main(String[] args) throws Exception {

		Properties properties = new Properties();

		properties.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");
		properties.setProperty("mail.smtp.user", sender);
		properties.setProperty("mail.smtp.host", host);
		properties.setProperty("mail.smtp.port", "587");
		properties.setProperty("mail.store.protocol", "imaps");
		properties.setProperty("mail.smtp.starttls.enable", "true");
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.debug", "true");
		// properties.setProperty("mail.smtp.socketFactory.port", "587");
		// properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		// properties.setProperty("mail.smtp.socketFactory.fallback", "true");
		// properties.put("mail.smtp.socketFactory.fallback", "true");
		
		// SecurityManager security = System.getSecurityManager();

		try {
			Authenticator auth = new HappyBirthdayOutlookCom().new SMTPAuthenticator();
			Session session = Session.getInstance(properties, auth);
			Store store = session.getStore();
			store.connect(host, sender, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("After system properties");

		Session ss = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(sender, password);
			}
		});
		System.out.println("Before Session");
		// Setting up mail server

		// creating session object to get properties

		try {
			System.out.println("Inside try ");
			// MimeMessage object.
			MimeMessage message = new MimeMessage(ss);
			System.out.println("After SS");
			// Set From Field: adding senders email to from field.
			message.setFrom(new InternetAddress(sender));
			System.out.println("After Internet addressS");
			// Set To Field: adding recipient's email to from field.
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
			System.out.println("After Reciept");
			// Set Subject: subject of the email
			message.setSubject("This is Subject");

			// set body of the email.
			message.setText("This is a test mail");
			
			// --THIS IS WRONG----  message.setContent(MESSAGE, "text/plain");
			
			message.setHeader("Content-Type", "text/plain");
			
			// Send email.
			Transport.send(message);
			System.out.println("Mail successfully sent.. ");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}

	}

	class SMTPAuthenticator extends javax.mail.Authenticator {

		public PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(sender, password);
		}
	}
}
