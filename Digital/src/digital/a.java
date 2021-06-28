package digital;

import java.io.*;
import java.util.*;

public class a {

	public static void main(String args[]) {
		InputReader in = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);

		char s[] = in.readString().toCharArray();
		
		int c[] = new int[26];
		
		for(int i=0;i<s.length;i++){
			if(s[i] >= 'a' && s[i] <= 'z')
				c[s[i]-'a']++;
		}
		
		boolean yes = false;
		
		int ans = 0;
		for(int j=0;j<26;j++){
			if(c[j] != 0){
				if(ans == 0)
					ans = c[j];
				else if(ans != c[j]){
					ans = -1;
					break;
				}
			}
		}
		
		if(ans != -1)
			yes = true;
		
		for(int i=0;i<s.length;i++){
			c[s[i]-'a']--;
			int ans1 = 0;
		
			for(int j=0;j<26;j++){
				if(c[j] != 0){
					if(ans1 == 0)
						ans1 = c[j];
					else{
						if(c[j] != ans1){
							ans1 = -1;
							break;
						}
					}
				}
			}
			
			c[s[i]-'a']++;
			System.out.println("ans1--->>>"+ans1);
			if(ans1 != -1)
				yes = true;
		}
		
		System.out.println(yes);
		
		w.println(yes ? "YES" : "NO");
		w.close();
	}

	static class InputReader {

		private InputStream stream;
		private byte[] buf = new byte[8192];
		private int curChar;
		private int snumChars;
		private SpaceCharFilter filter;

		public InputReader(InputStream stream) {
			this.stream = stream;
		}

		public int snext() {
			if (snumChars == -1)
				throw new InputMismatchException();
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (snumChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public int nextInt() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = snext();
			}

			int res = 0;

			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = snext();
			} while (!isSpaceChar(c));

			return res * sgn;
		}
		
		public String readString() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = snext();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public boolean isSpaceChar(int c) {
			if (filter != null)
				return filter.isSpaceChar(c);
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);
		}
	}
}
