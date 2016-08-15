
import java.util.ArrayList;
import java.util.List;

public class Chat {

    private List<Profile> companionList;
    private List<String> messageList;

    public Chat(Profile profile1, Profile profile2) {
        companionList = new ArrayList<Profile>();
        companionList.add(profile1);
        companionList.add(profile2);
    }

    public void sendMessage(String message) {
        if (messageList == null) {
            messageList = new ArrayList<String>();
        }
        messageList.add(message);
    }

    public void addCompanion(Profile profile) {
        if (companionList == null) {
            companionList = new ArrayList<Profile>();
        }
        companionList.add(profile);
    }

    public List<Profile> getCompanionList() {
        return companionList;
    }

    public List<String> getMessageList() {
        return messageList;
    }
}
