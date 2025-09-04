package masterstock.demo.service.useCaseCategorias;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import masterstock.demo.dto.dtoCategoria.CategoriaDTORequest;
import masterstock.demo.dto.dtoCategoria.DtoCategoria;
import masterstock.demo.entity.Categoria;
import masterstock.demo.exception.exceptionCategoria.CategoriaNotNullException;
import masterstock.demo.repository.CategoriaRepository;

@Service
public class UseCaseFindAllCategoria {

    @Autowired 
    private CategoriaRepository categoriaRepository;

    public List<CategoriaDTORequest> findAllCategoria(){
        List<Categoria> novo = this.categoriaRepository.findAll();

        if (novo == null) {
            throw new CategoriaNotNullException();
        }
        return novo.stream().map(dto -> new CategoriaDTORequest(dto)).toList();
    }
    
}
