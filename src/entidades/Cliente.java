package entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;




/**
*
 * Classe estrutural do obejto Cliente.
 * @author Douglas Ernesto  * 
 *
 *
 */




@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCliente;
	
	@Column(unique = true)
	private Integer cpf;	
	
	private String nome;
	
	
	@OneToOne
	private Recibo recibo;
	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public Cliente(Integer idCliente, Integer cpf, String nome) {
		super();
		this.idCliente = idCliente;
		this.cpf = cpf;
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", cpf=" + cpf + ", nome="
				+ nome + ", recibo=" + recibo + "]";
	}


	public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}


	public Integer getCpf() {
		return cpf;
	}


	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Recibo getRecibo() {
		return recibo;
	}


	public void setRecibo(Recibo recibo) {
		this.recibo = recibo;
	}


	

	
	

	
	
	
}