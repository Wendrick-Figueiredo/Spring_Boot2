package oi.github.wendrick_figueiredo.produtosapi.repository;

import oi.github.wendrick_figueiredo.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNome(String nome);
}
