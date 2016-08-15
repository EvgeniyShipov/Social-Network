
import java.util.ArrayList;
import java.util.List;

public class Gift {

    private final Profile sender;
    private final Profile getter;
    private final String description;
    List<Profile> senders = new ArrayList<Profile>();
    List<Profile> getters = new ArrayList<Profile>();

    public Gift(Profile sender, Profile getter, String description) {
        this.sender = sender;
        this.getter = getter;
        this.description = description;
        senders.add(sender);
        getters.add(getter);
    }

    public Profile getSender() {
        return sender;
    }

    public Profile getGetter() {
        return getter;
    }

    public String getDescription() {
        return description;
    }
}
