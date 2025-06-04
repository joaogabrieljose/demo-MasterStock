package masterstock.demo.repository;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import masterstock.demo.dto.dtoCategoria.DtoCategoria;
import masterstock.demo.entity.Categoria;
import java.util.List;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,UUID>{

    Categoria findById (DtoCategoria dtoCategoria);
    Optional<Categoria> findByNome(String nome);

}
