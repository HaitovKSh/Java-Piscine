package d00.d01.ex02;

public class UserNotFoundException extends RuntimeException {
    @Override
    public String toString() {
        return ("User not found!");
    }
}
