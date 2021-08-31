import java.util.*;
import java.io.*;

class a
{
    static FastScanner sc = new FastScanner();    
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void solve() throws IOException {
        
    }
    
    public int longestWord(List<String> d) {
        Collections.sort(d);
        // set<string> good;
        // int ans = 0;

        // for(auto s : d) {
        //     if(s.size() == 1) {
        //         good.insert(s);
        //         ans = max(ans, 1);
        //         continue;
        //     }
        //     for(int i = 0; i < s.size(); i++) {
        //         char ch = s[i];
        //         s.erase(s.begin() + i);
        //         bool ok = good.count(s);
        //         s.insert(s.begin() + i, ch);
        //         if(ok) {
        //             good.insert(s);
        //             ans = max(ans, (int)s.size());
        //             break;
        //         }
        //     }
        // }

        return 0;
    }

    public static void main(String [] args) throws IOException {
        // System.setIn(new FileInputStream(new File("in")));
        // System.setOut(new PrintStream(new File("out")));
        int t = 1;
        // t = sc.nextInt();
        while(t-- > 0) {
            solve();
        }
        out.flush();
    }
    
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
 
} 