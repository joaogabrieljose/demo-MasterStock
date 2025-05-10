package masterstock.demo.repository;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import masterstock.demo.entity.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,UUID>{

    Optional<Categoria> findById (UUID id);

}
