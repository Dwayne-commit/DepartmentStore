package Service;

public class InvalidInputException extends Exception{

    @Override
    public String getMessage(){
        return "WRONG USERNAME OR PASSWORD";
    }
}
