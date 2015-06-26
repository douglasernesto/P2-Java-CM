package entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
*
 * Entidade que dara origem ao Objeto Recibo
 * @author Douglas Ernesto  * 
 *
 *
 */


@Entity
public class Recibo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idRecibo;
	
	@Column(unique = true)
	private String numeroRecibo;
	
	private String data;
	
	@OneToOne
	private Cliente cliente;
	
	public Recibo() {
		// TODO Auto-generated constructor stub
	}

	public Recibo(Integer idRecibo, String numeroRecibo, String data) {
		super();
		this.idRecibo = idRecibo;
		this.numeroRecibo = numeroRecibo;
		this.data = data;
	}

	@Override
	public String toString() {
		return "Recibo [idRecibo=" + idRecibo + ", numeroRecibo="
				+ numeroRecibo + ", data=" + data + "]";
	}

	public Integer getIdRecibo() {
		return idRecibo;
	}

	public void setIdRecibo(Integer idRecibo) {
		this.idRecibo = idRecibo;
	}

	public String getNumeroRecibo() {
		return numeroRecibo;
	}

	public void setNumeroRecibo(String numeroRecibo) {
		this.numeroRecibo = numeroRecibo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	

	
	
	
	
}
