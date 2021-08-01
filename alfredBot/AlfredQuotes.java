import java.util.Date;
public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    public String guestGreeting(String name, String dayPeriod) {
        return "place holder for guest greeting return string";
    }
    public String dateAnnouncement() {
        return "place holder for date announcement return string";
    }
    public String respondBeforeAlexis(String conversation) {
        return "place holder for snarky response return string";
    }
    public String answeringBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1) {
            return "snarky";
        }
        return "default";
    }
}
