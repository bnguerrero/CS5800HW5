
package CS5800HW5.Part1;

public class User 
{
    private String name;
    private Message messages;
    private ChatServer chatServer;

    private MessageMemento memento = new MessageMemento(messages.getContent(),messages.getTimeStamp());

    public User(String name,ChatServer chatServer)
    {
        this.name = name;
        this.chatServer = chatServer;
    }
    
    public String getName()
    {
        return name;
    }

    public void writeMessage(String text)
    {
        Message message = new Message(this, recipients, content);
    }

    public void undoMessage()
    {
        memento.getState();
    }

    public void sendMessage(String message)
    {
        chatServer.send(message,this);
    }

    public void receive(String message)
    {
        System.out.println();
    }


}
