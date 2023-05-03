package CS5800HW5.Part1;

import java.util.ArrayList;
import java.util.List;


public class ChatServer 
{
    private List<User> registeredUsers;
    Message message;

    public ChatServer()
    {
        registeredUsers = new ArrayList<>();
    }

    public void registerUser(User user)
    {
        registeredUsers.add(user);
    }

    public void unRegisterUser(User user)
    {
        registeredUsers.remove(user);
    }
    public void send(Message message)
    {
        
        for(User users: message.getRecipients())
        {
            if(!message.getSender().isBlocked() && !users.isBlocked() && users != message.getSender())
            {
                System.out.println( "message: " + message.getContent() +  message.toString() + " To: " + users.getName() + " " + message.getTimeStamp());  
            }
        }
    }
    public List<User> getRecipients()
    {
        List<User> validUsers = new ArrayList<>();
        
        for (User user : registeredUsers)
        {
            if( !user.isBlocked())
            {
                validUsers.add(user);
            }
        }
        return validUsers;
    }
    public void getRecipientsName()
    {
        for (User user : registeredUsers)
        {
            System.out.println(user.getName());
        }
    }
    public List<User> getRegisteredUsers()
    {
        return registeredUsers;
    }
}
