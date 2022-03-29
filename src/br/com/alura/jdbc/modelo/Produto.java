package br.com.alura.jdbc.modelo;

public class Produto {

	private Integer id;
	private String nome;
	private String descricao;
	
	public Produto(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
<<<<<<< HEAD
	}
	
	public Produto(Integer id, String nome, String descricao) {
=======

	}
	
	public Produto(Integer id, String nome, String descricao ) {
>>>>>>> f31c2787c8f03154399494acfe2495a427918dd7
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	@Override
	public String toString() {
<<<<<<< HEAD
		return String.format("Id: %d, Nome: %s, Descrição: %s", this.id, this.nome, this.descricao);
	}
=======
		return String.format("[Id: %d, Nome: %s, Descricao %s]", this.id, this.nome, this.descricao);
	}
	
>>>>>>> f31c2787c8f03154399494acfe2495a427918dd7
}
