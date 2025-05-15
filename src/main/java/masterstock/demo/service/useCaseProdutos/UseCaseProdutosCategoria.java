package masterstock.demo.service.useCaseProdutos;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import masterstock.demo.dto.DtoProdutoCategoria;
import masterstock.demo.entity.Categoria;
import masterstock.demo.entity.Produto;
import masterstock.demo.exception.ProdutoCategoriaNotNullException;
import masterstock.demo.repository.CategoriaRepository;
import masterstock.demo.repository.ProdutoRepository;

@Service
public class UseCaseProdutosCategoria {

    @Autowired 
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<DtoProdutoCategoria> produtoCategoria(UUID idCategoria){

        Categoria produtoCategoriaId = this.categoriaRepository.findById(idCategoria);
        if (produtoCategoriaId == null) {
            throw new ProdutoCategoriaNotNullException();
        }
        List<Produto> produtos =  (List<Produto>) this.produtoRepository.findByCategoria(idCategoria);

        return produtos.stream()
                .map(produto -> new DtoProdutoCategoria(
                        produto.getId(),
                        produto.getNome(),
                        produto.getCategoria().getDescricao(),
                        produto.getPreco(),
                        produto.getQuantidade()))
                .collect(Collectors.toList());
    }
    
}
