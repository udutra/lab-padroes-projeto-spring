package one.digitalInovation.gof.service;

import one.digitalInovation.gof.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio do cliente. 
 * Com isso, se nescessário, podemos ter multiplas implementações dessa mesma interface.
 * 
 * @author Guilherme
 */

public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();
	Cliente buscarPorId(Long id);
	void inserir(Cliente cliente);
	void atualizar(Long id, Cliente cliente);
	void deletar(Long id);
}