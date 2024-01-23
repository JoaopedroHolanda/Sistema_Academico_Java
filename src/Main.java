public class Main {
    public static void main(String[] args) {
        
        Disciplina matematica = new Disciplina("Matemática", 1, 60);
        Disciplina portugues = new Disciplina("Português", 2, 45);

        
        Aluno aluno1 = new Aluno("Maria Souza","15/05/2005", "Rua Espanha, 222", "(01) 9 1234-5678", "000.000.000-01", 2001);
        Aluno aluno2 = new Aluno("José Francisco","25/07/1900", "Rua das laranjeiras 121", "(02) 9 1234-5678", "000.000.000-02", 2002);
        Aluno aluno3 = new Aluno("Rafael Brito ","11/02/2003", "Rua Edson Queiroz 1001", "(03) 9 1234-5678","000.000.000-03" , 2003);
        
        Professor professor1 = new Professor("Helena Costa", "19/01/1990", "Rua Colorado, 375", "(01) 9 8765-4321", "111.111.111-11", 1001);
        Professor professor2 = new Professor("João Antônio", "07/10/1986", "Rua Grécia, 456", "(02) 9 8765-4321", "222.222.222-22", 1002);

        
        Turma turma1 = new Turma("Segunda e Quarta, 14:00-16:00", 1, 30);
        Turma turma2 = new Turma("Terça e Quinta, 13:00-15:00", 2, 25);

        
        turma1.adicionarDisciplina(matematica);
        turma2.adicionarDisciplina(portugues);
        
        
        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma2.adicionarAluno(aluno3);

        turma1.adicionarProfessor(professor1);
        turma2.adicionarProfessor(professor2);

        turma1.imprimirDetalhesTurma();
        System.out.println();
        turma2.imprimirDetalhesTurma();
    }
}
