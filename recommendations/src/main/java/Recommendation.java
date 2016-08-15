
public class Recommendation {

    private final Profile recommender;
    private final Profile recommended;

    public Recommendation(Profile recommender, Profile recommended) {
        this.recommender = recommender;
        this.recommended = recommended;
    }

    public Profile getRecommender() {
        return recommender;
    }

    public Profile getRecommended() {
        return recommended;
    }
}
