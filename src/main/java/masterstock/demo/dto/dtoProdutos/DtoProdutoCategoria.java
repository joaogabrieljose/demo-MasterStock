package masterstock.demo.dto.dtoProdutos;

import java.util.UUID;

import masterstock.demo.entity.Categoria;

public record DtoProdutoCategoria(
    UUID produtoId,
    String nomeProduto,
    double preco,
    int quantidade,
    UUID categoriaId,
    String nomeCategoria
) {}