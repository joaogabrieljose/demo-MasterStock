package masterstock.demo.service.useCaseProdutos;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import masterstock.demo.dto.dtoProdutos.DtoProdutos;
import masterstock.demo.entity.Produto;
import masterstock.demo.exception.ProdutoException;
import masterstock.demo.exception.ProdutoNotException;
import masterstock.demo.repository.ProdutoRepository;

@Service
public class UseCaseFindAllProdutos {

    @Autowired 
    private ProdutoRepository produtoRepository;

    public List<DtoProdutos> findAll (){

        List<Produto> findAll = this.produtoRepository.findAll();
        if (findAll == null) {
            throw new ProdutoNotException();
        }

       return findAll.stream().map(use -> new DtoProdutos(use)).toList();
    }
    
}
