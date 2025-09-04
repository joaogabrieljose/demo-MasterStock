package masterstock.demo.service.useCaseProdutos;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import jakarta.transaction.Transactional;
import masterstock.demo.dto.dtoProdutos.DtoProdutoCategoria;
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

    @Transactional
    public List<DtoProdutoCategoria> produtoCategoria(long idCategoria){

        if (!categoriaRepository.existsById(idCategoria)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrada");
        }
        return produtoRepository.findByCategoriaId(idCategoria).stream()
            .map(produto -> new DtoProdutoCategoria(
                produto.getId(),
                produto.getNome(),
                produto.getPreco(),
                produto.getQuantidade(),
                produto.getCategoria().getId(),
                produto.getCategoria().getNome()
            
            ))
            .collect(Collectors.toList());
        }
    
    
}
