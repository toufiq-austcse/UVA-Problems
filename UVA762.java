package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
import java.math.*;
public  class UVA762 {


        LinkedList<Integer> list[];
        int verticesNumber;
        int[] parent;

            int[] level ;


        public UVA762(int n){
            verticesNumber = n;
            list = new LinkedList[verticesNumber];
            for(int i=0;i<list.length;i++){
                list[i] = new LinkedList<>();
            }
            level = new int[n+1];
            parent = new int[n];


        }

        public void addEdge(int u,int v){
            list[u].add(v);
            list[v].add(u);
        }

        public boolean startBfs(int s,int dest){
            List<Integer> path = new ArrayList<>();

            boolean[] isVisited = new boolean[verticesNumber];
            Queue<Integer> queue = new LinkedList<>();

            boolean isReachable = false;

            queue.add(s);
            isVisited[s] = true;

            while (!queue.isEmpty()){
                int a = queue.poll();

              if(a==dest){
                  isReachable = true;
                  break;

              }
                Iterator<Integer> it = list[a].listIterator();
                while (it.hasNext()){
                    int b = it.next();

                    if(!isVisited[b]){
                        level[b] = level[a]+1;
                        isVisited[b] = true;
                        queue.add(b);
                        parent[b] = a;
                    }
                }
            }
            return isReachable;

        }





    public static void main(String[] args) throws FileNotFoundException {

       /* File file = new File("E:\\Programming\\Practice\\src\\UVA\\input.txt");
        Scanner sc = new Scanner(new FileInputStream(file));*/
      Scanner sc = new Scanner(System.in);
      OutputWriter out = new OutputWriter(System.out);


      int count = 0;

      while (sc.hasNext()) {

          String test = sc.nextLine();

          if (test.length()!=0) {
              int n = Integer.parseInt(test);
              List<String> list = new ArrayList<>();


              HashMap<String, Integer> map = new HashMap<>();
              int nodeNumber = 0;
              for (int i = 0; i < n; i++) {
                  String s = sc.nextLine();
                  list.add(s);


                  String[] part = s.split(" ");

                  if (!map.containsKey(part[0])) {
                      map.put(part[0], nodeNumber++);
                  }

                  if (!map.containsKey(part[1])) {
                      map.put(part[1], nodeNumber++);
                  }


              }
              if (count > 0) {
                  out.println();
              }

              Set set = map.keySet();

              UVA762 bfs = new UVA762(set.size());

              for (String connection : list) {
                  String[] part = connection.split(" ");

                  bfs.addEdge(map.get(part[0]), map.get(part[1]));
              }

              String[] startEnd = sc.nextLine().split(" ");


              if (map.containsKey(startEnd[0]) && map.containsKey(startEnd[1])) {
                  int start = map.get(startEnd[0]);
                  int end = map.get(startEnd[1]);

                  boolean isReachable = bfs.startBfs(start, end);
                  if (isReachable) {

                      LinkedList<Integer> shortestPath = new LinkedList<>();


                      int temp = end;
                      while (temp != start) {
                          shortestPath.addFirst(temp);
                          temp = bfs.parent[temp];
                      }
                      shortestPath.addFirst(start);

                      for (int i = 0; i < shortestPath.size() - 1; i++) {
                          out.println(getPlaceName(set, shortestPath.get(i), map) + " " + getPlaceName(set, shortestPath.get(i + 1), map));
                      }


                  } else {
                      out.println("No route");
                  }


              }
              else{
                  out.println("No route");
              }
          }


          count++;
      }
      out.close();


    }

    static String getPlaceName(Set set,int value,HashMap<String,Integer> map){
            Iterator<String> it = set.iterator();

            String out = null;

            while (it.hasNext()){
                String s = it.next();

                if(map.get(s)==value){
                   out = s;
                   break;
                }
            }

            return out;
    }

     public static class InputReader {
             private boolean finished = false;

             private InputStream stream;
             private byte[] buf = new byte[1024];
             private int curChar;
             private int numChars;
             private SpaceCharFilter filter;

             public InputReader(InputStream stream) {
                 this.stream = stream;
             }

             public int read() {
                 if (numChars == -1) {
                     throw new InputMismatchException();
                 }
                 if (curChar >= numChars) {
                     curChar = 0;
                     try {
                         numChars = stream.read(buf);
                     } catch (IOException e) {
                         throw new InputMismatchException();
                     }
                     if (numChars <= 0) {
                         return -1;
                     }
                 }
                 return buf[curChar++];
             }

             public int peek() {
                 if (numChars == -1) {
                     return -1;
                 }
                 if (curChar >= numChars) {
                     curChar = 0;
                     try {
                         numChars = stream.read(buf);
                     } catch (IOException e) {
                         return -1;
                     }
                     if (numChars <= 0) {
                         return -1;
                     }
                 }
                 return buf[curChar];
             }

             public int nextInt() {
                 int c = read();
                 while (isSpaceChar(c)) {
                     c = read();
                 }
                 int sgn = 1;
                 if (c == '-') {
                     sgn = -1;
                     c = read();
                 }
                 int res = 0;
                 do {
                     if (c < '0' || c > '9') {
                         throw new InputMismatchException();
                     }
                     res *= 10;
                     res += c - '0';
                     c = read();
                 } while (!isSpaceChar(c));
                 return res * sgn;
             }

             public long nextLong() {
                 int c = read();
                 while (isSpaceChar(c)) {
                     c = read();
                 }
                 int sgn = 1;
                 if (c == '-') {
                     sgn = -1;
                     c = read();
                 }
                 long res = 0;
                 do {
                     if (c < '0' || c > '9') {
                         throw new InputMismatchException();
                     }
                     res *= 10;
                     res += c - '0';
                     c = read();
                 } while (!isSpaceChar(c));
                 return res * sgn;
             }

             public String nextString() {
                 int c = read();
                 while (isSpaceChar(c)) {
                     c = read();
                 }
                 StringBuilder res = new StringBuilder();
                 do {
                     if (Character.isValidCodePoint(c)) {
                         res.appendCodePoint(c);
                     }
                     c = read();
                 } while (!isSpaceChar(c));
                 return res.toString();
             }

             public boolean isSpaceChar(int c) {
                 if (filter != null) {
                     return filter.isSpaceChar(c);
                 }
                 return isWhitespace(c);
             }

             public static boolean isWhitespace(int c) {
                 return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
             }

             private String readLine0() {
                 StringBuilder buf = new StringBuilder();
                 int c = read();
                 while (c != '\n' && c != -1) {
                     if (c != '\r') {
                         buf.appendCodePoint(c);
                     }
                     c = read();
                 }
                 return buf.toString();
             }

             public String readLine() {
                 String s = readLine0();
                 while (s.trim().length() == 0) {
                     s = readLine0();
                 }
                 return s;
             }

             public String readLine(boolean ignoreEmptyLines) {
                 if (ignoreEmptyLines) {
                     return readLine();
                 } else {
                     return readLine0();
                 }
             }

             public BigInteger readBigInteger() {
                 try {
                     return new BigInteger(nextString());
                 } catch (NumberFormatException e) {
                     throw new InputMismatchException();
                 }
             }

             public char nextCharacter() {
                 int c = read();
                 while (isSpaceChar(c)) {
                     c = read();
                 }
                 return (char) c;
             }

             public double nextDouble() {
                 int c = read();
                 while (isSpaceChar(c)) {
                     c = read();
                 }
                 int sgn = 1;
                 if (c == '-') {
                     sgn = -1;
                     c = read();
                 }
                 double res = 0;
                 while (!isSpaceChar(c) && c != '.') {
                     if (c == 'e' || c == 'E') {
                         return res * Math.pow(10, nextInt());
                     }
                     if (c < '0' || c > '9') {
                         throw new InputMismatchException();
                     }
                     res *= 10;
                     res += c - '0';
                     c = read();
                 }
                 if (c == '.') {
                     c = read();
                     double m = 1;
                     while (!isSpaceChar(c)) {
                         if (c == 'e' || c == 'E') {
                             return res * Math.pow(10, nextInt());
                         }
                         if (c < '0' || c > '9') {
                             throw new InputMismatchException();
                         }
                         m /= 10;
                         res += (c - '0') * m;
                         c = read();
                     }
                 }
                 return res * sgn;
             }

             public boolean isExhausted() {
                 int value;
                 while (isSpaceChar(value = peek()) && value != -1) {
                     read();
                 }
                 return value == -1;
             }

             public String next() {
                 return nextString();
             }

             public SpaceCharFilter getFilter() {
                 return filter;
             }

             public void setFilter(SpaceCharFilter filter) {
                 this.filter = filter;
             }

             public interface SpaceCharFilter {
                 public boolean isSpaceChar(int ch);
             }
             public int[] nextIntArray(int n){
                 int[] array=new int[n];
                 for(int i=0;i<n;++i)array[i]=nextInt();
                 return array;
             }
             public int[] nextSortedIntArray(int n){
                 int array[]=nextIntArray(n);
                 Arrays.sort(array);
                 return array;
             }
             public int[] nextSumIntArray(int n){
                 int[] array=new int[n];
                 array[0]=nextInt();
                 for(int i=1;i<n;++i)array[i]=array[i-1]+nextInt();
                 return array;
             }
             public long[] nextLongArray(int n){
                 long[] array=new long[n];
                 for(int i=0;i<n;++i)array[i]=nextLong();
                 return array;
             }
             public long[] nextSumLongArray(int n){
                 long[] array=new long[n];
                 array[0]=nextInt();
                 for(int i=1;i<n;++i)array[i]=array[i-1]+nextInt();
                 return array;
             }
             public long[] nextSortedLongArray(int n){
                 long array[]=nextLongArray(n);
                 Arrays.sort(array);
                 return array;
             }
         }
      public static class OutputWriter {
              private final PrintWriter writer;

              public OutputWriter(OutputStream outputStream) {
                  writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
              }

              public OutputWriter(Writer writer) {
                  this.writer = new PrintWriter(writer);
              }

              public void print(char[] array) {
                  writer.print(array);
              }

              public void print(Object... objects) {
                  for (int i = 0; i < objects.length; i++) {
                      if (i != 0) {
                          writer.print(' ');
                      }
                      writer.print(objects[i]);
                  }
              }

              public void print(int[] array) {
                  for (int i = 0; i < array.length; i++) {
                      if (i != 0) {
                          writer.print(' ');
                      }
                      writer.print(array[i]);
                  }
              }

              public void print(double[] array) {
                  for (int i = 0; i < array.length; i++) {
                      if (i != 0) {
                          writer.print(' ');
                      }
                      writer.print(array[i]);
                  }
              }

              public void print(long[] array) {
                  for (int i = 0; i < array.length; i++) {
                      if (i != 0) {
                          writer.print(' ');
                      }
                      writer.print(array[i]);
                  }
              }

              public void println(int[] array) {
                  print(array);
                  writer.println();
              }

              public void println(double[] array) {
                  print(array);
                  writer.println();
              }

              public void println(long[] array) {
                  print(array);
                  writer.println();
              }

              public void println() {
                  writer.println();
              }

              public void println(Object... objects) {
                  print(objects);
                  writer.println();
              }

              public void print(char i) {
                  writer.print(i);
              }

              public void println(char i) {
                  writer.println(i);
              }

              public void println(char[] array) {
                  writer.println(array);
              }

              public void printf(String format, Object... objects) {
                  writer.printf(format, objects);
              }

              public void close() {
                  writer.close();
              }

              public void flush() {
                  writer.flush();
              }

              public void print(long i) {
                  writer.print(i);
              }

              public void println(long i) {
                  writer.println(i);
              }

              public void print(int i) {
                  writer.print(i);
              }

              public void println(int i) {
                  writer.println(i);
              }

              public void separateLines(int[] array) {
                  for (int i : array) {
                      println(i);
                  }
              }
          }





}
