package masterstock.demo.controller.controllerProdutos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import masterstock.demo.service.useCaseProdutos.UseCaseGetPrecoProdutosMinMax;

@RestController
@RequestMapping("/produtos")
public class ControllerPrecoProdutoMinMax {

    @Autowired
    private UseCaseGetPrecoProdutosMinMax caseGetPrecoProdutosMinMax;


    @GetMapping("/preco")
    public ResponseEntity<?> getPrecoMinMax(@RequestParam (required = false, defaultValue = "0") double min, 
                                            @RequestParam(required = false, defaultValue = "950.0") double max){
        
        try {
            var novo = this.caseGetPrecoProdutosMinMax.getPrecoMinMax(min, max);
            return ResponseEntity.ok().body(novo);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
