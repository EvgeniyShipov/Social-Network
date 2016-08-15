
import java.util.ArrayList;
import java.util.List;

public class Search {
    List<Profile> profileList;
    List<Profile> foundProfile = new ArrayList<Profile>();

    public Search() {
        profileList = new ArrayList<Profile>();
    }

    public List<Profile> searchByName(String name) {
        for (Profile profile : profileList) {
            if (profile.getName().equals(name)) {
                foundProfile.add(profile);
            }
        }
        return foundProfile;
    }

    public List<Profile> searchByAge(int age) {
        for (Profile profile : profileList) {
            if (profile.getAge() == age) {
                foundProfile.add(profile);
            }
        }
        return foundProfile;
    }

    public List<Profile> getProfileList() {
        return profileList;
    }

}
