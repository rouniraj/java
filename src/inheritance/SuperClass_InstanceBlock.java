package inheritance;

class G{
	{
		System.out.println("PARENT class ins block");
	}
	G(){
		System.out.println("PARENT class 0-argconsttructor");
	}
}
public class SuperClass_InstanceBlock extends G {
	{
		System.out.println("CHILD class ins block");
	}
	SuperClass_InstanceBlock(){
		//super()-->generated by compiler
		System.out.println("CHILD class 0-argconsttructor");
	}
	public static void main(String[] args) {
		new SuperClass_InstanceBlock();
	}
}

//first parents ins block and constructor, then child ins block and constructor

// ins block executes at the time of object creation,if we create 5 times object then ins block will
// execute 5 times.
