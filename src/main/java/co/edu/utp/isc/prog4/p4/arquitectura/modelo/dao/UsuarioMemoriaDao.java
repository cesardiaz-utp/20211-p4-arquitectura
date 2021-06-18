/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.p4.arquitectura.modelo.dao;

import co.edu.utp.isc.prog4.p4.arquitectura.modelo.entidades.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cdiaz
 */
public class UsuarioMemoriaDao implements UsuarioDao {

    List<Usuario> datos;

    public UsuarioMemoriaDao() {
        datos = new ArrayList<>();
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        datos.add(usuario);
        return usuario;
    }

    @Override
    public List<Usuario> listarTodos() {
        return datos;
    }

    @Override
    public Usuario consultar(String nombreUsuario) {
        for (Usuario dato : datos) {
            if (dato.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                return dato;
            }
        }
        return null;
    }

    @Override
    public Usuario bloquear(String nombreUsuario) {
        for (Usuario dato : datos) {
            if (dato.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                dato.setActivo(false);
                return dato;
            }
        }
        return null;
    }

}
