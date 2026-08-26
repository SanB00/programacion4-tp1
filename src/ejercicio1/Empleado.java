package ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona {
    private final int legajo;
    private static int contLegajo = 1000;
    private String puesto;
    
    public Empleado() {
        super();
        this.legajo = contLegajo++; // Asigna el legajo automático si usas el constructor vacío
    }

    public Empleado(String dni, String nombre, String apellido, int edad, LocalDate fechaNacimiento,
                    String direccion, String genero, String telefono, String email, String puesto, int legajo) {
        super(dni, nombre, apellido, edad, fechaNacimiento, direccion, genero, telefono, email);
        this.puesto = puesto;
        this.legajo = legajo;
        this.contLegajo = legajo;
    }

    // Getters y Setters
    public int getLegajo() {
        return legajo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", puesto=" + puesto + "] - " + super.toString();
	}
    
	public int devuelveProximoLegajo()	{
        this.contLegajo = contLegajo+1;
        return contLegajo;
	}
    
}