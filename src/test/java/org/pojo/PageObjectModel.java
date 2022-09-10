package org.pojo;

public class PageObjectModel {
   Gmail_Login_Pojo gmailLogin;
   Gmail_Compose_Pojo gmailCompose;
public Gmail_Login_Pojo getGmailLogin() {
	return(gmailLogin==null)? gmailLogin=new Gmail_Login_Pojo()  :gmailLogin;
}
public Gmail_Compose_Pojo getGmailCompose() {
	return (gmailCompose==null)? gmailCompose=new Gmail_Compose_Pojo():gmailCompose;
}
   
}
