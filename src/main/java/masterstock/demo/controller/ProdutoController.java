package masterstock.demo.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import masterstock.demo.entity.Produto;
import masterstock.demo.service.useCaseProdutos.UseCaseCreateProdutos;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {


    @Autowired
    private UseCaseCreateProdutos useCaseCreateProdutos;

    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody Produto produto){
       
        try{
             var novo = useCaseCreateProdutos.createProduto(produto);
             return ResponseEntity.ok().body("create produto");

        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
}
