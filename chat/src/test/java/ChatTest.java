import org.junit.Test;

import static org.junit.Assert.*;


public class ChatTest {

    Profile profile1 = new Profile("John", 25);
    Profile profile2 = new Profile("Sara", 23);
    Profile profile3 = new Profile("Demid", 24);
    Chat chat = new Chat(profile1, profile2);

    @Test
    public void sendMessage1() throws Exception {
        chat.sendMessage("Hello!");
        assert(chat.getMessageList().contains("Hello!"));
    }

    @Test
    public void addCompanion1() throws Exception {
        chat.addCompanion(profile3);
        assert (chat.getCompanionList().contains(profile3));
    }

}