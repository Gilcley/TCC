package br.com.diagnosticus_action.util;

import javax.faces.context.FacesContext;

import org.apache.commons.mail.*;

import br.com.diagnosticus_action.dominio.Mensagem;


public class EmailUtils {
	 
	 
	 public static Email conectaEmail() throws EmailException {
	 Email email = new SimpleEmail();
	 email.setHostName("localhost");
	 email.setSmtpPort(587);
	 email.setAuthentication("diagnosticusactionjogo@gmail.com", "!!!1a2b3c");
	 email.setTLS(true);
	 email.setFrom("diagnosticusactionjogo@gmail.com");
	 return email;
	 }
	 
	 public static void enviaEmail(Mensagem mensagem) throws EmailException {
	 Email email = new SimpleEmail();
	 email = conectaEmail();
	 email.setSubject(mensagem.getTitulo());
	 email.setMsg(mensagem.getMensagem());
	 email.addTo(mensagem.getDestino());
	 String resposta = email.send();
//	 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "E-mail enviado com sucesso para: " + mensagem.getDestino(), "Informação"));
	 }
	}
