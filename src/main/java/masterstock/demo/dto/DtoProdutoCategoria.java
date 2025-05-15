package masterstock.demo.dto;

import java.util.UUID;

public record DtoProdutoCategoria(UUID id, String nome, String descricao, double preco, int quantidade) {
}
