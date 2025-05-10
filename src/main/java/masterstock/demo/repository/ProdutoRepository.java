package masterstock.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import masterstock.demo.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,UUID>{
    
}
