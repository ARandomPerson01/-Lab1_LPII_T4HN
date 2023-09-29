package Views;

import controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		//Crear Usuario
		//String empleado = new EmpleadoController().createEmpleado("Mendoza", "Carlos", 40, "Masculino", 1836.50);
		//String usuario = new UsuarioController().createUsuario("Alejandro'", "Davila", "Mexico");
		
		//Eliminar Usuario
		//String empleado = new EmpleadoController().deleteEmpleado(1);
		
		//Actualizar Usuario
		//String empleado = new EmpleadoController().updateEmpleado(1, "Antonio");
		
		//Leer Usuario
		String empleado = new EmpleadoController().getEmpleado(1);
		
		System.out.println(empleado);
	}

}
