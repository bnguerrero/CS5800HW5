package CS5800HW5.Part1;

import java.util.ArrayList;
import java.util.List;


public class ChatHistory 
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
}


