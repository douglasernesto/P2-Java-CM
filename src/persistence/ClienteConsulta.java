package persistence;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entidades.Recibo;
import entidades.Cliente;


/**
*
 * Classe de consulta com JPQL.
 * @author Douglas Ernesto  * 
 *
 *
 */



public class ClienteConsulta{

	public static void main(String[] args) {
		
		Session s;
		
		Transaction t;
		
			
		
		
		s = HibernateUtil.getSessionFactory().openSession();
	 	org.hibernate.Query consultaCliente = s.createQuery("from Cliente");
	 	
	    List<Cliente> clientes = consultaCliente.list();
	 		    
	    for (Cliente cliente : clientes) {
	    System.out.println("Busca por um Funcionario : " + cliente.getNome());
	 	}
		
		

	}

}
