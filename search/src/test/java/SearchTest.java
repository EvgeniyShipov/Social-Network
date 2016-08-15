import org.junit.Test;

import static org.junit.Assert.*;


public class SearchTest {

    Profile profile1 = new Profile("John", 25);
    Profile profile2 = new Profile("Sara", 23);
    Profile profile3 = new Profile("Demid", 23);
    Search search = new Search();


    @Test
    public void searchByName() throws Exception {
        search.profileList.add(profile1);
        search.profileList.add(profile2);
        search.searchByName("John");
        assert (search.foundProfile.contains(profile1));
        assert !(search.foundProfile.contains(profile2));
    }

    @Test
    public void searchByAge() throws Exception {
        search.profileList.add(profile1);
        search.profileList.add(profile2);
        search.searchByAge(23);
        assert (search.foundProfile.contains(profile2));
        assert !(search.foundProfile.contains(profile3));
    }

}