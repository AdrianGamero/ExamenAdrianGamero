import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Persona {
    // Se declaran todas la variables con los datos de la persona
    private String dni;
    private String correo;
    private String contrasena;
    private String nombre;
    private String apellidos;
    private String direccionPostal;
    private String codigoPostal;
    private String telefono;
    private int edad;

    /**
     * @param dni
     * @return boolean
     *         Se cambia el set para comprobar que el DNI tiene 8 digitos numericos
     */
    public boolean setDni(String dni) {
        if (dni.matches("\\d{8}")) {
            this.dni = dni;
            return true;
        } else {
            System.out.println("DNI no válido. Debe tener 8 dígitos.");
            return false;
        }
    }

    /**
     * @param correo
     * @return boolean
     *         Se cambia el set para comprobar que el correo electronico es
     *         verdadero
     */
    public boolean setCorreo(String correo) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        if (matcher.matches()) {
            this.correo = correo;
            return true;
        } else {
            System.out.println("Correo electrónico no válido.");
            return false;
        }
    }

    /**
     * @param contrasena
     * @return boolean
     *         Se cambia el set para impedir que la contraseña tenga menos de 8
     *         caracteres
     */
    public boolean setContrasena(String contrasena) {
        if (contrasena.length() > 8) {
            this.contrasena = contrasena;
            return true;
        } else {
            System.out.println("Contraseña no válida. Debe tener más de 8 caracteres.");
            return false;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @param edad
     * @return boolean
     *         se cambia el set para comprobar que la edad es mayor a 18 años
     */
    public boolean setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
            return true;
        } else {
            System.out.println("Debes ser mayor de 18 años.");
            return false;
        }
    }

    // Se crea el toString que devuelve toda la informacion de la persona
    @Override
    public String toString() {
        return "DNI: " + dni + "\n" +
                "Correo: " + correo + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "Dirección Postal: " + direccionPostal + "\n" +
                "Código Postal: " + codigoPostal + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Edad: " + edad;
    }
}

public class PersonaExamen {

    public static void main(String[] args) {
        // Se inicia el scanner para poder introducir valores por pantalla
        Scanner scanner = new Scanner(System.in);
        // Se crea un objeto de la clase Persona
        Persona persona = new Persona();

        // se pregunta al usuario el DNI
        System.out.print("Ingrese el DNI: ");
        while (!persona.setDni(scanner.nextLine()))
            ;

        // se pregunta al usuario el correo electrónico
        System.out.print("Ingrese el correo electrónico: ");
        while (!persona.setCorreo(scanner.nextLine()))
            ;
        // se pregunta al usuario la contraseña
        System.out.print("Ingrese la contraseña: ");
        while (!persona.setContrasena(scanner.nextLine()))
            ;
        // se pregunta al usuario el nombre
        System.out.print("Ingrese el nombre: ");
        persona.setNombre(scanner.nextLine());
        // se pregunta al usuario los apellidos
        System.out.print("Ingrese los apellidos: ");
        persona.setApellidos(scanner.nextLine());
        // se pregunta al usuario la dirección postal
        System.out.print("Ingrese la dirección postal: ");
        persona.setDireccionPostal(scanner.nextLine());
        // se pregunta al usuario el código postal 
        System.out.print("Ingrese el código postal: ");
        persona.setCodigoPostal(scanner.nextLine());
        // se pregunta al usuario el teléfono
        System.out.print("Ingrese el teléfono: ");
        persona.setTelefono(scanner.nextLine());
        // se pregunta al usuario la edad
        System.out.print("Ingrese la edad: ");
        while (!persona.setEdad(scanner.nextInt()));
        // Cuando se introduce todo correctamente se avisa al usuario de que se ha registrado.
        System.out.println("Registro exitoso!");
        // Se muestran los detalles de la persona registrada
        System.out.println("Detalles del usuario:");
        System.out.println(persona);
    }
}
