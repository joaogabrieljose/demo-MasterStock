package masterstock.demo.dto.dtoProdutos;

import org.springframework.beans.BeanUtils;

import lombok.Data;
import lombok.NoArgsConstructor;
import masterstock.demo.entity.Produto;
@NoArgsConstructor

@Data
public class DtoProdutos {
    long id;
    String nome;
    Double preco;
    int quantidade;

    public DtoProdutos(Produto entity){
        BeanUtils.copyProperties(entity, this);
    }


    
}
