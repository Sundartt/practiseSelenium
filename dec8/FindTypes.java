package dec8;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="$$ welcome to 2nd class of Automation $$";
		/*
		 * char[] a = str.toCharArray(); for(int i=0;i<a.length;i++) {
		 * if(Character.isLetter(a[i])) { letter++; } else
		 * if(Character.isSpaceChar(a[i])) { i++; } else { i++; }
		 * 
		 * 
		 * }
		 */
		
		String test="$$ Hap5p7y Le#arning* " ;
		
		char[] ch =test.toCharArray();
		
		int letters=0;
		int numbers=0;
		int space=0;
		int splchar=0;
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letters++;
			}
			else if(Character.isDigit(ch[i]))
			{
				numbers++;
				
			}else if (Character.isSpace(ch[i]))
			{
				space++;
			}else 
			{
				splchar++;
			
			}
		}
		System.out.println("The letters count " +letters);
		System.out.println("The Numbers count " +numbers);
		System.out.println("The space count " +space);
		System.out.println("The splchar count" +splchar);
		
		
		
		
		
		
		
		
	}

}