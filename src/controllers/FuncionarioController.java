package controllers;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Funcionario;
import repositories.FuncionarioRepository;

public class FuncionarioController {
	
	public void cadastrarFuncionario() {
		
		var funcionario = new Funcionario();
		
		try {
			
			funcionario.setId(UUID.randomUUID());
			funcionario.setNome(JOptionPane.showInputDialog("Nome do funcionario: "));
			funcionario.setMatricula(JOptionPane.showInputDialog("Informe a matricula: "));
			funcionario.setCpf(JOptionPane.showInputDialog("Infome o CPF: "));
			funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário: ")));
			
			var funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportarDados(funcionario);
				
			
		} catch (Exception e) {
				System.out.println("\nErro ao salvar os dados: " + e.getMessage());
		}
	}

}
