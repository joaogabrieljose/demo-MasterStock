package masterstock.demo.controller.controllerProdutos;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import masterstock.demo.dto.DtoProdutoCategoria;
import masterstock.demo.service.useCaseProdutos.UseCaseProdutosCategoria;

@RestController
@RequestMapping("/produtos")
public class ControllerCategoriaProdutos {

    @Autowired
    private UseCaseProdutosCategoria caseProdutosCategoria;

    @GetMapping("/categoria/{id}")
    public ResponseEntity<?> categoriaProdutos(@PathVariable UUID id){

        try {
            var categoria = this.caseProdutosCategoria.produtoCategoria(id);
            return ResponseEntity.ok().body(categoria);
            
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    
}
