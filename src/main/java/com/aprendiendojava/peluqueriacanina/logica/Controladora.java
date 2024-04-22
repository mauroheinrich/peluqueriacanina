
package com.aprendiendojava.peluqueriacanina.logica;

import com.aprendiendojava.peluqueriacanina.percistencia.ControladoraPercistencia;




public class Controladora {
    ControladoraPercistencia ControlPersis = new ControladoraPercistencia();

    public void guardar(String nombreMasco, String raza, String color,
            String observaciones, String alergico, String atencionEspecial,
            String nombreDuenio, String celDuenio) {
       Duenio duenio = new Duenio();
       duenio.setNombre(nombreDuenio);
       duenio.setCelDuenio(celDuenio);
       
       Mascota mascota =  new Mascota();
       mascota.setNombre(nombreMasco);
       mascota.setRaza(raza);
       mascota.setColor(color);
       mascota.setObservaciones(observaciones);
       mascota.setAlergico(alergico);
       mascota.setAtencion_especial(atencionEspecial);
       mascota.setUnDuenio(duenio);
       
       ControlPersis.guardar(duenio, mascota);
       
    }

 
}
