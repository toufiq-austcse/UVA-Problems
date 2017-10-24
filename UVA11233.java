package UVA;

import InputOutput.InputReader;
import InputOutput.OutputWriter;

import java.util.ArrayList;
import java.util.List;

public class UVA11233 {
    static class IregularWord{
        String singular;
        String plural;

        public IregularWord(String singular, String plural) {
            this.singular = singular;
            this.plural = plural;
        }

        public String getSingular() {
            return singular;
        }

        public void setSingular(String singular) {
            this.singular = singular;
        }

        public String getPlural() {
            return plural;
        }

        public void setPlural(String plural) {
            this.plural = plural;
        }
    }

    static boolean isIregular(String word,List<IregularWord> iregularWords){
        for(int i=0;i<iregularWords.size();i++){
            if(iregularWords.get(i).singular.equals(word)){
                return true;
            }
        }

        return false;

    }

    static String getPluralfromList(String word,List<IregularWord> iregularWords){
        for(int i=0;i<iregularWords.size();i++){
            if(iregularWords.get(i).getSingular().equals(word)){
                return iregularWords.get(i).getPlural();
            }
        }
        return null;
    }

    public void solve(int testNumber, InputReader sc, OutputWriter out) {
        String[] in = sc.readLine().split(" ");

        int l = Integer.parseInt(in[0]);
        int n = Integer.parseInt(in[1]);
        // sc.nextLine();

        List<IregularWord> list = new ArrayList<>();

        for(int i=0;i<l;i++){
            String[] s = sc.readLine().split(" ");

            list.add(new IregularWord(s[0],s[1]));
        }

        for(int i=0;i<n;i++){
            String w = sc.next();
            // System.out.println(getlastTwoWord(w));
            if(isIregular(w,list)){
                out.println(getPluralfromList(w,list));
            }

            else if(getLastWord(w)=='y' && w.charAt(w.length()-2)!='a'&& w.charAt(w.length()-2)!='e'&& w.charAt(w.length()-2)!='i'&& w.charAt(w.length()-2)!='o'&& w.charAt(w.length()-2)!='u'){
                for(int j=0;j<w.length()-1;j++){
                   out.print(w.charAt(j));
                }
             out.println("ies");

            }

            else if(getLastWord(w)=='o'||getLastWord(w)=='s'||getLastWord(w)=='x'){
                out.println(w+"es");
            }

            else if(getlastTwoWord(w).equals("ch")|| getlastTwoWord(w).equals("sh")){

               out.println(w+"es");
            }
            else{
              out.println(w+"s");
            }

        }


    }

    static  public String getlastTwoWord(String w) {
        String in =Character.toString(w.charAt(w.length()-2))+Character.toString(w.charAt(w.length()-1));

        return in;

    }

    static public char getLastWord(String w) {
        return w.charAt(w.length()-1);
    }


}
