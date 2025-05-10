package masterstock.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import masterstock.demo.entity.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor,UUID> {
    
}
