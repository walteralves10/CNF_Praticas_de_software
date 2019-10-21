package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DisciplinaDAO {
    
    private static DisciplinaDAO instance;
    private static final int DESATIVADO = 1;
    private static final int ATIVOS = 0;
    
    public DisciplinaDAO() {
        MySQLDAO.getConnection();
    }
    
    public static DisciplinaDAO getInstance(){
        if(instance == null){
            instance = new DisciplinaDAO();
        }
        return instance;
    }
    
    public long create(DisciplinaBEAN disc){
        String query = "INSERT INTO disciplina(nome_disciplina, carga_horaria_disciplina, "
                + "fk_codigo_faculdade, status_disciplina) VALUES (?,?,?,?)";
        return MySQLDAO.executeQuery(query, disc.getNome_disciplina(), disc.getCarga_horaria_disciplina(),
                disc.getFk_codigo_faculdade(), disc.getStatus_disciplina());
    }
    
    public void update(DisciplinaBEAN disc){
        String query = "UPDATE disciplina SET nome_disciplina= ?,carga_horaria_disciplina= ?"
                + ",fk_codigo_faculdade= ?,status_disciplina= ? WHERE codigo_disciplina = ?";
        MySQLDAO.executeQuery(query, disc.getNome_disciplina(), disc.getCarga_horaria_disciplina(),
                disc.getFk_codigo_faculdade(), disc.getStatus_disciplina(), disc.getCodigo_disciplina());
    }
    
    public void delete(DisciplinaBEAN disc){
        MySQLDAO.executeQuery("UPDATE disciplina SET status_disciplina= "+ DESATIVADO +" "
                + "WHERE codigo_disciplina = ?", disc.getCodigo_disciplina());
    }
    
    public ArrayList<DisciplinaBEAN> findAllDisciplina() {
        return listaDisciplinas("SELECT * FROM disciplina WHERE status_disciplina = "+ATIVOS+" "
                + "ORDER BY nome_disciplina");//
    }

    public ArrayList<DisciplinaBEAN> listaDisciplinas(String query) {
        ArrayList<DisciplinaBEAN> lista = new ArrayList<DisciplinaBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new DisciplinaBEAN(rs.getInt("codigo_disciplina"), 
                                            rs.getString("nome_disciplina"),
                                            rs.getInt("carga_horaria_disciplina"),
                                            rs.getInt("fk_codigo_faculdade"),
                                            rs.getInt("status_disciplina")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    //listaStatusDisciplina
    public DisciplinaBEAN listaStatusDisciplina(int codigo){
        DisciplinaBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM disciplina WHERE codigo_disciplina="+codigo);
        try {
            while (rs.next()) {
                result = (new DisciplinaBEAN(rs.getInt("codigo_disciplina"), 
                                            rs.getString("nome_disciplina"),
                                            rs.getInt("carga_horaria_disciplina"),
                                            rs.getInt("fk_codigo_faculdade"),
                                            rs.getInt("status_disciplina")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }      
    
    public DisciplinaBEAN listaDisciplinaPorNome(String nome){
        DisciplinaBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM disciplina WHERE nome_disciplina="+nome);
        try {
            while (rs.next()) {
                result = (new DisciplinaBEAN(rs.getInt("codigo_disciplina"), 
                                            rs.getString("nome_disciplina"),
                                            rs.getInt("carga_horaria_disciplina"),
                                            rs.getInt("fk_codigo_faculdade"),
                                            rs.getInt("status_disciplina")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }     
    
    public ArrayList<DisciplinaBEAN> listaDisciplinaPorNome(DisciplinaBEAN disc){
        ArrayList<DisciplinaBEAN> lista = new ArrayList<DisciplinaBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM disciplina "
                + "WHERE nome_disciplina LIKE '%"+disc.getNome_disciplina()+"%'"+""
                + "AND status_disciplina = "+disc.getStatus_disciplina()+""
                        + " AND carga_horaria_disciplina = "+disc.getCarga_horaria_disciplina()+""
                        + " AND fk_codigo_faculdade = "+disc.getFk_codigo_faculdade());
        try {
            while (rs.next()) {
                lista.add(new DisciplinaBEAN(rs.getInt("codigo_disciplina"), 
                                            rs.getString("nome_disciplina"),
                                            rs.getInt("carga_horaria_disciplina"),
                                            rs.getInt("fk_codigo_faculdade"),
                                            rs.getInt("status_disciplina")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
