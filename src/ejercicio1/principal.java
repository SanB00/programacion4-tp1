package ejercicio1;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {

		Empleado emp1 = new Empleado("12345678A", // dni
				"Juan", // nombre
				"Pérez", // apellido
				 LocalDate.of(2000, 12, 15), // fechaNacimiento (Año, Mes, Día)
				"Calle Falsa 123", // direccion
				"Masculino", // genero
				"+34600112233", // telefono
				"juan.perez@email.com", // email
				"Desarrollador Java" // legajo
		);
		System.out.println(emp1);
		System.out.println("próximo legajo: " + Empleado.devuelveProximoLegajo());

	}

}

