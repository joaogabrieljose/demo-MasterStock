package masterstock.demo.exception;

public class ProdutoPreceException extends RuntimeException {
 
    public ProdutoPreceException(){s
        super("preco not found");
    }
}
