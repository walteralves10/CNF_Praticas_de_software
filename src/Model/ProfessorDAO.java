package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProfessorDAO {
    
    private static ProfessorDAO instance;
    private static final int DESATIVADO = 1;
    private static final int ATIVOS = 0;

    public ProfessorDAO() {
        MySQLDAO.getConnection();
    }
    
    public static ProfessorDAO getInstance(){
        if(instance == null){
            instance = new ProfessorDAO();
        }
        return instance;
    }
    
    public long create(ProfessorBEAN prof){
        String query = "INSERT INTO professor(nome_professor, cpf_professor, status_professor) VALUES (?,?,?)";
        return MySQLDAO.executeQuery(query, prof.getNome_professor(), 
                prof.getCpf_professor(), prof.getStatus_professor());
    }
    
    public void update(ProfessorBEAN prof){
        String query = "UPDATE professor SET nome_professor=?,cpf_professor=?,status_professor=? "
                + "WHERE codigo_professor = ?";
        MySQLDAO.executeQuery(query, prof.getNome_professor(), prof.getCpf_professor(), 
                prof.getStatus_professor(), prof.getCodigo_professor());
    }
    
    public void delete(ProfessorBEAN prof){
        //MySQLDAO.executeQuery("DELETE FROM professor WHERE codigo_professor = ?", prof.getCodigo_professor());
        MySQLDAO.executeQuery("UPDATE professor SET status_professor = "+ DESATIVADO +" "
                + "WHERE codigo_professor = ?",prof.getCodigo_professor());
    }
    
    public ArrayList<ProfessorBEAN> findAllProfessor() {
        return listaProfessores("SELECT * FROM professor  "
                + "ORDER BY nome_professor");//WHERE status_professor = "+ATIVOS+"
    }

    public ArrayList<ProfessorBEAN> listaProfessores(String query) {
        ArrayList<ProfessorBEAN> lista = new ArrayList<ProfessorBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new ProfessorBEAN(rs.getInt("codigo_professor"), 
                                            rs.getString("nome_professor"), 
                                            rs.getString("cpf_professor"), 
                                            rs.getInt("status_professor")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    //listaStatusProfessor
    public ProfessorBEAN listaStatusProfessor(int codigo){
        ProfessorBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM professor WHERE codigo_professor="+codigo);
        try {
            while (rs.next()) {
                result = (new ProfessorBEAN(rs.getInt("codigo_professor"), 
                                            rs.getString("nome_professor"), 
                                            rs.getString("cpf_professor"), 
                                            rs.getInt("status_professor")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
