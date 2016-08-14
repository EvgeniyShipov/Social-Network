import org.junit.Test;

import static org.junit.Assert.*;


public class ProfileTest {

    Profile profile1 = new Profile("John");
    Profile profile2 = new Profile("Sara");

    @Test
    public void addFriend() throws Exception {
        profile1.addFriend(profile2);
        assertEquals(profile1.friendList.contains(profile2), profile2.friendList.contains(profile1));
    }

    @Test
    public void deleteFriend() throws Exception {
        profile2.deleteFriend(profile1);
        assert!(profile1.friendList.contains(profile2));
        assert!(profile2.friendList.contains(profile1));
    }

}