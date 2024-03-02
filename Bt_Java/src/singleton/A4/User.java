package singleton.A4;

public class User {
    String name;

    public User(String name) {
        this.name = name;
    }
    public void Vote(Candidate candidate){
        Election.getInstance().Vote(candidate, this.name);
    }
}
