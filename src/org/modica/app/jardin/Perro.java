package org.modica.app.jardin;

import org.modica.app.hogar.Persona;

public class Perro {
    protected String nombre;
    protected String raza;

    String Jugar(Persona persona) {
        return persona.lanzarPelota();
    }
}
