package Model;

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
        String query = "INSERT INTO professor(nome_professor, cpf_professor, status_professor) VALUES (?,?,?,?)";
        return MySQLDAO.executeQuery(query, prof.getNome_professor(), prof.getCpf_professor(), prof.getStatus_professor());
    }
    
    public void update(ProfessorBEAN prof){
        String query = "UPDATE professor SET nome_professor=?,cpf_professor=?,status_professor=? WHERE codigo_professor = ?";
        MySQLDAO.executeQuery(query, prof.getNome_professor(), prof.getCpf_professor(), prof.getStatus_professor(), prof.getCodigo_professor());
    }
    
    public void delete(ProfessorBEAN prof){
        MySQLDAO.executeQuery("DELETE FROM professor WHERE codigo_professor = ?", prof.getCodigo_professor());
    }
}
