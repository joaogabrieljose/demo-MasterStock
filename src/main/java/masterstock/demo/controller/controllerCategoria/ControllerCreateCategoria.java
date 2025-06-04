package masterstock.demo.controller.controllerCategoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import masterstock.demo.dto.dtoCategoria.DtoCategoria;
import masterstock.demo.service.useCaseCategorias.UseCaseCreateCategoria;

@RestController
@RequestMapping("/categorias")
public class ControllerCreateCategoria {

    @Autowired
    private UseCaseCreateCategoria caseCreateCategoria;

    @PostMapping("/")
    public ResponseEntity<?> categoriaCreate(@RequestBody DtoCategoria categoria){

        try {
            var cat = this.caseCreateCategoria.CreateCategoria(categoria);
            return ResponseEntity.ok().body(cat);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());        }
    }
    
}
