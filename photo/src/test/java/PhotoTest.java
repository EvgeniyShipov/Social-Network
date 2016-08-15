import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Евгений on 16.08.2016.
 */
public class PhotoTest {

    Profile profile1 = new Profile("John", 25);
    Profile profile2 = new Profile("Sara", 23);
    Photo photo = new Photo(profile1, "Photo");

    @Test
    public void noteProfile() throws Exception {
        photo.noteProfile(profile2);
        assert(photo.getNotePersonList().contains(profile2));
    }

    @Test
    public void dontNoteProfile() throws Exception {
        photo.noteProfile(profile2);
        assert(!photo.getNotePersonList().contains(profile1));
    }

}