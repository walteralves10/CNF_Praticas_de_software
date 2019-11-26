package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlunoDAO {

    private static AlunoDAO instance;
    private static final int DESATIVADO = 1;
    private static final int ATIVOS = 0;

    public AlunoDAO() {
        MySQLDAO.getConnection();
    }

    public static AlunoDAO getInstance() {
        if (instance == null) {
            instance = new AlunoDAO();
        }
        return instance;
    }

    public long create(AlunoBEAN aluno) {
        String query = "INSERT INTO aluno(nome_aluno, cpf_aluno, status_aluno) VALUES (?,?,?)";
        return MySQLDAO.executeQuery(query, aluno.getNome_aluno(),
                aluno.getCpf_aluno(), aluno.getStatus_aluno());

    }

    public void update(AlunoBEAN aluno) {
        String query = "UPDATE aluno SET nome_aluno=?,cpf_aluno=?,status_aluno=? "
                + "WHERE codigo_aluno = ?";
        MySQLDAO.executeQuery(query, aluno.getNome_aluno(), aluno.getCpf_aluno(), 
                aluno.getStatus_aluno(), aluno.getCodigo_aluno());
    }

    public void delete(AlunoBEAN aluno) {
        //MySQLDAO.executeQuery("DELETE FROM professor WHERE codigo_professor = ?", prof.getCodigo_professor());
        MySQLDAO.executeQuery("UPDATE aluno SET status_aluno = " + DESATIVADO + " "
                + "WHERE codigo_aluno = ?", aluno.getCodigo_aluno());
    }

    public ArrayList<AlunoBEAN> findAllAluno() {
        return listaAluno("SELECT * FROM aluno WHERE status_aluno = " + ATIVOS + " "
                + "ORDER BY nome_aluno");//
    }

    public ArrayList<AlunoBEAN> listaAluno(String query) {
        ArrayList<AlunoBEAN> lista = new ArrayList<AlunoBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new AlunoBEAN(rs.getInt("codigo_aluno"),
                        rs.getString("nome_aluno"),
                        rs.getString("cpf_aluno"),
                        rs.getInt("status_aluno")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
        public ArrayList<AlunoBEAN> listaAlunos(String query) {
        ArrayList<AlunoBEAN> lista = new ArrayList<AlunoBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new AlunoBEAN(rs.getInt("codigo_aluno"), 
                                            rs.getString("nome_aluno"), 
                                            rs.getString("cpf_aluno"), 
                                            rs.getInt("status_aluno")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    //listaStatusProfessor
    public AlunoBEAN listaStatusAluno(int codigo){
        AlunoBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM aluno WHERE codigo_aluno="+codigo);
        try {
            while (rs.next()) {
                result = (new AlunoBEAN(rs.getInt("codigo_aluno"), 
                                            rs.getString("nome_aluno"), 
                                            rs.getString("cpf_aluno"), 
                                            rs.getInt("status_aluno")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public ArrayList<AlunoBEAN> listaAlunoPorNome(AlunoBEAN aluno){
        ArrayList<AlunoBEAN> lista = new ArrayList<AlunoBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM aluno "
                + "WHERE nome_aluno LIKE '%"+aluno.getNome_aluno()+"%'"+" "
                        + "AND cpf_aluno LIKE '%"+aluno.getCpf_aluno()+"%' "
                        + "AND status_aluno = "+aluno.getStatus_aluno());
        try {
            while (rs.next()) {
                lista.add(new AlunoBEAN(rs.getInt("codigo_aluno"), 
                                            rs.getString("nome_aluno"), 
                                            rs.getString("cpf_aluno"), 
                                            rs.getInt("status_aluno")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
