package com.aula.demo;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aula.demo.domain.Categoria;
import com.aula.demo.domain.Cidade;
import com.aula.demo.domain.Cliente;
import com.aula.demo.domain.Endereco;
import com.aula.demo.domain.Estado;
import com.aula.demo.domain.ItemPedido;
import com.aula.demo.domain.Pagamento;
import com.aula.demo.domain.PagamentoComBoleto;
import com.aula.demo.domain.PagamentoComCartao;
import com.aula.demo.domain.Pedido;
import com.aula.demo.domain.Produto;
import com.aula.demo.domain.enums.EstadoPagamento;
import com.aula.demo.domain.enums.TipoCliente;
import com.aula.demo.repositories.CategoriaRepository;
import com.aula.demo.repositories.CidadeRepository;
import com.aula.demo.repositories.ClienteRepository;
import com.aula.demo.repositories.EnderecoRepository;
import com.aula.demo.repositories.EstadoRepository;
import com.aula.demo.repositories.ItemPedidoRepository;
import com.aula.demo.repositories.PagamentoRepository;
import com.aula.demo.repositories.PedidoRepository;
import com.aula.demo.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{
	




	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}
}
