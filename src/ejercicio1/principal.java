package ejercicio1;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {

		Empleado emp1 = new Empleado("12345678A", // dni
				"Juan", // nombre
				"Pérez", // apellido
				 LocalDate.of(2000, 12, 15), // fechaNacimiento (Año, Mes, Día)
				"Masculino", // genero
				"Calle Falsa 123", // direccion
				"+34600112233", // telefono
				"juan.perez@email.com", // email
				"Desarrollador Java" // puesto	
		);
		
		System.out.println(emp1.toString());
		System.out.println("próximo legajo: " + Empleado.devuelveProximoLegajo());

	}

}

