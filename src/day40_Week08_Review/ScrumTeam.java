package day40_Week08_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO, BA, SM;
    public ArrayList<Developer> devlist= new ArrayList<>();
    public ArrayList<Tester> testerlist= new ArrayList<>();

    public ScrumTeam(String PO, String BA, String SM, ArrayList<Developer> devlist, ArrayList<Tester> testerlist) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.devlist = devlist;
        this.testerlist = testerlist;
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", devlist=" + devlist +
                ", testerlist=" + testerlist +
                '}';
    }
}
