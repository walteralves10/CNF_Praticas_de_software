package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Model.AlunoBEAN;


public class AuxTurmaAlunoDAO {
    
    private static AuxTurmaAlunoDAO instance;
    private static final int DESATIVADO = 1;
    private static final int ATIVOS = 0;

    public AuxTurmaAlunoDAO() {
        MySQLDAO.getConnection();
    }

    public static AuxTurmaAlunoDAO getInstance() {
        if (instance == null) {
            instance = new AuxTurmaAlunoDAO();
        }
        return instance;
    }

    public long create(AuxTurmaAlunoBEAN aux) {
        String query = "INSERT INTO auxturmaaluno(fk_codigo_aluno, fk_codigo_turma) VALUES (?,?)";
        return MySQLDAO.executeQuery(query, aux.getFk_codigo_aluno(), aux.getFk_codigo_turma());

    }

    public void update(AuxTurmaAlunoBEAN aux) {
        String query = "UPDATE auxturmaaluno SET fk_codigo_aluno=?,fk_codigo_turma=? ";
                //+ "WHERE codigo_aluno = ?";
        MySQLDAO.executeQuery(query, aux.getFk_codigo_aluno(), aux.getFk_codigo_turma());
    }

    public void delete(AuxTurmaAlunoBEAN aux) {
        //MySQLDAO.executeQuery("DELETE FROM professor WHERE codigo_professor = ?", prof.getCodigo_professor());
        //MySQLDAO.executeQuery("UPDATE aluno SET status_aluno = " + DESATIVADO + " "
          //      + "WHERE codigo_aluno = ?", aluno.getCodigo_aluno());
    }

    public ArrayList<AuxTurmaAlunoBEAN> findAllAluno() {
        return listaAluno("SELECT * FROM auxturmaaluno");//
    }

    public ArrayList<AuxTurmaAlunoBEAN> listaAluno(String query) {
        ArrayList<AuxTurmaAlunoBEAN> lista = new ArrayList<AuxTurmaAlunoBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                //lista.add(new AuxTurmaAlunoBEAN(rs.getObject("fk_codigo_aluno", Class.forName(AlunoBEAN)),//fk_codigo_aluno, fk_codigo_turma
                  //      rs.getObject("fk_codigo_turma", Class.forName(AlunoBEAN))));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
}
