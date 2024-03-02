package singleton.A4;

public class MainVote {
    public static void main(String[] args) {
        User Trong = new User("Trong");
        User Minh = new User("Minh");
        User Tung = new User("Tung");
        User My = new User("My");
        Trong.Vote(Candidate.JoeBidden);
        Minh.Vote(Candidate.DonalTrump);
        Tung.Vote(Candidate.DonalTrump);
        Tung.Vote(Candidate.DonalTrump);
        My.Vote(Candidate.JoeBidden);
        Election.getInstance().kq();
    }
}
