package Model;

public class ProfessorBEAN {
    
    private int codigo_professor;
    private String nome_professor;
    private String cpf_professor;
    private int status_professor; 

    public ProfessorBEAN(int codigo_professor) {
        this.codigo_professor = codigo_professor;
    }

    public ProfessorBEAN(int codigo_professor, String nome_professor, String cpf_professor, int status_professor) {
        this.codigo_professor = codigo_professor;
        this.nome_professor = nome_professor;
        this.cpf_professor = cpf_professor;
        this.status_professor = status_professor;
    }
    
    public ProfessorBEAN(String nome_professor, String cpf_professor, int status_professor) {
        //this.codigo_professor = codigo_professor;
        this.nome_professor = nome_professor;
        this.cpf_professor = cpf_professor;
        this.status_professor = status_professor;
    }

    public int getCodigo_professor() {
        return codigo_professor;
    }

    public String getNome_professor() {
        return nome_professor;
    }

    public void setNome_professor(String nome_professor) {
        this.nome_professor = nome_professor;
    }

    public String getCpf_professor() {
        return cpf_professor;
    }

    public void setCpf_professor(String cpf_professor) {
        this.cpf_professor = cpf_professor;
    }

    public int getStatus_professor() {
        return status_professor;
    }

    public void setStatus_professor(int status_professor) {
        this.status_professor = status_professor;
    }
    
    
    
}
