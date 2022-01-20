package d00.d01.ex02;

public interface UserList {
    int DEFAULT_SIZE = 10;

    void addUser(User user) throws NullPointerException;
    User getUserByID(int id);
    User getUserByIndex(int index);
    int getNumUsers();
}
