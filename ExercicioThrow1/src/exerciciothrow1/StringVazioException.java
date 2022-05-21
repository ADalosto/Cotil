package exerciciothrow1;

public class StringVazioException extends RuntimeException {
    @Override
    public String getMessage()
    {
    return "String não pode ser vazia";
    }
    
}
