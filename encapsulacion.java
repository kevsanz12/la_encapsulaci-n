public class encapsulacion {
    public static void main(String[] args) {
        Persona edad = new Persona ();
        edad.setNombre("edad");
        edad.setEdad(25);

        Persona persona = new Persona();
        persona.setNombre("Kevin");


        Persona numero = new Persona();
        numero.setNombre("numero");
        numero.setNumero(1744309853);


        System.out.println(edad.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(numero.getNumero());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int numero;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String valor) {
        this.nombre = valor;

    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getNumero() {
        return this.numero;

    }
}