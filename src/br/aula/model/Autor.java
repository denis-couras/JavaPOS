package br.aula.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="AUTOR")
public class Autor {

	@Id
	@Column(name="id_livro")
	@GeneratedValue
	private Long idAutor;
	
	@Column(name="nome", length=45, nullable=false)
	private String nome;

	@OneToMany(mappedBy = "autor", fetch=FetchType.EAGER)
	private List<Livro> livros = new ArrayList<Livro>();
	
	public long getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(long idAutor) {
		this.idAutor = idAutor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
}
