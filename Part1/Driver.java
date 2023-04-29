package CS5800HW5.Part1;
public class Driver 
{
    public static User user1 = new User("bri");
    //private static Message message = new Message();
    public static void main(String[] args) 
    {
        user1.getName();
        user1.writeMessage("hey");
        user1.sendMessage();
        user1.writeMessage("what are you doing tomorrow?");
        user1.sendMessage();
        user1.undoMessage();
        user1.sendMessage();
       
        
    }
}
