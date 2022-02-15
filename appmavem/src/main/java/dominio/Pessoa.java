package dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Pessoas")
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
    
	@Column(length = 30)
 	private String Nome;
	@Column(length = 30)
	private String Email;
	@Column(name= "Endereco",length = 30)
	private String End;
	@Column(length = 30, nullable = false)
	private String Telefone;
	
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(Integer id, String nome, String email, String end,String  tel ) {
	 
		this.Id = id;
		this.Nome = nome;
		this.Email = email;
		this.End  = end;
		this.Telefone = tel;
		
	}

	public int getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	
	@Override
	public String toString() {
		return "Pessoa [Id=" + Id + ", Nome=" + Nome + ", Email=" + Email + "]";
	}

}
