package masterstock.demo.exception;

public class ProdutoGetIdNotException extends RuntimeException {
    
    public ProdutoGetIdNotException(){
        super("produto id not found");
    }
}
