import java.util.ArrayList;
import java.util.List;
public class Turma {
    private String horario;
    private int codigo;
    private int quantidadeMaxAlunos;
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Disciplina> disciplinas;
    
    public Turma(String horario, int codigo, int quantidadeMaxAlunos) {
        this.horario = horario;
        this.codigo = codigo;
        this.quantidadeMaxAlunos = quantidadeMaxAlunos;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setQuantidadeMaxAlunos(int quantidadeMaxAlunos) {
        this.quantidadeMaxAlunos = quantidadeMaxAlunos;
    }

    public String getHorario() {
        return horario;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public int getQuantidadeMaxAlunos() {
        return quantidadeMaxAlunos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public String toString(){
        return "horário: " + horario + ", Código: " + codigo + ", Qtdmax de alunos: " + quantidadeMaxAlunos;
    }

    public void adicionarAluno(Aluno aluno) {
        if (alunos.contains(aluno)){
            System.out.println(("O aluno(a) " + aluno.getNomeCompleto() + " já está matriculado na turma!"));
        }
        else if (alunos.size() < quantidadeMaxAlunos) {
            alunos.add(aluno);
            aluno.adicionarTurma(this);
            System.out.println("Aluno(a): " + aluno.getNomeCompleto() + ", adicionado à turma: " + codigo);
        }
        else {
            System.out.println("Turma cheia. Não é possível adicionar mais alunos.");
        }
    }
    
    public void removerAluno(Aluno aluno) {
        if (alunos.contains(aluno)) {
            alunos.remove(aluno);
            aluno.removerTurma(this);
            System.out.println("Aluno " + aluno.getNomeCompleto() + " removido da turma " + codigo);
        } else {
            System.out.println("Aluno não encontrado na turma " + codigo);
        }
    }

    public void adicionarProfessor(Professor professor) {
        if (professores.size() == 0) {
            professores.add(professor);
            professor.adicionarTurma(this);
            System.out.println("Professor: " + professor.getNomeCompleto() + ", adicionado à turma: " + codigo);
        } else {
            System.out.println("Turma cheia. Não é possível adicionar mais professores.");
        }
     }  

    public void substituirProfessor(Professor professor, Professor novoProfessor) {
        if (professores.contains(professor)) {
            professor = novoProfessor;
            System.out.println("Novo professor : " + novoProfessor );
        } else {
            System.out.println("Professor não encontrado na turma " + codigo);
        }
    }
   
    public void removerProfessor(Professor professor) {
        if (professores.contains(professor)) {
            professores.remove(professor);
            professor.removerTurma(this);
            System.out.println("Professor " + professor.getNomeCompleto() + " removido da turma " + codigo);
        } else {
            System.out.println("Professor não encontrado na turma " + codigo);
        }
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        if (disciplinas.size() == 0) {
            disciplinas.add(disciplina);
            System.out.println("Disciplina " + disciplina.getNome() + " adicionada à turma " + getCodigo());
        } else {
            System.out.println("Essa turma já possui uma disciplina associada!");
        }
    }   

    public void removerDisciplina(Disciplina disciplina) {
        if (disciplinas.contains(disciplina)) {
            disciplinas.remove(disciplina);
            System.out.println("A disciplina " + disciplina.getNome() + " foi removida da turma " + codigo);
        } else {
            System.out.println("Disciplina nao encontrado na turma " + codigo);
        }
    }
                                                                                   
    public void imprimirDetalhesTurma() {
        System.out.println("Detalhes da Turma " + codigo + ":");
        System.out.println("Disciplina: " + disciplinas);
        System.out.println("Horário: " + horario);

  
        System.out.println("Professor:");
        for (Professor professor : professores) {
            System.out.println(professor);   
        System.out.println("Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
     }
   }
}      