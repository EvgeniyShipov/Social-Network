
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Photo {

    private List<Profile> notePersonList;
    private Profile profile;
    private final Date date;
    private String description;

    public Photo(Profile profile, String description) {
        date = new Date();
        this.profile = profile;
        this.description = description;
    }

    public void noteProfile(Profile profile) {
        if (notePersonList == null) {
            notePersonList = new ArrayList<Profile>();
            notePersonList.add(profile);
        }
    }

    public Profile getProfile() {
        return profile;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public List<Profile> getNotePersonList() {
        return notePersonList;
    }
}
