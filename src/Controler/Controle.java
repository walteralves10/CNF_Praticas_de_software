package Controler;

import Model.AlunoBEAN;
import Model.AlunoDAO;
import Model.AuxTurmaAlunoBEAN;
import Model.AuxTurmaAlunoDAO;
import Model.DisciplinaBEAN;
import Model.DisciplinaDAO;
import Model.FaculdadeBEAN;
import Model.FaculdadeDAO;
import Model.ProfessorBEAN;
import Model.ProfessorDAO;
import Model.TurmaBEAN;
import Model.TurmaDAO;
import Model.UsuarioBEAN;
import Model.UsuarioDAO;
import java.util.ArrayList;


public class Controle {
    
    public void addUsuario(UsuarioBEAN usuario){
        UsuarioDAO.getInstance().create(usuario);
    }
    public void updateUsuario(UsuarioBEAN usuario){
        UsuarioDAO.getInstance().update(usuario);
    }
    public void deleteUsuario(UsuarioBEAN usuario){
        UsuarioDAO.getInstance().delete(usuario);
    }    
    public ArrayList<UsuarioBEAN> listaUsuario(){
        return UsuarioDAO.getInstance().findAllUsuario();
    }
    public Boolean isExist(String email, String senha){
        return UsuarioDAO.getInstance().isExist(email, senha);
    }
    
    public void addProfessor(ProfessorBEAN prof){
        ProfessorDAO.getInstance().create(prof);
    }
    public void updateProfessor(ProfessorBEAN prof){
        ProfessorDAO.getInstance().update(prof);
    }
    public void deleteProfessor(ProfessorBEAN prof){
        ProfessorDAO.getInstance().delete(prof);
    }
    public ArrayList<ProfessorBEAN> listaProfessores(){
        return ProfessorDAO.getInstance().findAllProfessor();
    }
    public ProfessorBEAN listaStatusProfessor(int codigo){
        return ProfessorDAO.getInstance().listaStatusProfessor(codigo);
    }
    public ArrayList<ProfessorBEAN> listaProfessorPorNome(ProfessorBEAN prof){
        return ProfessorDAO.getInstance().listaProfessorPorNome(prof);
    }
    public ProfessorBEAN unicoProfessor(ProfessorBEAN nome){
        return ProfessorDAO.getInstance().unicoProfessor(nome);
    }
    
    public void addFaculdade(FaculdadeBEAN facul){
        FaculdadeDAO.getInstance().create(facul);
    }
    public void updateFaculdade(FaculdadeBEAN facul){
        FaculdadeDAO.getInstance().update(facul);
    }
    public void deleteFaculdade(FaculdadeBEAN facul){
        FaculdadeDAO.getInstance().delete(facul);
    }
    public ArrayList<FaculdadeBEAN> listaFaculdades(){
        return FaculdadeDAO.getInstance().findAllFaculdade();
    }
    public FaculdadeBEAN listaFaculdadesInativas(int codigo){
        return FaculdadeDAO.getInstance().findAllFaculdadeInativas(codigo);
    }
    public FaculdadeBEAN listaStatusFaculdade(int codigo){
        return FaculdadeDAO.getInstance().listaStatusFaculdade(codigo);
    }
    public ArrayList<FaculdadeBEAN> listaFaculdadesPorNome(FaculdadeBEAN facul){
        return FaculdadeDAO.getInstance().listaFaculdadesPorNome(facul);
    }
    public FaculdadeBEAN unicaFaculdade(FaculdadeBEAN nome){
        return FaculdadeDAO.getInstance().unicaFaculdade(nome);
    }
    
    public void addDisciplina(DisciplinaBEAN disc){
        DisciplinaDAO.getInstance().create(disc);
    }
    public void updateDisciplina(DisciplinaBEAN disc){
        DisciplinaDAO.getInstance().update(disc);
    }
    public void deleteDisciplina(DisciplinaBEAN disc){
        DisciplinaDAO.getInstance().delete(disc);
    }
    public ArrayList<DisciplinaBEAN> listaDisciplinas(){
        return DisciplinaDAO.getInstance().findAllDisciplina();
    }
    public DisciplinaBEAN listaStatusDisciplina(int codigo){
        return DisciplinaDAO.getInstance().listaStatusDisciplina(codigo);
    }
    public ArrayList<DisciplinaBEAN> listaDisciplinaPorNome(DisciplinaBEAN disc){
        return DisciplinaDAO.getInstance().listaDisciplinaPorNome(disc);
    }
    public DisciplinaBEAN unicaDisciplina(DisciplinaBEAN nome){
        return DisciplinaDAO.getInstance().unicaDisciplina(nome);
    }
    
    public void addAluno(AlunoBEAN aluno){
        AlunoDAO.getInstance().create(aluno);
    }
    public void updateAluno(AlunoBEAN aluno){
        AlunoDAO.getInstance().update(aluno);
    }
    public void deleteAluno(AlunoBEAN aluno){
        AlunoDAO.getInstance().delete(aluno);
    }
    public ArrayList<AlunoBEAN> listaAluno(){
        return AlunoDAO.getInstance().findAllAluno();
    }
    public ArrayList<AlunoBEAN> listaAlunoPorNome(AlunoBEAN aluno){
        return AlunoDAO.getInstance().listaAlunoPorNome(aluno);
    }
    public AlunoBEAN listaStatusAluno(int codigo){
        return AlunoDAO.getInstance().listaStatusAluno(codigo);
    }
    
    public void addTurma(TurmaBEAN turma){
        TurmaDAO.getInstance().create(turma);
    }
    public void updateTurma(TurmaBEAN turma){
        TurmaDAO.getInstance().update(turma);
    }
    public void deleteTurma(TurmaBEAN turma){
        TurmaDAO.getInstance().delete(turma);
    }
    public ArrayList<TurmaBEAN> listaTurma(){
        return TurmaDAO.getInstance().findAllTurma();
    }
    public ArrayList<TurmaBEAN> listaTurmaPorAno(TurmaBEAN turma){
        return TurmaDAO.getInstance().listaTurmaPorAno(turma);
    }
    public TurmaBEAN listaStatusTurma(int codigo){
        return TurmaDAO.getInstance().listaStatusTurma(codigo);
    }
    public int listaUltimaTurma(){
        return TurmaDAO.getInstance().listaUltimaTurma();
    }
    
    public void addAuxTurmaAluno(int maximo, int aluno){
        AuxTurmaAlunoDAO.getInstance().create(maximo, aluno);
    }
    public void updateAuxTurmaAluno(AuxTurmaAlunoBEAN aux){
        AuxTurmaAlunoDAO.getInstance().update(aux);
    }
    public void deleteAuxTurmaAluno(AuxTurmaAlunoBEAN aux){
        AuxTurmaAlunoDAO.getInstance().delete(aux);
    }
    public ArrayList<AuxTurmaAlunoBEAN> listaAuxTurmaAluno(int id){
        return AuxTurmaAlunoDAO.getInstance().findAllAux(id);
    }
}
