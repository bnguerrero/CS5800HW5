package CS5800HW5.Part1;

public class Driver 
{
    public static void main(String[] args) 
    {
        ChatServer chat1 = new ChatServer();

       User bri = new User("bri", chat1 );
       User jj = new User("jj", chat1);
       User yourMom = new User("mom", chat1);
       User spam = new User("spam", chat1);

       
       chat1.registerUser(bri);
       chat1.registerUser(jj);
       chat1.registerUser(yourMom);
       chat1.registerUser(spam);
       
       spam.setBlocked(true); 
       bri.sendMessage(chat1.getRecipients(), "What are you guys doing today?");
       bri.sendMessage(chat1.getRecipients(), "Where are you guys?");
       bri.undoLastMessage();
       bri.recieveMessage();
       spam.sendMessage(chat1.getRecipients(), "This is the IRS...");
       bri.getChatHistory();

       

    }

    
}
