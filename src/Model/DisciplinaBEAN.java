package Model;

import java.sql.Date;

public class DisciplinaBEAN {

    private int codigo_disciplina;
    private String nome_disciplina;
    private int carga_horaria_disciplina;
    private int fk_codigo_faculdade;
    private int status_disciplina;
    private String ultimaAtualizacao;

    public DisciplinaBEAN() {
    }
    
    public DisciplinaBEAN(int codigo_disciplina) {
        this.codigo_disciplina = codigo_disciplina;
    }

    public DisciplinaBEAN(int codigo_disciplina, String nome_disciplina, int carga_horaria_disciplina,
            int fk_codigo_faculdade, int status_disciplina, String ultimaAtualizacao) {
        this.codigo_disciplina = codigo_disciplina;
        this.nome_disciplina = nome_disciplina;
        this.carga_horaria_disciplina = carga_horaria_disciplina;
        this.fk_codigo_faculdade = fk_codigo_faculdade;
        this.status_disciplina = status_disciplina;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    public DisciplinaBEAN(int codigo_disciplina, String nome_disciplina, int carga_horaria_disciplina,
            int fk_codigo_faculdade, int status_disciplina
            //, Date ultimaAtualizacao
    ) {
        this.codigo_disciplina = codigo_disciplina;
        this.nome_disciplina = nome_disciplina;
        this.carga_horaria_disciplina = carga_horaria_disciplina;
        this.fk_codigo_faculdade = fk_codigo_faculdade;
        this.status_disciplina = status_disciplina;
        //this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public DisciplinaBEAN(String nome_disciplina, int carga_horaria_disciplina, int fk_codigo_faculdade, int status_disciplina, String ultimaAtualizacao) {
        this.nome_disciplina = nome_disciplina;
        this.carga_horaria_disciplina = carga_horaria_disciplina;
        this.fk_codigo_faculdade = fk_codigo_faculdade;
        this.status_disciplina = status_disciplina;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public int getCodigo_disciplina() {
        return codigo_disciplina;
    }

    public void setCodigo_disciplina(int codigo_disciplina) {
        this.codigo_disciplina = codigo_disciplina;
    }

    public String getNome_disciplina() {
        return nome_disciplina;
    }

    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }

    public int getCarga_horaria_disciplina() {
        return carga_horaria_disciplina;
    }

    public void setCarga_horaria_disciplina(int carga_horaria_disciplina) {
        this.carga_horaria_disciplina = carga_horaria_disciplina;
    }

    public int getFk_codigo_faculdade() {
        return fk_codigo_faculdade;
    }

    public void setFk_codigo_faculdade(int fk_codigo_faculdade) {
        this.fk_codigo_faculdade = fk_codigo_faculdade;
    }

    public int getStatus_disciplina() {
        return status_disciplina;
    }

    public void setStatus_disciplina(int status_disciplina) {
        this.status_disciplina = status_disciplina;
    }

    public String getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(String ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    

}
