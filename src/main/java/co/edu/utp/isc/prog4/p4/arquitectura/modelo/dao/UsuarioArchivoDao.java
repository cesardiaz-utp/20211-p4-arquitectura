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
public class UsuarioArchivoDao implements UsuarioDao {

    @Override
    public Usuario guardar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listarTodos() {
        try {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (Exception ex) {
            
        }
        return null;
    }

    @Override
    public Usuario consultar(String nombreUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario bloquear(String nombreUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
