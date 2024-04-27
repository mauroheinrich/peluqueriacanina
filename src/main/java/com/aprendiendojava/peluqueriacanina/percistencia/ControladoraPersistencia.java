
package com.aprendiendojava.peluqueriacanina.percistencia;

import com.aprendiendojava.peluqueriacanina.logica.Duenio;
import com.aprendiendojava.peluqueriacanina.logica.Mascota;
import com.aprendiendojava.peluqueriacanina.percistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    // Crear instancias de los controladores utilizando new
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    // Método para guardar un dueño y una mascota en la base de datos
    public void guardar(Duenio duenio, Mascota mascota) {
        duenioJpa.create(duenio);   // Crear el dueño en la base de datos
        mascotaJpa.create(mascota); // Crear la mascota en la base de datos
    }

    public List<Mascota> traerMascotas() {
        return mascotaJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {
        try {
            mascotaJpa.destroy(num_cliente); 
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }

    public Mascota traerMascota(int num_cliente) {
        return  mascotaJpa.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco) {
        try {
            mascotaJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id_duenio) {
        return duenioJpa.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio dueno) {
        try {
            duenioJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
