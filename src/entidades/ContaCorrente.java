package entidades;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
*
 * Classe consultas Nomeadas
 * @author Douglas Ernesto * 
 *
 *
 */


@Entity
@NamedQueries({
    @NamedQuery(name = "buscarTodasAsContas", query = "select c from ContaCorrente c"),
    @NamedQuery(name = "buscarPorAgencia", query = "select c from ContaCorrente c where c.Agencia = '1252'"),
    @NamedQuery(name = "encontrarParam", query = "select c from ContaCorrente c where c.Agencia = :cagencia")
})

public class ContaCorrente {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idConta;
	
	
	private Integer agencia;
		
	private Integer cc;
	
	private Double saldo;
	
	
	
	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}


	

	public ContaCorrente(Integer idConta, Integer agencia, Integer cc,
			Double saldo) {
		super();
		this.idConta = idConta;
		this.agencia = agencia;
		this.cc = cc;
		this.saldo = saldo;
	}




	@Override
	public String toString() {
		return "ContaCorrente [idConta=" + idConta + ", agencia=" + agencia
				+ ", cc=" + cc + ", saldo=" + saldo + "]";
	}



	public Integer getIdConta() {
		return idConta;
	}



	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}



	public Integer getAgencia() {
		return agencia;
	}



	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}



	public Integer getCc() {
		return cc;
	}



	public void setCc(Integer cc) {
		this.cc = cc;
	}



	public Double getSaldo() {
		return saldo;
	}



	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	
	

}
