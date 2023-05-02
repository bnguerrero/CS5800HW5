package CS5800HW5.Part1;
import java.util.Date;

public class MessageMemento 
{
    private String content;
    private Date timeStamp;

    public MessageMemento(String content, Date timeStamp)
    {
        this.content = content;
        this.timeStamp = timeStamp;
    }
    public String getContent()
    {
        return content;
    }
    public Date getTimeStamp()
    {
        return timeStamp;
    }
}
