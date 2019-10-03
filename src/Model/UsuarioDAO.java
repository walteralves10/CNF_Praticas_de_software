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
        String query = "INSERT INTO USUARIO(status_usuario, senha_usuario, email_usuario) "
                + "VALUES(?,?,?)";
        return MySQLDAO.executeQuery(query, usuario.getStatus_usuario(), usuario.getSenha(), 
                usuario.getEmail_usuario());
    }
    
    public void update(UsuarioBEAN usuario){
        String query = "UPDATE USUARIO SET status_usuario=?, senha_usuario=?, "
                + "email_usuario=? WHERE id = ?";
        MySQLDAO.executeQuery(query, usuario.getStatus_usuario(), usuario.getSenha(), 
                usuario.getEmail_usuario(), usuario.getCodigo());
    }
    
    public void delete(UsuarioBEAN usuario){
        MySQLDAO.executeQuery("UPDATE usuario SET status_usuario=1 WHERE codigo_usuario=?", usuario.getCodigo());
    }
    
    public ArrayList<UsuarioBEAN> findAllUsuario(){
        return listaUsuario("SELECT * FROM USUARIO WHERE status_usuario=0 ORDER BY codigo_usuario");
    }
    
    private ArrayList<UsuarioBEAN> listaUsuario(String query){
        ArrayList<UsuarioBEAN> lista = new ArrayList<UsuarioBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try{
            while(rs.next()){
                lista.add(new UsuarioBEAN(rs.getInt("codigo_usuario"), 
                                          rs.getString("email_usuario"),
                                          rs.getString("senha_usuario"),
                                          rs.getInt("status_usuario")));
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
    
    public Boolean isExist(String email, String senha) {
        Boolean result = false;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM usuario WHERE senha_usuario=? and email_usuario=?", senha, email);
        try {
            if (rs.next()) {
                result = true;
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
