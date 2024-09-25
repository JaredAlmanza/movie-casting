package showtime;

public class Show {
    private String title;
    private CastMember[] castMembers;
    private int numCastMembers;

    public Show(String title, int numCastMembers) {
        this.title = title;
        this.numCastMembers = numCastMembers;
        this.castMembers = new CastMember[numCastMembers];
    }

    public void addCastMember(CastMember castMember) {
        for (int i = 0; i < castMembers.length; i++) {
            if (castMembers[i] == null) {
                castMembers[i] = castMember;
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Show: " + title + "\n" + numCastMembers + " cast members:\n");
        for (CastMember castMember : castMembers) {
            if (castMember != null) {
                sb.append(castMember);
            }
        }
        return sb.toString();
    }
}