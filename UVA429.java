package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class UVA429 {

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



    static class Word {
        String name;
        int index;

        public Word(String name, int index) {
            this.name = name;
            this.index = index;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }

    // ----------------------------------------
   static int v ;
   static LinkedList adj[];
    UVA429(int n){
        v =n;
        adj = new LinkedList[v];
        for(int i=0;i<n;i++){
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int u,int v){
        adj[u].add(v);
    }
     static int bfs(int start,int end){
      //  boolean isVisited[] = new boolean[v];
         int[] distance = new int[v];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
       // isVisited[start] = true;
         distance[start] =1;
        while (queue.size()!=0){
            int a = queue.poll();
           // System.out.println(a+" ");
            if(a==end){
                return distance[a]-1;
            }
            Iterator<Integer> it = adj[a].listIterator();
            while(it.hasNext()){
                int b = it.next();
                if(distance[b]==0){
                    queue.add(b);
                   distance[b] = distance[a]+1;
                }
            }
        }
        return distance[end]-1;
     }

     static boolean differenceByOneCharacter(String a ,String b){
         if(a.length()!=b.length()){
             return false;
         }
         int count =0;
         for(int i=0;i<a.length();i++){
             if(a.charAt(i)!=b.charAt(i)){
                 count++;
             }
         }
         if(count==1){
             return true;
         }
         else {
             return false;
         }
     }
    public static void main(String[] args) throws IOException {
   //   BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        MyScanner sc = new MyScanner();

      PrintWriter pw = new PrintWriter(System.out,true);
        int n = Integer.parseInt(sc.nextLine());
      sc.nextLine();
        for(int i=0;i<n;i++){
            List<Word> list = new ArrayList<>();
            int count =0;
            while (true){
                String s = sc.nextLine();
                if(s.equals("*")) {
                    break;
                }
                    Word word = new Word(s,count);
                list.add(word);
                count++;
                }

                UVA429 ob = new UVA429(count);

           for(int j=0;j<list.size();j++){
                for(int k=0;k<list.size();k++){
                    if(j==k){
                        continue;
                    }
                    if(differenceByOneCharacter(list.get(j).getName(),list.get(k).getName())){
                        ob.addEdge(list.get(j).getIndex(),list.get(k).getIndex());
                       // System.out.println(list.get(j).getName()+" "+list.get(k).getName());
                    }
                }
           }

           HashMap<String ,Integer> map = new HashMap<>();
            for(int j=0;j<list.size();j++){
                map.put(list.get(j).getName(),list.get(j).getIndex());
            }

            String in ="";
           while ((in = sc.nextLine())!=null && in.length()>2){


                String[] part = in.split(" ");

               System.out.println(part[0]+" "+part[1]+" "+bfs(map.get(part[0]),map.get(part[1])));


            }
          //  System.out.println(map.get("pop"));
            if(i!=n-1){
                System.out.println();
            }
            }

            /*pw.flush();
            pw.close();*/

        }

   }

