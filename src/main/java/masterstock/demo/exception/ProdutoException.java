package masterstock.demo.exception;

public class ProdutoException extends RuntimeException{
    

    public ProdutoException(){
        super("existing product");
    }
}
