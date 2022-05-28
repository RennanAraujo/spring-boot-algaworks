package com.algaworks.crm.algacrmapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Issue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incrementa
	private Long id;

	private String issueDescription;

	public Issue() {
	}

	public Issue(Long id, String issueDescription) {
		this.id = id;
		this.issueDescription = issueDescription;
	}

}
