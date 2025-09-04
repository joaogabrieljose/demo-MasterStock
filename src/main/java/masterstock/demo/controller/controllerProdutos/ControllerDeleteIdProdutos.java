package masterstock.demo.controller.controllerProdutos;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import masterstock.demo.service.useCaseProdutos.UseCaseDeleteIdProduto;

@RestController
@RequestMapping("/produtos")
public class ControllerDeleteIdProdutos {

    @Autowired 
    private UseCaseDeleteIdProduto useCaseDeleteIdProduto;

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProdutoId(@PathVariable long id){

        try {
           this.useCaseDeleteIdProduto.deleteIdProduto(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
}
