import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private int numeroMatricula;
    private List<Turma> turmasAluno;
    private List<Disciplina> disciplinas;
    
    public List<Turma> getTurmasAluno() {
        return turmasAluno;
    }

    public Aluno(String nomeCompleto, String dataNascimento, String endereco, String telefone, String cpf,
                 int numeroMatricula) {
        super(nomeCompleto, dataNascimento, endereco, telefone, cpf);
        this.numeroMatricula = numeroMatricula;
        this.turmasAluno = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

     public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void adicionarTurma(Turma turma) {
        this.turmasAluno.add(turma);
    }

    public void emitirDeclaracaoMatricula() {
        System.out.println("Declaração de Vínculo para o Aluno(a): " + getNomeCompleto());
        System.out.println("Matrícula: " + numeroMatricula);
        System.out.println("Turmas em que está matriculado:");
         for(Disciplina disciplina : disciplinas){
            System.out.println("Nome da disciplina: " + disciplina.getNome());
            System.out.println("Código da disciplina: " + disciplina.getCodigo());
        }
        for(Turma turma : turmasAluno) {
            System.out.println("Código da Turma: " + turma.getCodigo());
            
        }

    }

    public void removerTurma(Turma turma) {
        if (turmasAluno.contains(turma)) {
            turmasAluno.remove(turma);
            System.out.println("Turma " + turma.getCodigo() + " removida do aluno(a) " + getNomeCompleto());
        } else {
            System.out.println("Turma não encontrada para o aluno(a) " + getNomeCompleto());
        }
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        if (!disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
            System.out.println("Aluno(a) " + getNomeCompleto() + " matriculado na disciplina " + disciplina.getNome());
        } else {
            System.out.println("Aluno(a) já está matriculado na disciplina " + disciplina.getNome());
        }
    }

    public void removerDisciplina(Disciplina disciplina) {
        if (disciplinas.contains(disciplina)) {
            disciplinas.remove(disciplina);
            System.out.println("A disciplina " + disciplina.getNome() + " foi removida do aluno(a) " + getNomeCompleto() + ". " + "Numero de matricula do aluno:" + " " + numeroMatricula);
        } else {
            System.out.println("Disciplina não encontrada " + disciplina.getNome());
        }
    }

    public String toString() {
        return "Nome: " + getNomeCompleto() + ", Data de nascimento: " + getDataNascimento() + ", Endereço: " + getEndereco() + ", Telefone: " + getTelefone() + ", CPF: " + getCpf() + ", Matrícula: " + numeroMatricula;
    }
}
