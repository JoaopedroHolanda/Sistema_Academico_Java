CLASSE ALUNO

Construtor Aluno (String nomeCompleto, String dataNascimento, String endereco, String telefone, String cpf, int numeroMatricula):
Inicializa os atributos do aluno, como nome, data de nascimento, endereço, telefone, CPF e número de matrícula.

Método adicionarTurma(Turma turma): Adiciona uma turma à lista de turmas em que o aluno está matriculado.

Método emitirDeclaracaoAluno(): Emite uma declaração de vínculo para o aluno, mostrando as turmas em que está matriculado.

Método removerTurma(Turma turma): Remove uma turma da lista de turmas do aluno.

Métodos adicionarDisciplina(Disciplina disciplina), removerDisciplina(Disciplina disciplina):
Adicionam ou removem uma instância de Disciplina à lista de disciplinas cursadas pelo aluno, além de verificar se o aluno já cursa a disciplina antes de adicionar ou remover.



CLASSE PROFESSOR

Construtor Professor (String nomeCompleto, String dataNascimento, String endereco, String telefone, String cpf, int numeroMatricula):
Inicializa os atributos do professor, como nome, data de nascimento, endereço, telefone, CPF e número de matrícula.

Método adicionarTurma(Turma turma): 
Adiciona uma instância de Turma à lista de turmas associadas ao professor.

Métodos adicionarDisciplina(Disciplina disciplina), removerDisciplina(Disciplina disciplina):
Adicionam ou removem uma instância de Disciplina à lista de disciplinas lecionadas pelo professor, além de verificar se o professor já leciona a disciplina antes de adicionar ou remover.

Método removerTurma(Turma turma):
Remove uma instância de Turma da lista de turmas associadas ao professor.

Método emitirDeclaracaoVinculo():
Emite uma declaração de vínculo para o professor, exibindo a matrícula e os códigos das turmas associadas.



CLASSE DISCIPLINA:

Construtor Disciplina (String nome, int codigo, int cargaHoraria):
Inicializa uma instância de Disciplina com um nome, código e carga horária especificados.

Métodos setNome(String nome), setCodigo(int codigo), setCargaHoraria(int cargaHoraria):
Permitem a modificação do nome, código e carga horária da disciplina, respectivamente.

Métodos getNome(), getCodigo(), getCargaHoraria():
Retornam o nome, código e carga horária da disciplina, respectivamente.

Método toString():
Sobrescreve o método toString para fornecer uma representação em string da disciplina, exibindo o nome, código e carga horária.



CLASSE PESSOA:

Construtor Pessoa (String nomeCompleto, String dataNascimento, String endereco, String telefone, String cpf):
Inicializa uma instância de Pessoa com as informações básicas de uma pessoa, incluindo nome completo, data de nascimento, endereço, telefone e CPF.

Métodos setNomeCompleto(String nomeCompleto), setDataNascimento(String dataNascimento), setEndereco(String endereco), setTelefone(String telefone), setCpf(String cpf):
Permitem a modficação das informações da pessoa, incluindo nome completo, data de nascimento, endereço, telefone e CPF.

Métodos getNomeCompleto(), getDataNascimento(), getEndereco(), getTelefone(), getCpf():
Retornam as informações da pessoa, incluindo nome completo, data de nascimento, endereço, telefone e CPF, respectivamente.



CLASSE TURMA:

Construtor Turma (String horario, int codigo, int quantidadeMaxAlunos):
Inicializa uma instância de Turma com informações essenciais, incluindo horário, código e quantidade máxima de alunos.

Métodos setHorario(String horario), setCodigo(int codigo), setQuantidadeMaxAlunos(int quantidadeMaxAlunos):
Permitem a modificação do horário, código e quantidade máxima de alunos da turma, respectivamente.

Métodos getHorario(), getCodigo(), getQuantidadeMaxAlunos(), getAlunos(), getProfessores():
Retornam as informações da turma, incluindo horário, código, quantidade máxima de alunos, lista de alunos e professores, respectivamente.

Método toString():
Sobrescreve o método toString para fornecer uma representação em string da turma, exibindo horário, código e quantidade máxima de alunos.

Métodos adicionarAluno(Aluno aluno), removerAluno(Aluno aluno):
Adicionam ou removem um aluno da turma, respectivamente, verificam se a turma está cheia antes de adicionar.

Métodos adicionarProfessor(Professor professor), substituirProfessor(Professor professor, Professor novoProfessor), removerProfessor(Professor professor):
Adicionam, substituem ou removem um professor da turma, respectivamente, verificam se a turma já possui um professor.

Métodos adicionarDisciplina(Disciplina disciplina), removerDisciplina(Disciplina disciplina):
Adicionam ou removem uma disciplina associada à turma, respectivamente.

Método imprimirDetalhesTurma():
Imprime os detalhes da turma, incluindo disciplina, horário, professores e alunos associados.