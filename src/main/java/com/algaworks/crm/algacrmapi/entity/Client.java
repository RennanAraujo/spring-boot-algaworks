package com.algaworks.crm.algacrmapi.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity //Annotation do JPA
public class Client {

	@Id //essa propriedade identifica o objeto
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incrementa
	private Long id; //referencia uma coluna id no banco
	@Column(nullable = false)
	private String name; //referencia uma coluna no banco

	//Lombok pode substituir os códigos abaixo
	//Getters, Setters, Constructors, hashCode and Equals
	public Client() { //Construtor vazio
	}

	public Client(Long id, String name) { //Construtor com parâmetros
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Client)) return false;
		Client client = (Client) o;
		return id.equals(client.id);
	} //Esse equals() gerado automaticamente não está igual ao gerado no STS

	@Override
	public int hashCode() {
		return Objects.hash(id);
	} ////Esse hashCode() gerado automaticamente não está igual ao gerado no STS

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
