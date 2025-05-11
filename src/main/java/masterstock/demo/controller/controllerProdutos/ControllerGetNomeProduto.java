package masterstock.demo.controller.controllerProdutos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import masterstock.demo.service.useCaseProdutos.UseCaseGetNomeProduto;

@RestController
@RequestMapping("/produtos")
public class ControllerGetNomeProduto {

    @Autowired
    private UseCaseGetNomeProduto useCaseGetNomeProduto;

    @GetMapping("")
    public ResponseEntity<?> getNomeFilter(@RequestParam(required = false) String nome){
        
        try {
            var novo = this.useCaseGetNomeProduto.getNome(nome);
            return ResponseEntity.ok().body(novo);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
}
