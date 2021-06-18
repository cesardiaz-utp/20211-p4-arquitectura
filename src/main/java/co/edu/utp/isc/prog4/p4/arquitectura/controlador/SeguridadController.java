/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.p4.arquitectura.controlador;

import co.edu.utp.isc.prog4.p4.arquitectura.modelo.dao.UsuarioDao;
import co.edu.utp.isc.prog4.p4.arquitectura.modelo.dao.UsuarioMemoriaDao;
import co.edu.utp.isc.prog4.p4.arquitectura.modelo.entidades.Usuario;
import java.util.List;

/**
 *
 * @author cdiaz
 */
public class SeguridadController {
    
    private final UsuarioDao usuarioDao;
    
    public SeguridadController(){
        usuarioDao = new UsuarioMemoriaDao();
    }

    public List<Usuario> listarUsuarios() {
        return usuarioDao.listarTodos();
    }

    public void crearUsuario(Usuario usuario) {
        usuario.setActivo(Boolean.TRUE);
        usuarioDao.guardar(usuario);
    }
    
}
