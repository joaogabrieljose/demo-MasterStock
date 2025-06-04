package masterstock.demo.controller.controllerCategoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import masterstock.demo.service.useCaseCategorias.UseCaseCreateCategoria;
import masterstock.demo.service.useCaseCategorias.UseCaseFindAllCategoria;

@RestController
@RequestMapping("/categorias")
public class ControllerFindAllCategoria {

    @Autowired
    private UseCaseFindAllCategoria useCaseFindAllCategoria;

    @GetMapping("/")
    public ResponseEntity<?> findAllCategoria(){

        try {
            var findAllCat = this.useCaseFindAllCategoria.findAllCategoria();
            return ResponseEntity.ok().body(findAllCat);

        } catch (Exception e) {
           return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    
}
