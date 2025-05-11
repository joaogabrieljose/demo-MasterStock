package masterstock.demo.controller.controllerProdutos;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import masterstock.demo.service.useCaseProdutos.UseCaseGetIdProdutos;

@RestController
@RequestMapping("/produtos")
public class ControllerGetIdProdutos {

    @Autowired
    private UseCaseGetIdProdutos useCaseGetIdProdutos;


    @GetMapping("/{id}")
    public ResponseEntity<?> getId(@PathVariable UUID id){

        try {
            var get = useCaseGetIdProdutos.produtoGetId(id);
            return ResponseEntity.ok().body(get);
            
        } catch (Exception e) {
           return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
    
}
