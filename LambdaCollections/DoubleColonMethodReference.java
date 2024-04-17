class Main {

	public static void main(String[] args) {
		MyInterface m=()->System.out.println("This is a lmabda function");
		m.method1();
		}
		public static void method2(){
		    System.out.println("Static Method");
		}
		public void method3(){
		    System.out.println("Instance Method");
		}
}
interface MyInterface{
	public void method1();
}
class NewClass{
    public static void main(String args[]){
        MyInterface n=Main::method2;
        n.method1();
        Main m1=new Main();
        MyInterface n1=m1::method3;
        n1.method1();
    }
}

