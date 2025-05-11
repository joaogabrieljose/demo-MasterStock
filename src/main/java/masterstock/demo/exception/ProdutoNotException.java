package masterstock.demo.exception;

public class ProdutoNotException extends RuntimeException {
    
    public ProdutoNotException(){
        super("nome não encontrado");
    }
}
