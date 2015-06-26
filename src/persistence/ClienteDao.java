package persistence;


import org.hibernate.Session;
import org.hibernate.Transaction;

import entidades.Cliente;

/**
*
 * Classe que faz o acesso ao Banco para gravar as informacoes.
 * @author Douglas Ernesto  * 
 *
 *
 */

public class ClienteDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		
		Session s;
		
		Transaction t;

		
		 
				//Gravando Cliente    

	    
	    Cliente cc = new Cliente();
		
		cc.setCpf(393);
		cc.setNome("Hermes da Fonseca");
		
		cc.setRecibo(null);
		
			    
		
		s = HibernateUtil.getSessionFactory().openSession();
		
		t = s.beginTransaction();			
		
		s.save(cc);
		
		t.commit();
		s.close();
	    
		System.out.println("Dados do Cliente " + cc.getNome()  + " Gravados!");
		
		
		 
	    }
		
		

		
		
	}

