package persistence;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.Transaction;

import entidades.Recibo;

public class ReciboDao {
	

	/**
	 *
	  * Classe que faz o acesso ao Banco CRUD e testes.
	  * @author Douglas Ernesto  * 
	  *
	  *
	  */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Session s;
			
			Transaction t;

			
			//Gravando Recibo 
			

			Recibo rec = new Recibo();
			
			rec.setNumeroRecibo("300");
			rec.setData("01012015");
			
			s = HibernateUtil.getSessionFactory().openSession();
			
			t = s.beginTransaction();			
			
			s.save(rec);
			
			t.commit();
			
			//s.close();
			
			
			 
			
			// Buscando Todos as Emrpesas do Banco
			
			s = HibernateUtil.getSessionFactory().openSession();
			org.hibernate.Query query = s.createQuery("from Recibo");
		    List<Recibo> recibos = query.list();
		    
		    for (Recibo recibo : recibos) {
		    	System.out.println("Recibos Cadastrados : " + recibo.getNumeroRecibo());
			}
		    
		    
		    
		 // Filtrando Empresa do Banco
			
		 	s = HibernateUtil.getSessionFactory().openSession();
		 	org.hibernate.Query buscaumRecibo = s.createQuery("from Recibo where numeroRecibo = :numero");
		 	buscaumRecibo.setParameter("numero", "300");
		    List<Recibo> recibosNew = buscaumRecibo.list();
		 		    
		    for (Recibo recs : recibosNew) {
		    System.out.println("Busca por um Recibo " + recs.getNumeroRecibo());
		 	}
		
		
		    
		 // Deletando Empresa
		    
		    
		    s = HibernateUtil.getSessionFactory().openSession();
		 	org.hibernate.Query consultarRemover = s.createQuery("from Recibo where numeroRecibo = :numero");
		 	consultarRemover.setParameter("numero", "300");
		    List<Recibo> exclusao = consultarRemover.list();
		 		    
		    for (Recibo remove : exclusao) {
		    System.out.println("Recibo para Exlusão " + remove.getNumeroRecibo());
		    
		    t = s.beginTransaction();			
			
			s.delete(remove);
			
			t.commit();
		    
		 	}
		    
			
			
		
		}

		

		
		

	
	
	
	
	



	
	

	

}
