package masterstock.demo.controller.controllerProdutos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import masterstock.demo.dto.dtoProdutos.DtoProdutos;
import masterstock.demo.service.useCaseProdutos.UseCaseCreateProdutos;
import masterstock.demo.service.useCaseProdutos.UseCaseFindAllProdutos;




@RestController
@RequestMapping("/produto")
public class ControllePostProdutos {


    @Autowired
    private UseCaseCreateProdutos useCaseCreateProdutos;

    @Autowired UseCaseFindAllProdutos useCaseFindAllProdutos;

    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody DtoProdutos dtoProdutos){
       
        try{
             var novo = useCaseCreateProdutos.createProduto(dtoProdutos);
             return ResponseEntity.ok().body("create produto");

        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


   
    
    
}
