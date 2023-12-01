package orm.actions;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import orm.modelo.Aluno;


public class BuscarAluno {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("aluno");
        EntityManager manager = factory.createEntityManager();
        Scanner scanner = new Scanner(System.in);

        try {
           

            CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
            CriteriaQuery<Aluno> criteriaQuery = criteriaBuilder.createQuery(Aluno.class);
            Root<Aluno> root = criteriaQuery.from(Aluno.class);
            criteriaQuery.select(root);

     

            List<Aluno> alunos = manager.createQuery(criteriaQuery).getResultList();

            for (Aluno aluno : alunos) {
                System.out.println("ID: " + aluno.getId());
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Email: " + aluno.getEmail());
                System.out.println("CPF: " + aluno.getCpf());
                System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
                System.out.println("Naturalidade: " + aluno.getNaturalidade());
                System.out.println("Endereço: " + aluno.getEndereco());

                System.out.println("=======================");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
            manager.close();
            factory.close();
        }
    }
}
