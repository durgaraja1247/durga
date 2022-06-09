package assignment;
abstract class key
{
	abstract void key();
}
 class KeywordLong {
	protected void key()
	{
		int a=1111111111;
		long num1=1111111111111111111L;  
		long num2=-10L;  
		System.out.println("num1: "+num1);  
		System.out.println("num2: "+num2);  

	}

	public static void main(String[] args) {
		KeywordLong keywordLong = new KeywordLong();
		keywordLong.key();
		

	}

}
