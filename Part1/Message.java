package CS5800HW5.Part1;
import java.util.List;


public class Message 
{
    private User sender;
    private List<User> recipients;
    private String content = "";
    private double timeStamp;

    public Message(User sender, List<User> recipients, String content, double timeStamp)
    {
        this.sender = sender;
        this.recipients = recipients;
        this.content = content;
        this.timeStamp = timeStamp;
    }
    public User getSender()
    {
        return sender;
    }
    public List<User> getRecipients()
    {
        return recipients;
    }
    public double getTimeStamp()
    {
        return timeStamp;
    }
    public String getContent()
    {
        return content;
    }
}
