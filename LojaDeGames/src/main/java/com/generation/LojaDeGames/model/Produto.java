package com.generation.LojaDeGames.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_Produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Preenchimento obrigatório")
	@Size(min = 3, max = 5000, message = "Este campo deve ter entre 3 e 5000 caracteres")
	private String nome; 
	
	@NotBlank(message = "Preenchimento obrigatório")
	@Size(min = 10,max = 10000, message = "Este campo deve ter entre 10 e 10000caracteres")
	private String descrição;
	
	@NotBlank(message = "Preenchimento obrigatório")
	private String genero;
	
	@NotBlank(message = "Preenchimento obrigatório")
	private  Date lançamento;
	
	@NotBlank(message = "Preenchimento obrigatório")
	private long valor;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public Date getLançamento() {
		return lançamento;
	}

	public void setLançamento(Date lançamento) {
		this.lançamento = lançamento;
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}

	public Produto(long id,
			@NotBlank(message = "Preenchimento obrigatório") @Size(min = 3, max = 5000, message = "Este campo deve ter entre 3 e 5000 caracteres") String nome,
			@NotBlank(message = "Preenchimento obrigatório") @Size(min = 10, max = 10000, message = "Este campo deve ter entre 10 e 10000caracteres") String descrição,
			@NotBlank(message = "Preenchimento obrigatório") String genero,
			@NotBlank(message = "Preenchimento obrigatório") Date lançamento,
			@NotBlank(message = "Preenchimento obrigatório") long valor, Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.descrição = descrição;
		this.genero = genero;
		this.lançamento = lançamento;
		this.valor = valor;
		this.categoria = categoria;
	}
	
	
	
}
