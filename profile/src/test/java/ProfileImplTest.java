import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class ProfileImplTest {

    ProfileImpl profile1 = new ProfileImpl("John");
    ProfileImpl profile2 = new ProfileImpl("Sara");

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