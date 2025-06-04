package masterstock.demo.service.useCaseProdutos;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import masterstock.demo.dto.dtoProdutos.DtoProdutos;
import masterstock.demo.entity.Produto;
import masterstock.demo.exception.ProdutoException;
import masterstock.demo.repository.ProdutoRepository;

@Service
public class UseCaseCreateProdutos {

    @Autowired
    private ProdutoRepository produtoRepository;
    
    public Object createProduto(DtoProdutos dtoProdutos){
        produtoRepository.findByNome(dtoProdutos.nome()).ifPresent((use)->{
            throw new ProdutoException();
        });

        Produto produtos = new Produto();
        produtos.setNome(dtoProdutos.nome());
        produtos.setPreco(dtoProdutos.preco());
        produtos.setQuantidade(dtoProdutos.quantidade());
        
        return this.produtoRepository.save(produtos);
    }
}
