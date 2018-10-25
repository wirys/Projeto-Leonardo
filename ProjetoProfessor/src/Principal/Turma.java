package Principal;

public class Turma {
	private String nome, disciplina;
	private int NumAlunos;

	public Turma(String nome, String disciplina, int numAlunos) {
		this.nome = nome;
		this.disciplina = disciplina;
		NumAlunos = numAlunos;
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

	@Override
	public String toString() {
		return "\n-------------- DADOS DE TURMA ------------"+
				"\n Nome: " + getNome() +
				"\n Disciplina: " + getDisciplina() +
				"\n Numero de Alunos: " + getNumAlunos() 
		        + "\n----------------------------------------------";
	}
	

}
