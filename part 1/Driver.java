package CS5800HW5;

public class Driver 
{
    private static Message message = new Message();
    public static void main(String[] args) 
    {
        message.writeMessage("hey");
        message.sendMessage();
        message.save();
        message.writeMessage("what are you doing tomorrow?");
        message.sendMessage();
        message.undo();
        message.sendMessage();
        
    }
}
