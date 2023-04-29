package CS5800HW5.Part1;

import java.sql.Date;

public class MessageMemento 
{
    private String state;
    private Date timeStamp;

    public MessageMemento(String content, Date timeStamp)
    {
        this.state = content;
        this.timeStamp = timeStamp;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }
    public Date getTimeStamp()
    {
        return timeStamp;
    }
    public void setTimeStamp(Date timeStamp)
    {
        this.timeStamp = timeStamp;
    }
}
