package Controler;

import Model.UsuarioBEAN;
import Model.UsuarioDAO;
import java.util.ArrayList;


public class Controle {
    
    public void addUsuario(UsuarioBEAN usuario){
        UsuarioDAO.getInstance().create(usuario);
    }

    public void updateUsuario(UsuarioBEAN usuario){
        UsuarioDAO.getInstance().update(usuario);
    }
    
    public void deleteUsuario(UsuarioBEAN usuario){
        UsuarioDAO.getInstance().delete(usuario);
    }    
    
    public ArrayList<UsuarioBEAN> listaUsuario(){
        return UsuarioDAO.getInstance().findAllUsuario();
    }
}
