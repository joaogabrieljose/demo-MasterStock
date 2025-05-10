package masterstock.demo.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import masterstock.demo.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,UUID>{

    Optional<Produto> findById (UUID id);
    Optional<Produto> findByNome (String nome);
    Optional<Produto> findByPreco (Double preco);
}
