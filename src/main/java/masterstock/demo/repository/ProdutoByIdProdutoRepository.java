package masterstock.demo.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import masterstock.demo.entity.Produto;

@Repository
public interface ProdutoByIdProdutoRepository extends JpaRepository<Produto,Long> {

     Optional<Produto> findById(UUID id);
    
}
