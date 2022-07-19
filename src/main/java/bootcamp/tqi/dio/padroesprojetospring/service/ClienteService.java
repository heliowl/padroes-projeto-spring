package bootcamp.tqi.dio.padroesprojetospring.service;

import bootcamp.tqi.dio.padroesprojetospring.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
