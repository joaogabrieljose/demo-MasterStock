package masterstock.demo.dto.dtoCategoria;

import org.springframework.beans.BeanUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import masterstock.demo.entity.Categoria;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDTORequest {
    private String nome;
    private String descricao;

    public CategoriaDTORequest(Categoria entity){
        BeanUtils.copyProperties(entity, this);
    }

}
