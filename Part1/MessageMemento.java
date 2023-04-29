package CS5800HW5.Part1;

public class MessageMemento 
{
    private String state;
    private double timeStamp;

    public MessageMemento(String content, double timeStamp)
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
    public double getTimeStamp()
    {
        return timeStamp;
    }
    public void setTimeStamp(double timeStamp)
    {
        this.timeStamp = timeStamp;
    }
}
