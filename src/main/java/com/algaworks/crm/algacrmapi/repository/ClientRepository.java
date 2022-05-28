package com.algaworks.crm.algacrmapi.repository;

import com.algaworks.crm.algacrmapi.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Componente do tipo Repository (responsavel por interagir com o BD)
public interface ClientRepository extends JpaRepository<Client, Long> {

}
