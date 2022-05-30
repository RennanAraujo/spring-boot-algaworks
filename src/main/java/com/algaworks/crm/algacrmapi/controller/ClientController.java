package com.algaworks.crm.algacrmapi.controller;

import com.algaworks.crm.algacrmapi.entity.Client;
import com.algaworks.crm.algacrmapi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//O Controller trata as requisições HTTP

@RestController //Isso aqui é um controlador REST
@RequestMapping("/clients") //Mapeia os endpoints. Para outros endpoints, criar outras classes. Ex.: /issues
public class ClientController {

	@Autowired //adiciona uma instancia do objeto
	private ClientRepository ClientRepository;

	@GetMapping("/list") //Esse método vai ser usado quando vier uma requisição do tipo GET
	public List<Client> ClientList(){
		return ClientRepository.findAll();
	}

	@GetMapping("/list/{id}")
	public Optional<Client> getClientById(@PathVariable("id") Long id){
		//return "Message for id endpoint";
		return ClientRepository.findById(id);
	}
	@PostMapping("/insert") //Esse método vai ser usado quando vier uma requisição do tipo POST
	@ResponseStatus(HttpStatus.CREATED) //Retorna o código 201. Cadastrado com sucesso
	public Client addClient(@RequestBody Client client){ //O body da solicitação será convertido para o objeto "Client"
		return ClientRepository.save(client);
	}

	@DeleteMapping("/delete/{id}") //DELETE não está funcionando
	@ResponseStatus(HttpStatus.OK) //Queria colocar not found se não tivesse
	public void deleteById(@PathVariable("id") Long id){ //id faz parte do path
		ClientRepository.deleteById(id); //Se é void não tem retorno, apenas executa a ação
	}
	@DeleteMapping("/delete/all")
	public void deleteAll(){
		ClientRepository.deleteAll();
	}
}



//O controller recebe e trata as requisições HTTP

//Rodar o programa direto no terminal, sem precisar da IDE:
//PS C:\Code\AlgaWorks\algacrmapi\target> java -jar .\algacrm-api-0.0.1-SNAPSHOT.jar