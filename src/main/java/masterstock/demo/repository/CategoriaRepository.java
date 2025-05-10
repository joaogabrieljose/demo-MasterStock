package masterstock.demo.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import masterstock.demo.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,UUID>{
}
