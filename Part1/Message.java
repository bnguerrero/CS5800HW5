package CS5800HW5.Part1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Message 
{
    private User sender;
    private List<User> recipients = new ArrayList<>();
    private Date timeStamp;
    private String content;

    public Message(User sender, List<User> recipients, String content)
    {
        this.sender = sender;
        this.recipients = recipients;
        this.content = content;
        timeStamp = new Date();
    }

    public User getSender()
    {
        return sender;
    }

    public List<User> getRecipients()
    {
        return recipients;
    }

    public void getRecipientsName()
    {
        for (User user : recipients)
        {
            System.out.println(user.getName());                           
        }
    }

    public String getContent()
    {
        return content;
    }
    public void setContent(String content)
    {
        this.content = content;
    }
    public Date getTimeStamp()
    {
        return timeStamp;
    }
    public void setTimeStamp(Date timeStamp)
    {
        this.timeStamp = timeStamp;
    }
    public String toString()
    {
        return " From: " + sender.name + " ";
    }
    

}