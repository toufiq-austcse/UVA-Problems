package UVA;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/

import java.io.*;
import java.math.*;
import java.util.*;
public class UVA10946 {
    static int ROW;
    static int COLUMN;
    static int total;
    public static void main(String[] args) {
        InputReader sc = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        int count = 1;
        while (true){
            ROW = sc.nextInt();
            COLUMN = sc.nextInt();
            if(ROW==0 && COLUMN==0){
                break;
            }

            Set<Character> set = new HashSet<>();
            String[] graph = new String [ROW];
            for(int i=0;i<ROW;i++){
                graph[i] = sc.nextString();

                for(int k=0;k<graph[i].length();k++){
                    set.add(graph[i].charAt(k));
                }
            }
            List<CharacterSpace> list = new ArrayList<>();

            Iterator<Character> it = set.iterator();
         /*   while (it.hasNext()){
                char temp = it.next();*/

                boolean[][] isVisited = new boolean[ROW][COLUMN];

                for(int i=0;i<ROW;i++){
                    for(int j=0;j<graph[i].length();j++){
                        if(!isVisited[i][j] && graph[i].charAt(j)!='.'){

                            DFS(graph,isVisited,i,j,graph[i].charAt(j));
                           // System.out.println("DFS Calling for "+graph[i].charAt(j));

                        }

                       if(graph[i].charAt(j)!='.' && total>0){
                           list.add(new CharacterSpace(graph[i].charAt(j),total));
                           total =0;
                       }

                    }

                    //System.out.println(temp+" "+total);
                    /*if(total!=0 && temp!='.'){
                        list.add(new CharacterSpace(temp,total));
                    }
                    total =0;*/
               //}
            }

            Collections.sort(list);
            out.println("Problem "+count+":");
            for(CharacterSpace ob : list){
                out.println(ob.name+" "+ob.space);
            }
            count++;
        }
        out.close();

    }
    static class CharacterSpace implements Comparable<CharacterSpace>{
        char name;
        int space;

        public CharacterSpace(char name, int space) {
            this.name = name;
            this.space = space;
        }

        @Override
        public int compareTo(CharacterSpace o) {
           int result = Integer.compare(o.space,this.space);
           if(result!=0){
               return result;
           }
           else{
               result = Character.compare(this.name,o.name);
           }
           return result;
        }
    }

    static boolean isSafe(int row,int column,String[] maze,boolean[][] isVisited,char check ){
        return (row>=0) && (column>=0) && (row<ROW) && (column<maze[row].length()) && (!isVisited[row][column]&& maze[row].charAt(column)==check);
    }

    static void DFS(String[] maze,boolean[][] isVisited,int row,int column,char check){
      /*  int[] dx =	{-1,-1,-1,0,0,1,1,1};
        int[] dy=	{-1,0,1,-1,1,-1,0,1};*/

        int dx[] ={0,0,1,-1};
        int dy[]=	{1,-1,0,0};

       isVisited[row][column] = true;
       if(maze[row].charAt(column)==check){
           total++;
       }



       for(int i=0;i<4;i++){
           if(isSafe(row+dx[i],column+dy[i],maze,isVisited,check)){
               DFS(maze,isVisited,row+dx[i],column+dy[i],check);
           }
       }
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
