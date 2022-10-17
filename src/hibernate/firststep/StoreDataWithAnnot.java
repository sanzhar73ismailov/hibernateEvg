package hibernate.firststep;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreDataWithAnnot {
	public static void main(String[] args) {
		// Create typesafe ServiceRegistry object
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		try {
			Employee2 e1 = new Employee2();
			e1.setId(102);
			e1.setFirstName("Gaurav111");
			e1.setLastName("Chawla11");
			
			Employee2 e2 = session.get(Employee2.class, 101);
			System.out.println(e2);

			//session.update(e1);
			//session.delete(e1);
			
			if(1==1) {
			//	throw new RuntimeException("Проблема!!!!!!!!");
			}
			
			t.commit();
			System.out.println("successfully saved");
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		} finally {
			if (factory != null)
				factory.close();
			if (session != null)
				session.close();
		}

	}

}
