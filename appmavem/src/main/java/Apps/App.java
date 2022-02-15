package Apps;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mysql.cj.x.protobuf.MysqlxCrud.Find;

import dominio.Pessoa;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa(null, "ANA LUIZA", "ANA","sql 15 qd 12 casa 52", "36251821");
	 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager Em = emf.createEntityManager();
		Pessoa p = Em.find(Pessoa.class, 1);
		Em.getTransaction().begin();
		Em.persist(pessoa);	
		System.out.println("Gravou");
	
	    Em.getTransaction().commit();
		Em.close();
		emf.close();
		
	}

}
