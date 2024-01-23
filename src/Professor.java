import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private int numeroMatricula;
    private List<Turma> turmas;
    private List<Disciplina> disciplinas;
    
    public Professor(String nomeCompleto, String dataNascimento, String endereco, String telefone, String cpf,
                     int numeroMatricula) {
        super(nomeCompleto, dataNascimento, endereco, telefone, cpf);
        this.numeroMatricula = numeroMatricula;
        this.turmas = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        if (!disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
            System.out.println("Disciplina " + disciplina.getNome() + " adicionada ao professor(a) " + getNomeCompleto());
        } else {
            System.out.println("O professor(a) já leciona a disciplina " + disciplina.getNome());
        }
    }

    public void removerDisciplina(Disciplina disciplina) {
        if (disciplinas.contains(disciplina)) {
            disciplinas.remove(disciplina);
            System.out.println("A disciplina " + disciplina.getNome() + " foi removida do professor(a) " + getNomeCompleto() + ". "  + "Numero de matricula do professor:" + " " + numeroMatricula);
        } else {
            System.out.println("Disciplina não encontrada " + disciplina.getNome());
        }
    }

    public void removerTurma(Turma turma) {
        if (turmas.contains(turma)) {
            turmas.remove(turma);
            System.out.println("Turma " + turma.getCodigo() + " removida do professor(a) " + getNomeCompleto());
        } else {
            System.out.println("Turma não encontrada para o professora(a) " + getNomeCompleto());
        }
    }

    public void emitirDeclaracaoVinculo() {
        System.out.println("Declaração de Vínculo para o Professor(a): " + getNomeCompleto());
        System.out.println("Matrícula: " + numeroMatricula);
        System.out.println("Turmas Responsáveis:");
        for (Turma turma : turmas) {
            System.out.println("Código da Turma: " + turma.getCodigo());
        }
    }

    public String toString() {
        return "Nome: " + getNomeCompleto() + ", Data de nascimento: " + getDataNascimento() + ", Endereço: " + getEndereco() + ", Telefone: " + getTelefone() + ", CPF: " + getCpf() + ", Matrícula: " + numeroMatricula;
    }
}


