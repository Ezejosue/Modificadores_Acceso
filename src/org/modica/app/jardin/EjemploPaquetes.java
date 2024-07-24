package org.modica.app.jardin;

import org.modica.app.hogar.ColorPelo;
import org.modica.app.hogar.Persona;

import static org.modica.app.hogar.Persona.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Andres");
        persona.setApellido("Guzman");
        persona.setColorPelo(ColorPelo.CAFE);
        System.out.println(persona.getNombre());

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";

        String jugando = perro.Jugar(persona);
        System.out.println("Jugando: " + jugando);
        String saludo = saludar();
        System.out.println("Saludo: " + saludo);
        String generoMujer = GENERO_FEMININO;
        String generoHombre = GENERO_MASCULINO;
    }
}
