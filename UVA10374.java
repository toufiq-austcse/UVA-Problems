package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/

import java.io.*;
import java.util.*;

public class UVA10374 {


    static class party {
        String name;
        String partyName;
        int numbeOfVote;

        public party(String name, String partyName, int numbeOfVote) {
            this.name = name;
            this.partyName = partyName;
            this.numbeOfVote = numbeOfVote;
        }

        public party(String name, String partyName) {
            this.name = name;
            this.partyName = partyName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPartyName() {
            return partyName;
        }

        public void setPartyName(String partyName) {
            this.partyName = partyName;
        }

        public int getNumbeOfVote() {
            return numbeOfVote;
        }

        public void setNumbeOfVote(int numbeOfVote) {
            this.numbeOfVote = numbeOfVote;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine().trim());
        boolean first = true;

        while (t-- > 0) {
            in.readLine();

            int n = Integer.parseInt(in.readLine().trim());
            List<party> list = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                String name = in.readLine().trim();
                String party = in.readLine().trim();
                list.add(new party(name, party));

            }

            int m = Integer.parseInt(in.readLine().trim());
            for (int j = 0; j < m; j++) {
                String vote = in.readLine();
                for (int k = 0; k < list.size(); k++) {
                    if (list.get(k).getName().equals(vote)) {
                        list.get(k).setNumbeOfVote(list.get(k).getNumbeOfVote() + 1);
                    }
                }
            }

            if (first) first = false;
            else System.out.println();

            if (isTie(list)) {
                System.out.println("tie");
            } else {
                System.out.println(getWinningPartyName(list));
            }


        }


    }

    public static String getWinningPartyName(List<party> list) {
        String name = "";
        int vote = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNumbeOfVote() > vote) {
                name = list.get(i).getPartyName();
                vote = list.get(i).getNumbeOfVote();
            }

        }

        return name;
    }

    public static boolean isTie(List<party> list) {
        List<Integer> votes = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            votes.add(list.get(i).getNumbeOfVote());
        }
        Collections.sort(votes);
        int higst = votes.get(votes.size() - 1);

        int count = 0;

        for (int i = 0; i < votes.size(); i++) {
            if (votes.get(i) == higst) {
                count++;
            }
        }

        if (count > 1) {
            return true;
        } else {
            return false;
        }

    }
}

