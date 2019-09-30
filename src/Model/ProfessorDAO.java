package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProfessorDAO {
    
    private static ProfessorDAO instance;

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
        return MySQLDAO.executeQuery(query, prof.getNome_professor(), prof.getCpf_professor(), prof.getStatus_professor());
    }
    
    public void update(ProfessorBEAN prof){
        String query = "UPDATE professor SET nome_professor=?,cpf_professor=?,status_professor=? WHERE codigo_professor = ?";
        MySQLDAO.executeQuery(query, prof.getNome_professor(), prof.getCpf_professor(), prof.getStatus_professor(), prof.getCodigo_professor());
    }
    
    public void delete(ProfessorBEAN prof){
        //MySQLDAO.executeQuery("DELETE FROM professor WHERE codigo_professor = ?", prof.getCodigo_professor());
        MySQLDAO.executeQuery("UPDATE professor SET status_professor = 1 WHERE codigo_professor = ?",prof.getCodigo_professor());
    }
    
    public ArrayList<ProfessorBEAN> findAllProfessor() {
        return listaProfessores("SELECT * FROM professor WHERE status_professor = "+0+" ORDER BY nome_professor");
    }

    public ArrayList<ProfessorBEAN> listaProfessores(String query) {
        ArrayList<ProfessorBEAN> lista = new ArrayList<ProfessorBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new ProfessorBEAN(rs.getInt("codigo_professor"), rs.getString("nome_professor"), rs.getString("cpf_professor"), rs.getInt("status_professor")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

}
