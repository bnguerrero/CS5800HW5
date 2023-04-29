
package CS5800HW5.Part1;

public class User 
{
    private String name;
    private Message messages;

    private MessageMemento memento = new MessageMemento(messages.getContent(),messages.getTimeStamp());

    public User(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }

    public void writeMessage(String text)
    {
        
    }

    public void undoMessage()
    {
        memento.getState();
    }

    public void sendMessage()
    {
        System.out.println(messages.getContent());
    }


}
