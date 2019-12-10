package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FaculdadeDAO {

    private static FaculdadeDAO instance;
    private static final int DESATIVADO = 1;
    private static final int ATIVOS = 0;

    public FaculdadeDAO() {
        MySQLDAO.getConnection();
    }

    public static FaculdadeDAO getInstance() {
        if (instance == null) {
            instance = new FaculdadeDAO();
        }
        return instance;
    }

    public long create(FaculdadeBEAN facul) {
        String query = "INSERT INTO faculdade(nome_faculdade, status_faculdade) VALUES (?,?)";
        return MySQLDAO.executeQuery(query, facul.getNome_faculdade(), facul.getStatus_faculdade());
    }

    public void update(FaculdadeBEAN facul) {
        String query = "UPDATE faculdade SET nome_faculdade=?, status_faculdade=? WHERE codigo_faculdade = ?";
        MySQLDAO.executeQuery(query, facul.getNome_faculdade(), facul.getStatus_faculdade(),
                facul.getCodigo_faculdade());
    }

    public void delete(FaculdadeBEAN facul) {
        MySQLDAO.executeQuery("UPDATE faculdade SET status_faculdade= " + DESATIVADO + " "
                + "WHERE codigo_faculdade = ?", facul.getCodigo_faculdade());
    }

    public ArrayList<FaculdadeBEAN> findAllFaculdade() {
        return listaFaculdades("SELECT * FROM faculdade WHERE status_faculdade = " + ATIVOS + " "
                + "ORDER BY codigo_faculdade");//
    }

    public FaculdadeBEAN findAllFaculdadeInativas(int codigo){
        return listaFaculdadesInativas("SELECT * FROM faculdade WHERE codigo_faculdade=" + codigo+ " "
                + "ORDER BY codigo_faculdade");
    }
        

    public ArrayList<FaculdadeBEAN> listaFaculdades(String query) {
        ArrayList<FaculdadeBEAN> lista = new ArrayList<FaculdadeBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new FaculdadeBEAN(rs.getInt("codigo_faculdade"),
                        rs.getString("nome_faculdade"),
                        rs.getInt("status_faculdade")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public FaculdadeBEAN listaFaculdadesInativas(String query) {
        FaculdadeBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                result = (new FaculdadeBEAN(rs.getInt("codigo_faculdade"),
                        rs.getString("nome_faculdade"),
                        rs.getInt("status_faculdade")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    //listaStatusFaculdade
    public FaculdadeBEAN listaStatusFaculdade(int codigo) {
        FaculdadeBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM faculdade WHERE codigo_faculdade=" + codigo);
        try {
            while (rs.next()) {
                result = (new FaculdadeBEAN(rs.getInt("codigo_faculdade"),
                        rs.getString("nome_faculdade"),
                        rs.getInt("status_faculdade")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<FaculdadeBEAN> listaFaculdadesPorNome(FaculdadeBEAN facul) {
        ArrayList<FaculdadeBEAN> lista = new ArrayList<FaculdadeBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM faculdade WHERE "
                + "nome_faculdade LIKE '%" + facul.getNome_faculdade() + "%'" + ""
                + "AND status_faculdade = " + facul.getStatus_faculdade());
        try {
            while (rs.next()) {
                lista.add(new FaculdadeBEAN(rs.getInt("codigo_faculdade"),
                        rs.getString("nome_faculdade"),
                        rs.getInt("status_faculdade")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    //unicaDisciplina
    public FaculdadeBEAN unicaFaculdade(FaculdadeBEAN facul) {
        FaculdadeBEAN lista = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM faculdade WHERE nome_faculdade = '" + facul.getNome_faculdade() + "'");
        try {
            while (rs.next()) {
                lista = (new FaculdadeBEAN(rs.getInt("codigo_faculdade"),
                        rs.getString("nome_faculdade"),
                        rs.getInt("status_faculdade")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
