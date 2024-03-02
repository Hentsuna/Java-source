package singleton.A4;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Election {
    int trump=0, bidden=0;
    List<String> users = new ArrayList<>();
    private static Election instance;

    private Election(){}
    public static Election getInstance(){
        if(instance == null)
            instance = new Election();
        return instance;
    }

    public void Vote(Candidate candidate, String Username){
        for(String name: users)
            if(name.equals(Username))
                return;
        if(candidate==Candidate.DonalTrump)
            trump++;
        else if (candidate==Candidate.JoeBidden)
            bidden++;
        users.add(Username);
    }
    public void kq(){
        System.out.println("DonalTrump: "+trump);
        System.out.println("JoeBidden: "+bidden);
    }
}
