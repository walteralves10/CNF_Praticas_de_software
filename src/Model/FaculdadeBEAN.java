package Model;

public class FaculdadeBEAN {
    
    private int codigo_faculdade;
    private String nome_faculdade;
    private int status_faculdade;

    public FaculdadeBEAN() {
    }

    public FaculdadeBEAN(int codigo_faculdade) {
        this.codigo_faculdade = codigo_faculdade;
    }

    public FaculdadeBEAN(int codigo_faculdade, String nome_faculdade, int status_faculdade) {
        this.codigo_faculdade = codigo_faculdade;
        this.nome_faculdade = nome_faculdade;
        this.status_faculdade = status_faculdade;
    }

    public FaculdadeBEAN(String nome_faculdade, int status_faculdade) {
        this.nome_faculdade = nome_faculdade;
        this.status_faculdade = status_faculdade;
    }

    public int getCodigo_faculdade() {
        return codigo_faculdade;
    }

    public void setCodigo_faculdade(int codigo_faculdade) {
        this.codigo_faculdade = codigo_faculdade;
    }

    public String getNome_faculdade() {
        return nome_faculdade;
    }

    public void setNome_faculdade(String nome_faculdade) {
        this.nome_faculdade = nome_faculdade;
    }

    public int getStatus_faculdade() {
        return status_faculdade;
    }

    public void setStatus_faculdade(int status_faculdade) {
        this.status_faculdade = status_faculdade;
    }

    
    
    
    
}
