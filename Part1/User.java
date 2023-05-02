package CS5800HW5.Part1;

import java.util.List;

public class User 
{
    String name; 
    boolean blocked;
    private ChatServer chatServer;
    private ChatHistory chatHistory;
    private Message message;
    private MessageMemento memento;

    public User(String name, ChatServer chatServer)
    {
        this.name = name;
        this.chatServer = chatServer;
        this.chatHistory = new ChatHistory();
    }

    public String getName()
    {
        return name;
    }
    public void sendMessage(List<User> recipients, String content)
    {
        Message message = new Message(this,recipients, content);
        chatServer.send(message);
        this.message = message;
        memento = new MessageMemento(message.getContent(), message.getTimeStamp());
        chatHistory.addMessage(message);
    }
    public void recieveMessage()
    {
        System.out.println("recieved message" + message.toString()); 
    }
    public void undoLastMessage()
    {
        if(message != null && memento != null)
        {
            message.setContent(memento.getContent());
            message.setTimeStamp(memento.getTimeStamp());
            System.out.println("message '" + message.getContent()+ "' undone.");
            chatHistory.removeLastMessage();
        }
        else
        {
            System.out.println("no message to undo");
        }
    }
    public void setBlocked(boolean blocked)
    {
        this.blocked = blocked;
    }

    public boolean isBlocked()
    {
        return blocked;
    }
    
    public User getUser()
    {
        return new User(this.name, this.chatServer);
    }


    public void getChatHistory()
    {
        List<Message> chatHistory = this.getMessages();
        for(Message message : chatHistory)
        {
            System.out.println(message.getContent());
        }
    }
    public List<Message> getMessages()
    {
        return chatHistory.getMessages();
    }
}
