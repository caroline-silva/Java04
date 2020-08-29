public class Decisao {
	
	public static void main(String[] args) {
		String s ="*";
		int i;
		/*for(i=1; i <= 10 ; i++) {
		System.out.println("i = "+i+" "+ s);
		s += "*";
		}*/
		
		s = "-";
		i = 1;
		/*while (i <= 10) {
			System.out.println("i = "+i+" "+ s);
			s += "-";
			i++;
		}*/
		
		do {
			System.out.println("i = "+i+" "+ s);
			s += "^";
			i++;
			} while (i <= 10);
		
	}
}