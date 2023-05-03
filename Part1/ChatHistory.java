package CS5800HW5.Part1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ChatHistory implements IterableByUser
{
    List<Message> chatHistory;

    public ChatHistory()
    {
        chatHistory = new ArrayList<>();
    }

    public void addMessage(Message message)
    {
        chatHistory.add(message);
    }

    public void removeLastMessage()
    {
        if (chatHistory.size() > 0) 
        {
            chatHistory.remove(chatHistory.size() - 1);
        }
    }
    
    public Message getLastMessage()
    {
        if(chatHistory.size() > 0)
        {
            return chatHistory.get(chatHistory.size()-1);
        }
        else
        {
            return null;
        }
    }

    public List<Message> getMessages()
    {
        return chatHistory;
    }



    public Iterator<Message> iterator() 
    {
        return chatHistory.iterator();
    }

    public Iterator iterator(User userToSearchWith) 
    {
        return new searchMessagesByUser(chatHistory.iterator(), userToSearchWith);
    }

    private class searchMessagesByUser implements Iterator<Message> 
    {
        private Iterator<Message> iterator;
        private User userToSearchWith;

        public searchMessagesByUser(Iterator<Message> iterator, User userToSearchWith) 
        {
            this.iterator = iterator;
            this.userToSearchWith = userToSearchWith;
        }

        public boolean hasNext() {
            while (iterator.hasNext()) 
            {
                Message message = iterator.next();
                if (message.getSender().equals(userToSearchWith.getName()) || message.getRecipients().equals(userToSearchWith.getName())) 
                {
                    return true;
                }
            }
            return false;
        }

        public Message next() 
        {
            if (hasNext()) {
                return iterator.next();
            } else {
                return null;
            }
        }

        public void remove() 
        {
            iterator.remove();
        }
    }
}
