package persistence;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
*
 * Classe de configuração de ambiente.
 * @author Douglas Ernesto  * 
 *
 *
 */


public class HibernateUtil {
	private static final SessionFactory sessionFactory;

	static {
		try {

			sessionFactory = new AnnotationConfiguration().configure(
					"config/mysql_hibernate.cfg.xml").buildSessionFactory();
		} catch (Throwable ex) {

			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
