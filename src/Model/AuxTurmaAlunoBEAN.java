package Model;

public class AuxTurmaAlunoBEAN {
    private int fk_codigo_aluno;
    private int fk_codigo_turma;

    public AuxTurmaAlunoBEAN(int fk_codigo_aluno, int fk_codigo_turma) {
        this.fk_codigo_aluno = fk_codigo_aluno;
        this.fk_codigo_turma = fk_codigo_turma;
    }

    public int getFk_codigo_aluno() {
        return fk_codigo_aluno;
    }

    public void setFk_codigo_aluno(int fk_codigo_aluno) {
        this.fk_codigo_aluno = fk_codigo_aluno;
    }

    public int getFk_codigo_turma() {
        return fk_codigo_turma;
    }

    public void setFk_codigo_turma(int fk_codigo_turma) {
        this.fk_codigo_turma = fk_codigo_turma;
    }
}
