package Model;

public class TurmaBEAN {
    
    private int codigo_turma;
    private int fk_codigo_disciplina;
    private int fk_codigo_professor;
    private int semestre_turma;
    private int ano_turma;
    private int status_turma;

    public TurmaBEAN(int codigo_turma) {
        this.codigo_turma = codigo_turma;
    }
    
    public TurmaBEAN(int codigo_turma, int fk_codigo_disciplina, int fk_codigo_professor, int semestre_turma, int ano_turma, int status_turma) {
        this.codigo_turma = codigo_turma;
        this.fk_codigo_disciplina = fk_codigo_disciplina;
        this.fk_codigo_professor = fk_codigo_professor;
        this.semestre_turma = semestre_turma;
        this.ano_turma = ano_turma;
        this.status_turma = status_turma;
    }

    public TurmaBEAN(int fk_codigo_disciplina, int fk_codigo_professor, int semestre_turma, int ano_turma, int status_turma) {
        this.fk_codigo_disciplina = fk_codigo_disciplina;
        this.fk_codigo_professor = fk_codigo_professor;
        this.semestre_turma = semestre_turma;
        this.ano_turma = ano_turma;
        this.status_turma = status_turma;
    }
    
    public int getCodigo_turma() {
        return codigo_turma;
    }

    public void setCodigo_turma(int codigo_turma) {
        this.codigo_turma = codigo_turma;
    }

    public int getFk_codigo_disciplina() {
        return fk_codigo_disciplina;
    }

    public void setFk_codigo_disciplina(int fk_codigo_disciplina) {
        this.fk_codigo_disciplina = fk_codigo_disciplina;
    }

    public int getFk_codigo_professor() {
        return fk_codigo_professor;
    }

    public void setFk_codigo_professor(int fk_codigo_professor) {
        this.fk_codigo_professor = fk_codigo_professor;
    }

    public int getSemestre_turma() {
        return semestre_turma;
    }

    public void setSemestre_turma(int semestre_turma) {
        this.semestre_turma = semestre_turma;
    }

    public int getAno_turma() {
        return ano_turma;
    }

    public void setAno_turma(int ano_turma) {
        this.ano_turma = ano_turma;
    }

    public int getStatus_turma() {
        return status_turma;
    }

    public void setStatus_turma(int status_turma) {
        this.status_turma = status_turma;
    }
    
}
