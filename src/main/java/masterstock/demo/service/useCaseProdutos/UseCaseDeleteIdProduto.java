package masterstock.demo.service.useCaseProdutos;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import masterstock.demo.dto.DtoProdutos;
import masterstock.demo.dto.DtoProdutosGetId;
import masterstock.demo.entity.Produto;
import masterstock.demo.exception.ProdutoGetIdNotException;
import masterstock.demo.repository.ProdutoByIdProdutoRepository;
import masterstock.demo.repository.ProdutoRepository;

@Service
public class UseCaseDeleteIdProduto {


    @Autowired
    private ProdutoByIdProdutoRepository produtoByIdProdutoRepository;


    public void deleteIdProduto(UUID id){
       
        this.produtoByIdProdutoRepository.findById(id).ifPresentOrElse(
            dtoProdutos -> produtoByIdProdutoRepository.deleteById(id),
         ()-> {throw new ProdutoGetIdNotException();});
    }
    
}
