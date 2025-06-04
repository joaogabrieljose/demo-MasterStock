package masterstock.demo.dto.dtoProdutos;
import java.util.UUID;

public record DtoProdutosGetId(UUID id, String nome, Double preco, int quantidade) {
    
}
