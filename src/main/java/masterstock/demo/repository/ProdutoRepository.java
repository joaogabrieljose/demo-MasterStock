package masterstock.demo.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import masterstock.demo.entity.Categoria;
import masterstock.demo.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long>{
    Optional<Produto> findByNome (String nome);
    Optional<Produto>findById (UUID id);
    Produto findByNomeContainingIgnoreCase (String nome);
    Produto findByPrecoBetween (double precoMin, double preCoMax);
    //List<Produto> findByCategoriaId (UUID categoriaId);
    List<Produto> findByCategoriaId(UUID categoriaId);
}
