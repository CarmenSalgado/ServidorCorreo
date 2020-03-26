/**
 *
 * Clase: ControladorCorreo
 *
 * @class Expression class is undefined on line 5, column 13 in Templates/Classes/Class.java.
 *
 * versión:0.1
 *
 * fecha Creación: 24/03/2020
 *
 * fecha Modificación: 24/03/2020
 *
 * Autor: Carmen Salgado...
 *
 * @author Casalg
 * 
 * Copyright: CECAR
 *
**/

package edu.cecar.controladores;

import edu.cecar.modelo.Mail;
import java.util.Properties;

/**
 *
 * ESTA CLASE PERMITE...
 *
**/

public class ControladorCorreo {
    
 Mail correo = new Mail();
 
 public boolean enviarGmail() {
 
     try {
         
         Properties properties = new Properties();
         properties.put("mail.smtp.host", "smtp.gmail.com");
         properties.setProperty("mail.smtp.starttls.enable", "true");
         properties.setProperty("mail.smtp.port", "587");
         properties.setProperty("mail.smtp.user", correo.getUsuario());
         properties.setProperty("mail.smtp.auth", "true");
         
//         Session s = Session.getDefaulInstance(properties); 
//         
//         MineMenssage m= new MineMenssage(s);
//         m.setFrom(new InternetAdress(correo.getUsuario()));
//         m.addRecipient(Menssage.RecipientType.TO,new InternetAdress(correo.getDestino()));
//         m.addRecipient(Menssage.RecipientType.CC,new InternetAdress(correo.getDestino()));
//         m.setSubject(correo.getAsunto());
//         m.setText(correo.getMensaje());
//         
//         Transport t = s.getTransport("smtp");
//         t.connect(correo.getUsuario(),correo.getContraseña());
//         t.sendMenssage(m,m.getRecipients(Menssage.RecipientType.TO));
//         t.close();
         
         
//Archivos adjuntos//
//Session s = Session.getDefaulInstance(properties,null);
//         BodyPart text = new MineBodyPart();
//         text.setText(correo.getMensaje());
//         BodyPart adjt = new MineBodyPart();
         

         
         
     } catch (Exception e) {
         
     }
     
  return false;
 }

}
