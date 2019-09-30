package Model;

public class FaculdadeDAO {
    
    private static FaculdadeDAO instance;

    public FaculdadeDAO() {
        MySQLDAO.getConnection();
    }
    
    public static FaculdadeDAO getInstance(){
        if(instance == null){
            instance = new FaculdadeDAO();
        }
        return instance;
    }
    
    public long create(FaculdadeBEAN facul){
        String query = "INSERT INTO professor(nome_professor, cpf_professor, status_professor) VALUES (?,?,?,?)";
        return MySQLDAO.executeQuery(query, facul.);
    }
    
    public void update(FaculdadeBEAN facul){
        String query = "UPDATE professor SET nome_professor=?,cpf_professor=?,status_professor=? WHERE codigo_professor = ?";
        MySQLDAO.executeQuery(query, prof.getNome_professor(), prof.getCpf_professor(), prof.getStatus_professor(), prof.getCodigo_professor());
    }
    
    public void delete(FaculdadeBEAN facul){
        MySQLDAO.executeQuery("DELETE FROM professor WHERE codigo_professor = ?", prof.getCodigo_professor());
    }
    
}
