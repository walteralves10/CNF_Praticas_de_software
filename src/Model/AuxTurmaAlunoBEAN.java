package Model;

public class AuxTurmaAlunoBEAN {
    private AlunoBEAN fk_codigo_aluno;
    private TurmaBEAN fk_codigo_turma;

    public AuxTurmaAlunoBEAN(AlunoBEAN fk_codigo_aluno, TurmaBEAN fk_codigo_turma) {
        this.fk_codigo_aluno = fk_codigo_aluno;
        this.fk_codigo_turma = fk_codigo_turma;
    }

    public AlunoBEAN getFk_codigo_aluno() {
        return fk_codigo_aluno;
    }

    public void setFk_codigo_aluno(AlunoBEAN fk_codigo_aluno) {
        this.fk_codigo_aluno = fk_codigo_aluno;
    }

    public TurmaBEAN getFk_codigo_turma() {
        return fk_codigo_turma;
    }

    public void setFk_codigo_turma(TurmaBEAN fk_codigo_turma) {
        this.fk_codigo_turma = fk_codigo_turma;
    }
}
