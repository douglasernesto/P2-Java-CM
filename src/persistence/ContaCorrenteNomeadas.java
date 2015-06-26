package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.ContaCorrente;

/**
*
 * Classe que Executa as consultas nomeadas da classe ContaCorrente
 * @author Douglas Ernesto  * 
 *
 *
 */


public class ContaCorrenteNomeadas {

	
	public static void main(String[] args) {
		
		// 2 - Obtem um gerenciador de entidades e uma transação
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("cmJavaJPA");

	    EntityManager em = emf.createEntityManager();
		
		ContaCorrente cc = new ContaCorrente();
		
	    cc = em.createNamedQuery("buscarTodasAsContas", ContaCorrente.class).getSingleResult();
	    
	    
	    List<ContaCorrente> ccs = em.createQuery("Select from ContaCorrente", ContaCorrente.class).getResultList();
		
	}
	
	
	
	
	
	
    
    
	
	
}
