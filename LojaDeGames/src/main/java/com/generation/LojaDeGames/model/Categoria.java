package com.generation.LojaDeGames.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_Categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	
	@NotNull(message = "Preenchimento obrigarótio")
	private String terror; 
	
	@NotNull(message = "Preenchimento obrigarótio")
	private String rpg;
	
	@NotNull(message = "Preenchimento obrigarótio")
	private String acao;
	
	@NotNull(message = "Preenchimento obrigarótio")
	private String Esporte;
	
	@NotNull(message = "Preenchimento obrigarótio")
	private String fps;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	
	private List<Produto> produto;
	
	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTerror() {
		return terror;
	}

	public void setTerror(String terror) {
		this.terror = terror;
	}

	public String getRpg() {
		return rpg;
	}

	public void setRpg(String rpg) {
		this.rpg = rpg;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public String getEsporte() {
		return Esporte;
	}

	public void setEsporte(String esporte) {
		Esporte = esporte;
	}

	public String getFps() {
		return fps;
	}

	public void setFps(String fps) {
		this.fps = fps;
	}

	public Categoria(long id, @NotNull(message = "Preenchimento obrigarótio") String terror,
			@NotNull(message = "Preenchimento obrigarótio") String rpg,
			@NotNull(message = "Preenchimento obrigarótio") String acao,
			@NotNull(message = "Preenchimento obrigarótio") String esporte,
			@NotNull(message = "Preenchimento obrigarótio") String fps, List<Produto> produto) {
		super();
		this.id = id;
		this.terror = terror;
		this.rpg = rpg;
		this.acao = acao;
		Esporte = esporte;
		this.fps = fps;
		this.produto = produto;
	}
	
	
	
}
