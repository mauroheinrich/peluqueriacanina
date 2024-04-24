
package com.aprendiendojava.peluqueriacanina.logica;

import com.aprendiendojava.peluqueriacanina.percistencia.ControladoraPersistencia;
import java.util.List;




public class Controladora {
    ControladoraPersistencia ControlPersis = new ControladoraPersistencia();

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

    public List<Mascota> traerMascotas() {
        return ControlPersis.traerMascotas();
    }

    public void borrarMascotas(int num_cliente) {
        ControlPersis.borrarMascota(num_cliente);
    }

 
}
