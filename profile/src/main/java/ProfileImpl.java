import java.util.ArrayList;
import java.util.List;

public class ProfileImpl implements Profile {
    List<ProfileImpl> friendList = new ArrayList<ProfileImpl>();

    private String name;
    private int age;

    public ProfileImpl(String name) {
        this.name = name;
    }

    public ProfileImpl(String name, int age) {
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

    public void addFriend(ProfileImpl profile) {
        if (!friendList.contains(profile)) {
            friendList.add(profile);
            profile.addFriend(this);
        }
    }

    public void deleteFriend(ProfileImpl profile) {
        if (friendList.contains(profile)) {
            friendList.remove(profile);
            profile.friendList.remove(this);
        }
    }
}
