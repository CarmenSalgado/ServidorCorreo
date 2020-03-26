/**
 *
 * Clase: mail
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

package edu.cecar.modelo;

/**
 *
 * ESTA CLASE PERMITE MODELAR LOS PARAMETROS Y MODIFICADORES DE ACCESO DEL APP...
 *
**/

public class Mail {
    
private  String usuario, 
             contraseña,
               destino,
               asunto, 
              mensaje,
          rutaArchivo, 
              archivo;

    public Mail() {
    }

    public Mail(String usuario, String contraseña, String destino, String asunto, String mensaje, String rutaArchivo, String archivo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.destino = destino;
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.rutaArchivo = rutaArchivo;
        this.archivo = archivo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    
 
 

}
