package masterstock.demo.service.useCaseProdutos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import masterstock.demo.dto.dtoProdutos.DtoProdutos;
import masterstock.demo.dto.dtoProdutos.DtoProdutosGetId;
import masterstock.demo.entity.Produto;
import masterstock.demo.exception.ProdutoPreceException;
import masterstock.demo.repository.ProdutoRepository;

@Service
public class UseCaseGetPrecoProdutosMinMax {


    @Autowired
    private ProdutoRepository produtoRepository;

    public Object getPrecoMinMax(double min, double max){

        Produto produto = this.produtoRepository.findByPrecoBetween(min, max);
        if (produto == null) {
            throw new ProdutoPreceException();
        }

        return new  DtoProdutos ();
    }
    
}
