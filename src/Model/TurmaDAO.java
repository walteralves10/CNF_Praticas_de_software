package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TurmaDAO {

    private static TurmaDAO instance;
    private static final int DESATIVADO = 1;
    private static final int ATIVOS = 0;

    public TurmaDAO() {//TurmaBEAN
        MySQLDAO.getConnection();
    }

    public static TurmaDAO getInstance() {
        if (instance == null) {
            instance = new TurmaDAO();
        }
        return instance;
    }

    public long create(TurmaBEAN turma) {
        String query = "INSERT INTO turma(nome_aluno, cpf_aluno, status_aluno) VALUES (?,?,?)";
        return MySQLDAO.executeQuery(query, );

    }

    public void update(TurmaBEAN turma) {
        String query = "UPDATE aluno SET nome_aluno=?,cpf_aluno=?,status_aluno=? "
                + "WHERE codigo_aluno = ?";
        MySQLDAO.executeQuery(query, aluno.getNome_aluno(), aluno.getCpf_aluno(),
                aluno.getStatus_aluno(), aluno.getCodigo_aluno());
    }

    public void delete(TurmaBEAN turma) {
        //MySQLDAO.executeQuery("DELETE FROM professor WHERE codigo_professor = ?", prof.getCodigo_professor());
        MySQLDAO.executeQuery("UPDATE aluno SET status_aluno = " + DESATIVADO + " "
                + "WHERE codigo_aluno = ?", aluno.getCodigo_aluno());
    }

    public ArrayList<TurmaBEAN> findAllAluno() {
        return listaAluno("SELECT * FROM aluno WHERE status_aluno = " + ATIVOS + " "
                + "ORDER BY nome_aluno");//
    }

    public ArrayList<TurmaBEAN> listaAluno(String query) {
        ArrayList<TurmaBEAN> lista = new ArrayList<TurmaBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new TurmaBEAN(rs.getInt(""),
                        rs.getInt(""),
                        rs.getInt(""),
                        rs.getInt(""),
                        rs.getInt("")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

}
