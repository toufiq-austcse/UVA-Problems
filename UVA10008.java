package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.util.*;
import java.io.*;
public class UVA10008 {


          //Code for Faster Input
    	  public static class MyScanner {

    	      BufferedReader br;
    	      StringTokenizer st;

    	      public MyScanner() {
    	         br = new BufferedReader(new InputStreamReader(System.in));
    	      }

    	      String next() {
    	          while (st == null || !st.hasMoreElements()) {
    	              try {
    	                  st = new StringTokenizer(br.readLine());
    	              } catch (IOException e) {
    	                  e.printStackTrace();
    	              }
    	          }
    	          return st.nextToken();
    	      }

    	      int nextInt() {
    	          return Integer.parseInt(next());
    	      }

    	      long nextLong() {
    	          return Long.parseLong(next());
    	      }

    	      double nextDouble() {
    	          return Double.parseDouble(next());
    	      }

    	      String nextLine(){
    	          String str = "";
    		  try {
    		     str = br.readLine();
    		  } catch (IOException e) {
    		     e.printStackTrace();
    		  }
    		  return str;
    	      }

    	   }
    	   //--------------------------------------------------------
           public static void main(String[] args) {
               MyScanner sc = new MyScanner();
               int nmbr = sc.nextInt();

               List<String> list[] = new ArrayList[nmbr];
               for(int count=0;count<nmbr;count++){
                   list[count] = new ArrayList<>();
               }

               for(int i=0;i<nmbr;i++){
                   String a = sc.nextLine().toUpperCase();
                  // System.out.println(a);
                   list[i].add(a);
               }
             Map<Character,Integer> map = new HashMap<>();

               for(int count=0;count<list.length;count++){
                  String out = list[count].toString();
                  for(int i=0;i<out.length();i++ ){
                      if(out.charAt(i)=='A'){
                          if(map.containsKey('A')){
                              int j = map.get('A');
                              j++;
                              map.put('A',j);
                          }
                          else {
                              map.put('A',1);
                          }
                      }

                      else if(out.charAt(i)=='B'){
                          if(map.containsKey('B')){
                              int j = map.get('B');
                              j++;
                              map.put('B',j);
                          }
                          else {
                              map.put('B',1);
                          }
                      }
                      else if(out.charAt(i)=='C'){
                          if(map.containsKey('C')){
                              int j = map.get('C');
                              j++;
                              map.put('C',j);
                          }
                          else {
                              map.put('C',1);
                          }
                      }

                      else if(out.charAt(i)=='D'){
                          if(map.containsKey('D')){
                              int j = map.get('D');
                              j++;
                              map.put('D',j);
                          }
                          else {
                              map.put('D',1);
                          }
                      }

                      else if(out.charAt(i)=='E'){
                          if(map.containsKey('E')){
                              int j = map.get('E');
                              j++;
                              map.put('E',j);
                          }
                          else {
                              map.put('E',1);
                          }
                      }

                      else if(out.charAt(i)=='F'){
                          if(map.containsKey('F')){
                              int j = map.get('F');
                              j++;
                              map.put('F',j);
                          }
                          else {
                              map.put('F',1);
                          }
                      }

                      else if(out.charAt(i)=='G'){
                          if(map.containsKey('G')){
                              int j = map.get('G');
                              j++;
                              map.put('G',j);
                          }
                          else {
                              map.put('G',1);
                          }
                      }

                      else if(out.charAt(i)=='H'){
                          if(map.containsKey('H')){
                              int j = map.get('H');
                              j++;
                              map.put('H',j);
                          }
                          else {
                              map.put('H',1);
                          }
                      }

                      else if(out.charAt(i)=='I'){
                          if(map.containsKey('I')){
                              int j = map.get('I');
                              j++;
                              map.put('I',j);
                          }
                          else {
                              map.put('I',1);
                          }
                      }

                      else if(out.charAt(i)=='J'){
                          if(map.containsKey('J')){
                              int j = map.get('J');
                              j++;
                              map.put('J',j);
                          }
                          else {
                              map.put('J',1);
                          }
                      }

                      else if(out.charAt(i)=='K'){
                          if(map.containsKey('K')){
                              int j = map.get('K');
                              j++;
                              map.put('K',j);
                          }
                          else {
                              map.put('K',1);
                          }
                      }

                      else if(out.charAt(i)=='L'){
                          if(map.containsKey('L')){
                              int j = map.get('L');
                              j++;
                              map.put('L',j);
                          }
                          else {
                              map.put('L',1);
                          }
                      }

                      else if(out.charAt(i)=='M'){
                          if(map.containsKey('M')){
                              int j = map.get('M');
                              j++;
                              map.put('M',j);
                          }
                          else {
                              map.put('M',1);
                          }
                      }

                      else if(out.charAt(i)=='N'){
                          if(map.containsKey('N')){
                              int j = map.get('N');
                              j++;
                              map.put('N',j);
                          }
                          else {
                              map.put('N',1);
                          }
                      }

                      else if(out.charAt(i)=='O'){
                          if(map.containsKey('O')){
                              int j = map.get('O');
                              j++;
                              map.put('O',j);
                          }
                          else {
                              map.put('O',1);
                          }
                      }
                      else if(out.charAt(i)=='P'){
                          if(map.containsKey('P')){
                              int j = map.get('P');
                              j++;
                              map.put('P',j);
                          }
                          else {
                              map.put('P',1);
                          }
                      }


                      else if(out.charAt(i)=='Q'){
                          if(map.containsKey('Q')){
                              int j = map.get('Q');
                              j++;
                              map.put('Q',j);
                          }
                          else {
                              map.put('Q',1);
                          }
                      }
                      else if(out.charAt(i)=='R'){
                          if(map.containsKey('R')){
                              int j = map.get('R');
                              j++;
                              map.put('R',j);
                          }
                          else {
                              map.put('R',1);
                          }
                      }

                      else if(out.charAt(i)=='S'){
                          if(map.containsKey('S')){
                              int j = map.get('S');
                              j++;
                              map.put('S',j);
                          }
                          else {
                              map.put('S',1);
                          }
                      }

                      else if(out.charAt(i)=='T'){
                          if(map.containsKey('T')){
                              int j = map.get('T');
                              j++;
                              map.put('T',j);
                          }
                          else {
                              map.put('T',1);
                          }
                      }

                      else if(out.charAt(i)=='U'){
                          if(map.containsKey('U')){
                              int j = map.get('U');
                              j++;
                              map.put('U',j);
                          }
                          else {
                              map.put('U',1);
                          }
                      }

                      else if(out.charAt(i)=='V'){
                          if(map.containsKey('V')){
                              int j = map.get('V');
                              j++;
                              map.put('V',j);
                          }
                          else {
                              map.put('V',1);
                          }
                      }

                      else if(out.charAt(i)=='W'){
                          if(map.containsKey('W')){
                              int j = map.get('W');
                              j++;
                              map.put('W',j);
                          }
                          else {
                              map.put('W',1);
                          }
                      }

                      else if(out.charAt(i)=='X'){
                          if(map.containsKey('X')){
                              int j = map.get('X');
                              j++;
                              map.put('X',j);
                          }
                          else {
                              map.put('X',1);
                          }
                      }

                      else if(out.charAt(i)=='Y'){
                          if(map.containsKey('Y')){
                              int j = map.get('Y');
                              j++;
                              map.put('Y',j);
                          }
                          else {
                              map.put('Y',1);
                          }
                      }

                      else if(out.charAt(i)=='Z'){
                          if(map.containsKey('Z')){
                              int j = map.get('Z');
                              j++;
                              map.put('Z',j);
                          }
                          else {
                              map.put('Z',1);
                          }
                      }

                  }

               }

               Set<Character> charactersSet =map.keySet();
            //   System.out.println(charactersSet);
               TreeSet<Integer> number = new TreeSet<Integer>(map.values());

               Iterator<Integer> it = number.descendingIterator();
               String output ="";
               while (it.hasNext()){
                  int val = it.next();

                  for(Character c: charactersSet){
                      if(map.get(c)==val){
                          output+=c+" "+val+"\n";
                      }
                  }
               }

               System.out.print(output);



           }
}
