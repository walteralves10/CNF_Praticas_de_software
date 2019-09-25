package Model;

public class FaculdadeBEAN {
    
    private int codigo_professor;
    private String nome_professor;
    private String cpf_professor;
    private int status_disciplina;

    public FaculdadeBEAN(int codigo_professor, String nome_professor, String cpf_professor) {
        this.codigo_professor = codigo_professor;
        this.nome_professor = nome_professor;
        this.cpf_professor = cpf_professor;
    }

    public int getCodigo_professor() {
        return codigo_professor;
    }

    public void setCodigo_professor(int codigo_professor) {
        this.codigo_professor = codigo_professor;
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

    public int getStatus_disciplina() {
        return status_disciplina;
    }

    public void setStatus_disciplina(int status_disciplina) {
        this.status_disciplina = status_disciplina;
    }
}
