package com.generation.farmacia.model;

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
@Table(name = "tb_categoria")
public class Categoria {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	
	@NotNull(message = "Preenchimento obrigatório")
	private String antialergico;
	
	@NotNull(message = "Preenchimento obrigatório")
	private String anti_inflamatorio ;
	
	@NotNull(message = "Preenchimento obrigatório")
	private String antidepressivo;
	
	@NotNull(message = "Preenchimento obrigatório")
	private String antigripal;
	
	@NotNull(message = "Preenchimento obrigatório")
	private String dores_febre;
	
	@NotNull(message = "Preenchimento obrigatório")
	private String anticoncepcional;
	
	@NotNull(message = "Preenchimento obrigatório")
	private String fitoterapicos;
	
	@NotNull(message = "Preenchimento obrigatório")
	private String tipo;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAntialergico() {
		return antialergico;
	}

	public void setAntialergico(String antialergico) {
		this.antialergico = antialergico;
	}

	public String getAnti_inflamatorio() {
		return anti_inflamatorio;
	}

	public void setAnti_inflamatorio(String anti_inflamatorio) {
		this.anti_inflamatorio = anti_inflamatorio;
	}

	public String getAntidepressivo() {
		return antidepressivo;
	}

	public void setAntidepressivo(String antidepressivo) {
		this.antidepressivo = antidepressivo;
	}

	public String getAntigripal() {
		return antigripal;
	}

	public void setAntigripal(String antigripal) {
		this.antigripal = antigripal;
	}

	public String getDores_febre() {
		return dores_febre;
	}

	public void setDores_febre(String dores_febre) {
		this.dores_febre = dores_febre;
	}

	public String getAnticoncepcional() {
		return anticoncepcional;
	}

	public void setAnticoncepcional(String anticoncepcional) {
		this.anticoncepcional = anticoncepcional;
	}

	public String getFitoterapicos() {
		return fitoterapicos;
	}

	public void setFitoterapicos(String fitoterapicos) {
		this.fitoterapicos = fitoterapicos;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
}

