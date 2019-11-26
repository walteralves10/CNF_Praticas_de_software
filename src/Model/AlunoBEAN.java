package Model;

public class AlunoBEAN {
    
    private int codigo_aluno;
    private String nome_aluno;
    private String cpf_aluno;
    private int status_aluno;

    public AlunoBEAN(int codigo_aluno) {
        this.codigo_aluno = codigo_aluno;
    }

    public AlunoBEAN(String nome_aluno, String cpf_aluno, int status_aluno) {
        this.nome_aluno = nome_aluno;
        this.cpf_aluno = cpf_aluno;
        this.status_aluno = status_aluno;
    }

    public AlunoBEAN(int codigo_aluno, String nome_aluno, String cpf_aluno, int status_aluno) {
        this.codigo_aluno = codigo_aluno;
        this.nome_aluno = nome_aluno;
        this.cpf_aluno = cpf_aluno;
        this.status_aluno = status_aluno;
    }

    public int getCodigo_aluno() {
        return codigo_aluno;
    }

    public void setCodigo_aluno(int codigo_aluno) {
        this.codigo_aluno = codigo_aluno;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getCpf_aluno() {
        return cpf_aluno;
    }

    public void setCpf_aluno(String cpf_aluno) {
        this.cpf_aluno = cpf_aluno;
    }

    public int getStatus_aluno() {
        return status_aluno;
    }

    public void setStatus_aluno(int status_aluno) {
        this.status_aluno = status_aluno;
    }
    
}
