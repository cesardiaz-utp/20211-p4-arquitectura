/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.p4.arquitectura.vista;

import co.edu.utp.isc.prog4.p4.arquitectura.controlador.SeguridadController;
import co.edu.utp.isc.prog4.p4.arquitectura.modelo.entidades.Usuario;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author cdiaz
 */
public class UsuariosConsole {
    
    private final SeguridadController controlador;
    private final Scanner scanner;
    
    public UsuariosConsole(){
        scanner = new Scanner(System.in);
        controlador = new SeguridadController();
    }
    
    public void gestionUsuarios() {
        var enEjecucion = true;
        while(enEjecucion){
            System.out.println("Bienvenidos a la aplicacion");
            System.out.println("1. Crear");
            System.out.println("2. listar");
            System.out.println("3. Consultar");
            System.out.println("4. Actualizar");
            System.out.println("5. Eliminar");
            System.out.println("0. Salir");
            var opcion = scanner.nextLine();
            switch (Integer.parseInt(opcion)) {
                case 1:
                    crearUsuario();
                    break;
                case 2:
                    listarUsuarios();
                    break;
                case 0:
                    enEjecucion = false;
                    System.out.println("Hasta luego");
                    break;
                default:
                    throw new AssertionError();
            }
            
        }
    }

    private void crearUsuario() {
        System.out.println("Entró a crear usuarios");
        
        System.out.println("Ingrese nombre de usuario:");
        var nombreUsuario = scanner.nextLine();
        System.out.println("Ingrese nombre:");
        var nombre = scanner.nextLine();
        System.out.println("Ingrese apellidos:");
        var apellidos = scanner.nextLine();
        System.out.println("Ingrese correo electronico:");
        var correo = scanner.nextLine();
        System.out.println("Ingrese password:");
        var clave = scanner.nextLine();
        
        controlador.crearUsuario(new Usuario(nombreUsuario, nombre, apellidos, correo, clave));
        
        System.out.println("Usuario creado exitosamente!");
        
    }

    private void listarUsuarios() {
        System.out.println("Entró a listar usuarios");
        List<Usuario> usuarios = controlador.listarUsuarios();
        for (Usuario usuario : usuarios) {
            System.out.println("Usuario: "+ usuario);
        }
    }
    
    
}
