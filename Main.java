public class Main{
	public static void main(String[] args ){
		System.out.println("Hello World");
		
		Main main = new Main();
		Main main2 = main.getMain();
		main.test();
		main2.test2();
	}
	
	public Main getMain(){
		return new Main();
	}
	
	public String test(){
		return "test";
	}
}