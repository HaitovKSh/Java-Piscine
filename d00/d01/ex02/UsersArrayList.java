package d00.d01.ex02;

import java.util.ArrayList;

public class UsersArrayList implements UserList{
    private static final int DEFAULT_CAPACITY = 10;

    private int capacity = DEFAULT_CAPACITY;
    private int size = 0;

    private User [] users = new User[capacity];

    @Override
    public void addUser(User user) throws NullPointerException {
        if (size >= capacity)	{
            reallocUsers();
        }
        if (user != null)	{
            users[size] = user;
            size++;
        } else {
            throw new NullPointerException();
        }
    }

    private void reallocUsers() {
        this.capacity += DEFAULT_CAPACITY;
        User[] sub = new User[this.capacity];
        //  System.arraycopy(this.users,0,sub,0,this.users.length);
        for (int i = 0; i < size; i++) {
            sub[i] = users[i];
        }
        this.users = sub;
    }

    @Override
    public User getUserByID(int id) throws UserNotFoundException{
        for (int i = 0; i < size; i++) {
            if (users[i].getId() == id)
                return (users[i]);
        }
        throw new UserNotFoundException();
    }

    @Override
    public User getUserByIndex(int index)
            throws UserNotFoundException, ArrayIndexOutOfBoundsException {
        if (index < 0)	{
            throw new ArrayIndexOutOfBoundsException();
        }
        else if (users[index] == null)	{
            throw new UserNotFoundException();
        }
        return (users[index]);

    }

    @Override
    public int getNumUsers() {
        return (size);
    }
}
