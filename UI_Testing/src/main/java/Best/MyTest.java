package Best;

public class MyTest {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int k[]=getNewArray(a);
	for (int i : k) {
		System.out.println(i);
	}
}
public static int[] getNewArray(int a[]) {
	int b[]=new int[a.length];
	int count =0;
	for(int i=0; i<a.length; i++) {
		int total=1;
		for (int j=0; j<a.length; j++) {
			if(count!=j)
			total*=a[j];
		}
		count++;
		b[i]= total;
	}
	return b;
}
}
