import java.util.ArrayList;
import java.util.List;

public class Profile {
    List<Profile> friendList = new ArrayList<Profile>();

    private String name;
    private int age;

    public Profile(String name) {
        this.name = name;
    }

    public Profile(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
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
}
