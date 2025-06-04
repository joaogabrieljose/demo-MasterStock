package masterstock.demo.service.useCaseCategorias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import masterstock.demo.exception.exceptionCategoria.CategoriaNotNullException;
import masterstock.demo.repository.CategoriaRepository;

@Service
public class UseCaseFindAllCategoria {

    @Autowired 
    private CategoriaRepository categoriaRepository;

    public Object findAllCategoria(){

        var novo = this.categoriaRepository.findAll();
        if (novo == null) {
            throw new CategoriaNotNullException();
        }
        return novo;
    }
    
}
