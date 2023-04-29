package CS5800HW5;

import java.util.Stack;

public class User 
{
    private String name;
    private Stack<Message> messages = new Stack<>();
    private MessageMemento memento = new MessageMemento(messages);

    public User(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }

    public void writeMessage(Message message)
    {
        messages.push(message);
    }

    public void undoMessage()
    {
        messages.pop();
    }

    public void sendMessage(Stack<Message> mess)
    {
        for(Message message : messages)
        {
            
            System.out.println(message); 
        }
        
    }


}
