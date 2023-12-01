package orm.actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import orm.modelo.Aluno;

public class BuscaAluno2 {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("aluno");
        EntityManager manager = factory.createEntityManager();

        TypedQuery<Aluno> query = manager.createQuery("select a from Aluno a", Aluno.class);

        List<Aluno> lista = query.getResultList();

        for (Aluno aluno : lista) {
            System.out.println("Nome : " + aluno.getNome());
            System.out.println("Cpf: " + aluno.getCpf());
            System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
            System.out.println("Email : " + aluno.getEmail());
            System.out.println("Naturalidade " + aluno.getNaturalidade());
            System.out.println("Endereço " + aluno.getEndereco());
        }

        manager.close();
        factory.close();
    }
}
