package ejercicio1;

import java.time.LocalDate;

public class principal {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Empleado obj = new Empleado(
	            "12345678A",                          // dni
	            "Juan",                               // nombre
	            "Pérez",                              // apellido
	            25,
	            LocalDate.of(2000, 12, 15),           // fechaNacimiento (Año, Mes, Día)
	            "Calle Falsa 123",                    // direccion
	            "Masculino",                          // genero
	            "+34600112233",                       // telefono
	            "juan.perez@email.com",               // email
	            "Desarrollador Java",                 // puesto
	            10452                                 // legajo
	        );
		System.out.println(obj);
		System.out.println("legajo: "+ obj.devuelveProximoLegajo());
		System.out.println("legajo: "+ obj.devuelveProximoLegajo());
		System.out.println("legajo: "+ obj.devuelveProximoLegajo());
	}

}
