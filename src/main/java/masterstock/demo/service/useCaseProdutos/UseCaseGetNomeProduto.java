package masterstock.demo.service.useCaseProdutos;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import masterstock.demo.dto.dtoProdutos.DtoProdutos;
import masterstock.demo.dto.dtoProdutos.DtoProdutosGetId;
import masterstock.demo.entity.Produto;
import masterstock.demo.exception.ProdutoException;
import masterstock.demo.exception.ProdutoNotException;
import masterstock.demo.repository.ProdutoRepository;

@Service
public class UseCaseGetNomeProduto {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    public Object getNome(String nomeProduto){

       Produto dtoProdutosGetId = produtoRepository.findByNomeContainingIgnoreCase(nomeProduto);
       if (dtoProdutosGetId == null) {
        throw new ProdutoNotException();
       }

      return new  DtoProdutosGetId(
        dtoProdutosGetId.getId(), 
        dtoProdutosGetId.getNome(), 
        dtoProdutosGetId.getPreco(), 
        dtoProdutosGetId.getQuantidade());
    }
}
