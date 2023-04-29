package CS5800HW5.Part1;

import java.util.ArrayList;
import java.util.List;

public class ChatServer 
{
    private List<User> users; 
    private List<User> blockedUser;

    public ChatServer()
    {
        this.users = new ArrayList<>();
        this.blockedUser = new ArrayList<>();
    }
    public void register(User user)
    {
        users.add(user);
        blockedUser.add(user);
    }
    public void unRegister(User user)
    {
        users.remove(user);
    }
    public void send(String message, User sender)
    {
        for(User users : users)
        {
            if(users != sender)
            {
                users.receive(message);
            }
        }

    }

}
