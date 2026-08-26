package ejercicio1;

import java.time.LocalDate;

public class Persona {
	
	//Atributos
	private String dni;
	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;
	
	//Constructores
	public Persona()
	{
		dni = "";
		nombre = "sin nombre";
		apellido = "";
		fechaNacimiento = LocalDate.of(2025, 1, 1);
		genero = "";
		direccion = "";
		telefono = "";
		email = "";
		edad = 99;
	}
	
	public Persona(String dni, String nombre, String apellido, int edad, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.fechaNacimiento=fechaNacimiento;
		this.genero=genero;
		this.direccion=direccion;
		this.telefono=telefono;
		this.email=email;
	}
	
	//Encapsulamiento
	
	public String getDni() { return dni; }
	public void setDni(String dni) { this.dni = dni; }

	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public String getApellido() { return apellido; }
	public void setApellido(String apellido) { this.apellido = apellido; }

	public int getEdad() { return edad; }
	public void setEdad(int edad) { this.edad = edad; }

	public LocalDate getFechaNacimiento() { return fechaNacimiento; }
	public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

	public String getGenero() { return genero; }
	public void setGenero(String genero) { this.genero = genero; }

	public String getDireccion() { return direccion; }
	public void setDireccion(String direccion) { this.direccion = direccion; }

	public String getTelefono() { return telefono; }
	public void setTelefono(String telefono) { this.telefono = telefono; }

	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	    
	//Metodo ToString
	    
        public String toString() {
        	 return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido +
                     ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento +
                     ", genero=" + genero + ", direccion=" + direccion +
                     ", telefono=" + telefono + ", email=" + email + "]";
        }

}
