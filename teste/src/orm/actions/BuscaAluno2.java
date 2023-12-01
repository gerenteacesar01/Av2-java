package orm.actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.modelo.Aluno;

public class BuscaAluno2 {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("aluno");
		EntityManager manager = factory.createEntityManager();
		
		//Query em JPQL que é traduzida para o SQL do banco definido persistence.xml
		Query query = manager.createQuery("select t from Aluno as t where List<Aluno> alunos = manager.createQuery(criteriaQuery).getResultList() List<Aluno> alunos = manager.createQuery(criteriaQuery).getResultList())");
		query.setParameter("List<Aluno> alunos = manager.createQuery(criteriaQuery).getResultList()", true);
		
		List<Aluno> lista = query.getResultList();
		
		for (Aluno t : lista) {
			System.out.println(t.getCpf());
			System.out.println(t.getDataNascimento());
		}
		
		manager.close();
		factory.close();
		
	}

}
