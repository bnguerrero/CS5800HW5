package CS5800HW5;

import java.util.Stack;

public class MessageMemento 
{
    private Stack<String> state = new Stack<>();

    public MessageMemento(Stack<String> state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }
}
