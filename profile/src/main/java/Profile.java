import java.util.ArrayList;
import java.util.List;

public class Profile {

    private String name;
    private int age;
    private List<Profile> friendList = new ArrayList<Profile>();

    public Profile(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addFriend(Profile profile) {
        if (!friendList.contains(profile)) {
            friendList.add(profile);
            profile.addFriend(this);
        }
    }

    public void deleteFriend(Profile profile) {
        if (friendList.contains(profile)) {
            friendList.remove(profile);
            profile.friendList.remove(this);
        }
    }


    public List<Profile> getFriendList() {
        return friendList;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
