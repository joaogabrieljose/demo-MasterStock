package masterstock.demo.exception.exceptionCategoria;

public class CategoriaNotNullException extends RuntimeException {
    
    public CategoriaNotNullException(){
        super("categoria not found");
    }
}
