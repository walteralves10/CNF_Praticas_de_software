package Controler;

import Model.ProfessorBEAN;
import Model.ProfessorDAO;
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
    
    public void addProfessor(ProfessorBEAN prof){
        ProfessorDAO.getInstance().create(prof);
    }
    public void updateProfessor(ProfessorBEAN prof){
        ProfessorDAO.getInstance().update(prof);
    }
    public void deleteProfessor(ProfessorBEAN prof){
        ProfessorDAO.getInstance().delete(prof);
    }
    public ArrayList<ProfessorBEAN> listaProfessores(){
        return ProfessorDAO.getInstance().findAllProfessor();
    }
    
    
}
