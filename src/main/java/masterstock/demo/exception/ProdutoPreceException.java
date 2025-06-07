package masterstock.demo.exception;

public class ProdutoPreceException extends RuntimeException {
 
    public ProdutoPreceException(){
        super("preco not found");
    }
}
