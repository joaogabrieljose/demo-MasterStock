package masterstock.demo.service.useCaseProdutos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import masterstock.demo.dto.dtoProdutos.DtoProdutos;
import masterstock.demo.entity.Produto;
import masterstock.demo.exception.ProdutoException;
import masterstock.demo.repository.ProdutoRepository;

@Service
public class UseCaseFindAllProdutos {

    @Autowired 
    private ProdutoRepository produtoRepository;

    public Object findAll (){
       return this.produtoRepository.findAll();
    }
    
}
