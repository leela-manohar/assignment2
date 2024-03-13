package assignment2;

public class OddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		String text="type here to search";
		for(i=0;i<text.length()-1;i++) {
			if(i%2!=0 && text.charAt(i)!=' ') {
				System.out.println(text.charAt(i));
			}
		}

	}

}
