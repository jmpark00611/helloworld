class HelloWorld{
	public static void main(String[] args){
		double root1 = 0;  //known
		double root2 = 0;  //known
	
		String a = "2";
		String b = "6";
		String c = "4";
	
		int ai = Integer.parseInt(a);
		int bi = Integer.parseInt(b);
		int ci = Integer.parseInt(c);
	
		root1 = bi+Math.sqrt(bi*bi-4*ai*ci)/(2*ai);
		root2 = bi-Math.sqrt(bi*bi-4*ai*ci)/(2*ai);
	
			System.out.println("First root is "+root1);
			System.out.println("Second root is "+root2);
		}
}