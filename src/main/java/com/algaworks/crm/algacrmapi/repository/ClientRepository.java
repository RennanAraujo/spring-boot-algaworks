package com.algaworks.crm.algacrmapi.repository;

import com.algaworks.crm.algacrmapi.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repository guarda os objetos e faz toda interface com o banco

@Repository //Componente do tipo Repository (responsavel por interagir com o BD)
public interface ClientRepository extends JpaRepository<Client, Long> {
	//Esse Long se refere ao id?
}
