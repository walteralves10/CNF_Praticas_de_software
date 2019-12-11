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
        String query = "INSERT INTO turma(fk_codigo_disciplina,"
                + " fk_codigo_professor, semestre_turma, "
                + "ano_turma, status_turma) VALUES (?,?,?,?,?)";
        return MySQLDAO.executeQuery(query, 
                turma.getFk_codigo_disciplina(), 
                turma.getFk_codigo_professor(), 
                turma.getSemestre_turma(), 
                turma.getAno_turma(), turma.getStatus_turma());

    }

    public void update(TurmaBEAN turma) {
        String query = "UPDATE turma SET fk_codigo_disciplina=?, "
                + "fk_codigo_professor=?, "
                + "semestre_turma=?, "
                + "ano_turma=?, "
                + "status_turma=? "
                + "WHERE codigo_turma = ?";
        MySQLDAO.executeQuery(query, 
                turma.getFk_codigo_disciplina(), 
                turma.getFk_codigo_professor(), 
                turma.getSemestre_turma(), 
                turma.getAno_turma(), turma.getStatus_turma());
    }

    public void delete(TurmaBEAN turma) {
        //MySQLDAO.executeQuery("DELETE FROM professor WHERE codigo_professor = ?", prof.getCodigo_professor());
        MySQLDAO.executeQuery("UPDATE turma SET status_turma = " + DESATIVADO + " "
                + "WHERE codigo_turma = ?", turma.getCodigo_turma());
    }

    public ArrayList<TurmaBEAN> findAllTurma() {
        return listaTurma("SELECT * FROM turma WHERE status_turma = " + ATIVOS + " "
                + "ORDER BY ano_turma");//
    }

    public ArrayList<TurmaBEAN> listaTurma(String query) {
        ArrayList<TurmaBEAN> lista = new ArrayList<TurmaBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new TurmaBEAN(rs.getInt("codigo_turma"),
                        rs.getInt("fk_codigo_disciplina"),
                        rs.getInt("fk_codigo_professor"),
                        rs.getInt("semestre_turma"),
                        rs.getInt("ano_turma"),
                        rs.getInt("status_turma")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
        public ArrayList<TurmaBEAN> listaTurmaPorAno(TurmaBEAN turma){
        ArrayList<TurmaBEAN> lista = new ArrayList<TurmaBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM turma "
                + "WHERE ano_turma = "+ turma.getAno_turma());
        try {
            while (rs.next()) {
                lista.add(new TurmaBEAN(rs.getInt("codigo_turma"),
                        rs.getInt("fk_codigo_disciplina"),
                        rs.getInt("fk_codigo_professor"),
                        rs.getInt("semestre_turma"),
                        rs.getInt("ano_turma"),
                        rs.getInt("status_turma")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    //listaStatusTurma
    public TurmaBEAN listaStatusTurma(int codigo){
        TurmaBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM turma WHERE codigo_turma="+codigo);
        try {
            while (rs.next()) {
                result = (new TurmaBEAN(rs.getInt("codigo_turma"),
                        rs.getInt("fk_codigo_disciplina"),
                        rs.getInt("fk_codigo_professor"),
                        rs.getInt("semestre_turma"),
                        rs.getInt("ano_turma"),
                        rs.getInt("status_turma")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }        
    
    public int listaUltimaTurma(){
        
        int result = 0;
        
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT max(codigo_turma) FROM turma");
        try {
            while(rs.next()){
                result = rs.getInt("max(codigo_turma)");
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }
}
