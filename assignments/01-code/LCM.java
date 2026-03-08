
public class LCM {
	public static void main(String[] args) {
		System.out.println(getLCM(6, 40));
		
	}
	static int getLCM(int a,int b){
		int min = a>b ? b:a;
		int max = a>b ? a:b;
		int num=1;
		while(num <= min * max) {
			if(num%min ==0 && num%max==0) {
				break;
			}else {
				num++;
			}
		}
		
	return num;
		
	}
}
