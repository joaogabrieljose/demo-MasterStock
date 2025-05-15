package masterstock.demo.exception;

public class ProdutoCategoriaNotNullException extends RuntimeException {
 
    public ProdutoCategoriaNotNullException(){
        super("Categoria not found id");
    }
}
