package areaRestringida;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			HashMap<String, UsuariosArea> registroUsuarios = new HashMap<>();
			UsuariosArea usuario1 = new UsuariosArea("Miguel","Arrocera");
			UsuariosArea usuario2 = new UsuariosArea("Jose Alberto","No esta");
			UsuariosArea usuario3 = new UsuariosArea("Real Madrid","Robar al barsa");
			int intentosMaximos = 3;
			
			registroUsuarios.put("Miguel", usuario1);
			registroUsuarios.put("Jose Alberto", usuario2);
			registroUsuarios.put("Real Madrid", usuario3);
			
			for(int intentos = 1; intentos <= intentosMaximos; intentos++) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Usuario: ");
				String usuario = scanner.nextLine();
				System.out.println("Contraseña: ");
				String contraseña = scanner.nextLine();
			
			
			if(autenticarUsuario(usuario,contraseña,registroUsuarios)) {
				System.out.println("Autenticacion Exitosa, Bienvenido " + usuario + ".");
				break;
			} else {
				System.out.println("Error: Credenciales Incorrectas.");
			}
		}
	}
			 
	
	public static boolean autenticarUsuario(String usuario, String contraseña, HashMap<String, UsuariosArea> registroUsuarios) {
		if (registroUsuarios.containsKey(usuario)) {
			
		return registroUsuarios.get(usuario).getContraseña().equals(contraseña);
		} else {
			return false;
		}
	}
}

