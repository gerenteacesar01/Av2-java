package orm.actions;

import java.util.Calendar;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Aluno;

public class InserirAluno {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Scanner sc = new Scanner (System.in);
		
		
		
		
		
	
		
		System.out.println("Digite o nome do aluno:");
		aluno1.setNome(sc.nextLine());
		
		
		
		System.out.println("Digite o email do aluno:");
		aluno1.setEmail(sc.nextLine());
		
		
		System.out.println("Digite o cpf do aluno:");
		aluno1.setCpf(sc.nextLine());
		
		
		
		System.out.println("Digite a data de nascimento do aluno:");
		aluno1.setDataNascimento(sc.nextLine());
		
		
		
		System.out.println("Digite a naturalidade do aluno:");
		aluno1.setNaturalidade(sc.nextLine());
		
		
		
		System.out.println("Digite o endereço do aluno");
		aluno1.setEndereco(sc.nextLine());
		
		
		
		
		
//		tarefa1.setDataFinalizacao(Calendar.getInstance());
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("aluno");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin(); //inicializar a transação
		manager.persist(aluno1); //linha que faz o hibernate inserir um objeto no banco
		manager.getTransaction().commit(); //Encerramento da transação
		
		manager.close();
		factory.close();
	}

}