package CS5800HW5.Part1;

import java.util.Iterator;
import java.util.List;


/**
 * searchMessageByUser
 */
public class searchMessageByUser implements Iterator<Message>
{
    private int currentIndex;
    private  List<Message> messages;
    private  User user;

    public searchMessageByUser(List<Message> messages, User user) 
    {
        this.currentIndex = 0;
        this.messages = messages;
        this.user = user;
    }

    @Override
    public boolean hasNext() 
    {
        while (currentIndex < messages.size()) {
            Message message = messages.get(currentIndex);
            if (message.getSender().equals(user) || message.getRecipients().equals(user)) {
                return true;
            }
            currentIndex++;
        }
        return false;
    }

    @Override
    public Message next() 
    {
        if (!hasNext()) 
        {
            return null;
        }
        Message message = messages.get(currentIndex);
        currentIndex++;
        return message;
    }

    
}