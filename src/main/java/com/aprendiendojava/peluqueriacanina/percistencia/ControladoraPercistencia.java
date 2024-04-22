
package com.aprendiendojava.peluqueriacanina.percistencia;

import com.aprendiendojava.peluqueriacanina.logica.Duenio;
import com.aprendiendojava.peluqueriacanina.logica.Mascota;


public class ControladoraPercistencia {
    // Crear instancias de los controladores utilizando new
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    // Método para guardar un dueño y una mascota en la base de datos
    public void guardar(Duenio duenio, Mascota mascota) {
        duenioJpa.create(duenio);   // Crear el dueño en la base de datos
        mascotaJpa.create(mascota); // Crear la mascota en la base de datos
    }
}
