package com.algaworks.crm.algacrmapi.controller;

import com.algaworks.crm.algacrmapi.model.Client;
import com.algaworks.crm.algacrmapi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Isso aqui é um controlador REST
@RequestMapping("/clients") //Mapeia os endpoints. E pra colocar mais de um endpoint é onde??? seria outra classe.
public class ClientController {

	@Autowired //adiciona uma instancia do objeto
	private ClientRepository ClientRepository;

	@GetMapping //Esse método vai ser usado quando vier uma requisição do tipo GET
	public List<Client> ClientList(){
		return ClientRepository.findAll();
	}

	@PostMapping //Esse método vai ser usado quando vier uma requisição do tipo POST
	@ResponseStatus(HttpStatus.CREATED) //Retorna o código 201. Cadastrado com sucesso
	public Client addClient(@RequestBody Client client){ //O body da solicitação será convertido para o objeto "Client"
		return ClientRepository.save(client);
	}
}

//O controller recebe e trata as requisições HTTP

//Rodar o programa direto no terminal, sem precisar da IDE:
//PS C:\Code\AlgaWorks\algacrmapi\target> java -jar .\algacrm-api-0.0.1-SNAPSHOT.jar