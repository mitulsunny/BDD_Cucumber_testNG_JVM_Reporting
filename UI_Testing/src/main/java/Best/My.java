package Best;

public class My {

	public static void main(String[] args) {
		int answer=strToInt("a");
		System.out.println(answer);
	}
	static int strToInt(String str) {
	
		int answer=0;
		for(int i=0; i<str.length(); i++) {
		 char x= str.charAt(i);
		 int value=x-'0';
		 answer = (answer*10)+value;
		}
		
		return answer;
		
	}
}
