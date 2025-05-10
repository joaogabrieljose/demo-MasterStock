package masterstock.demo.service.useCaseProdutos;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import masterstock.demo.entity.Produto;
import masterstock.demo.exception.ProdutoException;
import masterstock.demo.repository.ProdutoRepository;

@Service
public class UseCaseCreateProdutos {

    @Autowired
    private ProdutoRepository produtoRepository;
    
    public Object createProduto(Produto produto){
        produtoRepository.findByNome(produto.getNome()).ifPresent((use)->{
            throw new ProdutoException();
        });
        
        return this.produtoRepository.save(produto);
    }
}
