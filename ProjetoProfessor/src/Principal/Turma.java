package Principal;

public class Turma {
	private String nome, disciplina;
	private int NumAlunos;
	private Professor professor;

	public Turma(String nome, String disciplina, int numAlunos, Professor professor) {
		this.nome = nome;
		this.disciplina = disciplina;
		NumAlunos = numAlunos;
		this.professor=professor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public int getNumAlunos() {
		return NumAlunos;
	}

	public void setNumAlunos(int numAlunos) {
		NumAlunos = numAlunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	

}
