package CS5800HW5.Part1;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;
import java.util.List;


public class Message 
{
    private User sender;
    private List<User> recipients;
    private String content = "";
    private java.util.Date timeStamp = new java.util.Date();
    public Message(User sender, List<User> recipients, String content)
    {
        this.sender = sender;
        this.recipients = recipients;
        this.content = content;
    }
    public User getSender()
    {
        return sender;
    }
    public List<User> getRecipients()
    {
        return recipients;
    }
    public java.util.Date getTimeStamp()
    {
        return timeStamp;
    }
    public String getContent()
    {
        return content;
    }
}
