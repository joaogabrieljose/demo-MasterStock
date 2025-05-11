package masterstock.demo.dto;

import java.util.UUID;

import masterstock.demo.entity.Produto;

public record DtoProdutosGetId(UUID id, String nome, Double preco, int quantidade) {

    public Produto orElseThrow(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'orElseThrow'");
    }
    
}
