package masterstock.demo.dto.dtoProdutos;

import java.util.UUID;

import masterstock.demo.entity.Categoria;

public record DtoProdutoCategoria(
    long produtoId,
    String nomeProduto,
    double preco,
    int quantidade,
    long categoriaId,
    String nomeCategoria
) {}