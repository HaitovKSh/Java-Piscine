package d01.ex02;

public interface UserList {
    int DEFAULT_SIZE = 10;

    void addUser(User user);
    User getUserByID(int id);
    User getUserByIndex(int index);
    int getNumUsers();
}
