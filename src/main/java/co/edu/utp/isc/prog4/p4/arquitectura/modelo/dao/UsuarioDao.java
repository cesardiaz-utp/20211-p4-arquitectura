/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.p4.arquitectura.modelo.dao;

import co.edu.utp.isc.prog4.p4.arquitectura.modelo.entidades.Usuario;
import java.util.List;

/**
 *
 * @author cdiaz
 */
public interface UsuarioDao {

    Usuario guardar(Usuario usuario);

    List<Usuario> listarTodos();

    Usuario consultar(String nombreUsuario);

    Usuario bloquear(String nombreUsuario);

}
