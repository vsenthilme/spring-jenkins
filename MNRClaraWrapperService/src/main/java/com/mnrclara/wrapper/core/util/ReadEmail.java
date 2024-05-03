package com.mnrclara.wrapper.core.util;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;

public class ReadEmail {
	/*
	 * spring.mail.host=smtp.office365.com spring.mail.port=587
	 * spring.mail.username=intake@montyramirezlaw.com
	 * spring.mail.password=TestPass@123
	 */
	public static final String USERNAME = "muruvel@gmail.com"; // "intake@montyramirezlaw.com";
	public static final String PASSWORD = "uajjwldgahryejuo"; // "TestPass@123";

	public static void main(String[] args) throws Exception {
		// 1. Setup properties for the mail session.
		Properties props = new Properties();
		props.put("mail.imap.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.imap.socketFactory.fallback", "false");
		props.put("mail.imap.socketFactory.port", "993");
		props.put("mail.imap.port", "993");
		props.put("mail.imap.host", "imap.gmail.com");
		props.put("mail.imap.user", ReadEmail.USERNAME);
		props.put("mail.store.protocol", "imap");
		props.put("mail.imap.ssl.protocols", "TLSv1.2");

		// 2. Creates a javax.mail.Authenticator object.
		Authenticator auth = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(ReadEmail.USERNAME, ReadEmail.PASSWORD);
			}
		};

		// 3. Creating mail session.
		Session session = Session.getDefaultInstance(props, auth);

		// 4. Get the POP3 store provider and connect to the store.
		Store store = session.getStore("imap");
		store.connect("imap.gmail.com", ReadEmail.USERNAME, ReadEmail.PASSWORD);

		// 5. Get folder and open the INBOX folder in the store.
		Folder inbox = store.getFolder("INBOX");
		inbox.open(Folder.READ_ONLY);

		Folder sent = store.getFolder("[Gmail]/Sent Mail");
		System.out.println("----@@@---> : " + sent.getMessageCount());
		sent.open(Folder.READ_ONLY);
		
		Message msg = sent.getMessage(sent.getMessageCount());
		Address[] in = msg.getFrom();
		for (Address address : in) {
			System.out.println("FROM:" + address.toString());
		}
		Multipart mp = (Multipart) msg.getContent();
		BodyPart bp = mp.getBodyPart(0);
		System.out.print("SENT DATE:" + msg.getSentDate() + ":");
		System.out.println("SUBJECT:" + msg.getSubject());
//		System.out.println("CONTENT:" + bp.getContent());

		// 7. Close folder and close store.
		sent.close(false);
		inbox.close(false);
		store.close();
	}
}