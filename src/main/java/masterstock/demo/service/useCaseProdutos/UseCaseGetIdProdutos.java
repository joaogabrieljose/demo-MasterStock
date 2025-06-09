package masterstock.demo.service.useCaseProdutos;

import java.util.UUID;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import masterstock.demo.dto.dtoProdutos.DtoProdutosGetId;
import masterstock.demo.entity.Produto;
import masterstock.demo.exception.ProdutoException;
import masterstock.demo.repository.ProdutoRepository;

@Service
public class UseCaseGetIdProdutos {

    @Autowired 
    private ProdutoRepository produtoRepository;

    public DtoProdutosGetId produtoGetId(long id) {

        Produto produto = this.produtoRepository.findById(id).get();
        if (produto == null) {
            throw new ProdutoException();
        }
        
        return new DtoProdutosGetId(
            produto.getId(),
            produto.getNome(),
            produto.getPreco(),
            produto.getQuantidade() 
        );
    }
}
