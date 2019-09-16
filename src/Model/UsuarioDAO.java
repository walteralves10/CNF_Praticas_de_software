package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO {
    
    private static UsuarioDAO instance;

    public UsuarioDAO() {
        MySQLDAO.getConnection();
    }
    
    public static UsuarioDAO getInstance(){
        if(instance == null){
            instance = new UsuarioDAO();
        }
        return instance;
    }
    
    public long create(UsuarioBEAN usuario){
        String query = "INSERT INTO USUARIO(tipo_usuario, senha_usuario) VALUES(?,?)";
        return MySQLDAO.executeQuery(query, usuario.getTipo(), usuario.getSenha());
    }
    
    public void update(UsuarioBEAN usuario){
        String query = "UPDATE USUARIO SET tipo_usuario=?, senha_usuario=? WHERE id = ?";
        MySQLDAO.executeQuery(query, usuario.getTipo(), usuario.getSenha(), usuario.getCodigo());
    }
    
    public void delete(UsuarioBEAN usuario){
        MySQLDAO.executeQuery("DELETE FROM USUARIO WHERE codigo_usuario = ?", usuario.getCodigo());
    }
    
    public ArrayList<UsuarioBEAN> findAllUsuario(){
        return listaUsuario("SELECT * FROM USUARIO ORDER BY codigo_usuario");
    }
    
    private ArrayList<UsuarioBEAN> listaUsuario(String query){
        ArrayList<UsuarioBEAN> lista = new ArrayList<UsuarioBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try{
            while(rs.next()){
                lista.add(new UsuarioBEAN(rs.getInt("codigo_usuario"), rs.getInt("tipo_usuario"), rs.getString("senha_usuario")));
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
}
