import java.util.Date;
public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Let's do java coding together", dayPeriod, name);
    }
    public String dateAnnouncement() {
        return String.format("today is %s", new Date());
    }
    public String respondBeforeAlexis(String conversation) {
        return "place holder for snarky response return string";
    }
    public String answeringBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1) {
            return "snarky";
        }
        else if (conversation.indexOf("Alfred") > -1) {
            return "Alfred is it you?";
        }
        else {
            return "I dont know who is it?";
        }
    }
    public String yell(String name, String battery) {
        return String.format("yelling at %s if battery is %s" , name, battery);
    }
}
