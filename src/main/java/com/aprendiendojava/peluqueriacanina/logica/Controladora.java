
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

    public Mascota traerMascota(int num_cliente) {
      return ControlPersis.traerMascota(num_cliente);
    
    }

    public void modificarMascota(Mascota masco, String nombreMasco,
            String raza, String color, String observaciones, String alergico,
            String atencionEspecial, String nombreDuenio, String celDuenio) {
        
       masco.setNombre(nombreMasco);
       masco.setRaza(raza);
       masco.setColor(color);
       masco.setObservaciones(observaciones);
       masco.setAlergico(alergico);
       masco.setAtencion_especial(atencionEspecial);
       //modifico mascota
       ControlPersis.modificarMascota(masco);
        //setear nuevos valores del dueño
       Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
       dueno.setCelDuenio(celDuenio);
       dueno.setNombre(nombreDuenio);
       
       this.modificarDuenio(dueno);
    }

    private Duenio buscarDuenio(int id_duenio) {
        return ControlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
        ControlPersis.modificarDuenio(dueno);
    }

  
   
 
}
