package Principal;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// Criando Estagiario
		Estagiario est = new Estagiario("Helena Priscila", "Cortes Caldonho",
				18, (float) 600.00, 01, "Tecnico de informatica");
		// Gerando arquivo Estagiario
		System.out.println("Gerando Arquivo do Estagiario");
		est.GerarArquivoEstagiario();
		System.out.println("Arquivo estagiario concluido \nimprimindo resultado ...");
		// Imprimindo Estagiario
		System.out.println(est.toString());
		
		
		// Criando Funcionario
		Funcionario f1 = new Funcionario("Lidiane", "Louzada", 20,
				(float) 2500.00, 01, "Informática");
		// Gerando arquivo Funcionario
		System.out.println("Gerando Arquivo do Funcionario");
		f1.GerarArquivoFuncionario();
		System.out.println("Arquivo Funcionario concluido \nimprimindo resultado ...");
		// imprimindo Funcionario
		System.out.println(f1.toString());
		
		Turma t = new Turma("TI03", "Programação", 36);
		System.out.println("Turma criado com sucesso \nimprimindo resultado ...");
		System.out.println(t.toString());
		
		Professor p = new Professor(f1.getNome(), f1.getSobrenome(),
				f1.getIdade(), f1.getSalario(), f1.getSiap(),
				f1.getCoordenadoria(), "01", t);
		System.out.println("Professor criado com sucesso \nimprimindo resultado ...");
		System.out.println(p.toString());
	}

}
