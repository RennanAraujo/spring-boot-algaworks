package com.algaworks.crm.algacrmapi.entity;

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

	//Mas onde que está setado relacionamento de Issue com Client

	public Issue() {
	}

	public Issue(Long id, String issueDescription) {
		this.id = id;
		this.issueDescription = issueDescription;
	}

}
