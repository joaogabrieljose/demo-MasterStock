package masterstock.demo.controller.controllerProdutos;

import java.util.Collections;
import java.util.UUID;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import masterstock.demo.dto.dtoCategoria.DtoCategoria;
import masterstock.demo.dto.dtoProdutos.DtoProdutoCategoria;
import masterstock.demo.service.useCaseProdutos.UseCaseProdutosCategoria;

@RestController
@RequestMapping("/produtos")
public class ControllerCategoriaProdutos {

    @Autowired
    private UseCaseProdutosCategoria caseProdutosCategoria;
    @GetMapping("/categoria/{id}")
        public ResponseEntity<List<DtoProdutoCategoria>> listarPorCategoria(@PathVariable UUID id) {
            List<DtoProdutoCategoria> produtos =caseProdutosCategoria.produtoCategoria(id);
            
            if (produtos.isEmpty()) {
                return ResponseEntity.noContent().build(); // Retorna 204 se vazio
            }
            
            return ResponseEntity.ok(produtos); // Retorna 200 com a lista
        }
    }

    

