package masterstock.demo.controller.controllerProdutos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import masterstock.demo.service.useCaseProdutos.UseCaseFindAllProdutos;

@RestController
@RequestMapping("/produto")
public class ControllerGetProdutos {

    @Autowired
    private UseCaseFindAllProdutos caseFindAllProdutos;

    @GetMapping("/")
    public ResponseEntity<?> findAll(){

        try {
            var novo = caseFindAllProdutos.findAll();
            return ResponseEntity.ok().body(novo);
        } catch (Exception e) {
           return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    
}
