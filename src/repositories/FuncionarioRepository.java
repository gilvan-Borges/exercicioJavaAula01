package repositories;

import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import entities.Funcionario;

public class FuncionarioRepository {
		
	public void exportarDados(Funcionario funcionario) {
		
		try {
			
			var fileWriter = new FileWriter("c:\\temp\\funcionarios.txt", true);
			
			var printWriter = new PrintWriter(fileWriter);
			
			printWriter.write("\nId..........: " + funcionario.getId());
			printWriter.write("\nNome........: " + funcionario.getNome());
			printWriter.write("\nCPF.........: " + funcionario.getCpf());
			printWriter.write("\nMatricula...: " + funcionario.getMatricula());
			printWriter.write("\nSalário.....: " + funcionario.getSalario());
			printWriter.write("\n----------------------");
			printWriter.close();
			
			JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
			
		} catch (Exception e) {
			System.out.println("\nErro ao gravar o arquivo: " + e.getMessage());
		}
	}

}
