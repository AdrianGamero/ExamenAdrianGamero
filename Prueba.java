import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Prueba {
    @Test
    public void pruebaEdad(){
        Persona persona = new Persona();
        assertEquals(true,persona.setEdad(19));
    }
    @Test
    public void pruebaDNI(){
        Persona persona = new Persona();
        assertEquals(true,persona.setDni("48487498"));
    }

}
