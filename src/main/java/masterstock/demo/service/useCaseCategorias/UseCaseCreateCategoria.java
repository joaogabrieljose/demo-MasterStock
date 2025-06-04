package masterstock.demo.service.useCaseCategorias;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import masterstock.demo.dto.dtoCategoria.DtoCategoria;
import masterstock.demo.entity.Categoria;
import masterstock.demo.exception.exceptionCategoria.CategoriaNotNullException;
import masterstock.demo.repository.CategoriaRepository;

@Service
public class UseCaseCreateCategoria {


    @Autowired 
    private CategoriaRepository categoriaRepository;

    public Object CreateCategoria(DtoCategoria  dtoCategoria){

        this.categoriaRepository.findByNome(dtoCategoria.nome()).ifPresent((use)->{
            throw new CategoriaNotNullException();
        });

        Categoria categoria = new Categoria();
        categoria.setNome(dtoCategoria.nome());
        categoria.setDescricao(dtoCategoria.descricao());
       return this.categoriaRepository.save(categoria);
    }
    
}
