/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.fing.manejousuarios.dao;

import java.util.List;
import mx.uach.fing.manejousuarios.datos.Usuario;

/**
 *
 * @author User1
 */
public interface Crud {//Dao crear una interfaz donde se definan los metodos
    
    public List<Usuario> list();
    
    public void create(Usuario usuario);
    
    public void update(Usuario usuario);
    
    public void delete(Integer id);
    
    
    
}
