package com.aula.demo.domain;

import javax.persistence.Entity;

import com.aula.demo.domain.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonTypeName;

@Entity
@JsonTypeName("pagamentoComCartao")
public class PagamentoComCartao extends Pagamento{
	
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDeParcerias;
	
	public PagamentoComCartao() {}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcerias) {
		super(id, estado, pedido);
		this.numeroDeParcerias = numeroDeParcerias;
		// TODO Auto-generated constructor stub
	}

	public Integer getNumeroDeParcerias() {
		return numeroDeParcerias;
	}

	public void setNumeroDeParcerias(Integer numeroDeParcerias) {
		this.numeroDeParcerias = numeroDeParcerias;
	}
	
	
	

}
