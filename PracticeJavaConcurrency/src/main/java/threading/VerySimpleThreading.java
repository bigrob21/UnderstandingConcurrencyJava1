package threading;

import static java.lang.System.out;

import java.util.function.Supplier;

public class VerySimpleThreading {

	static Supplier<String> threadPrinter = () -> {return "Message from thread: " + Thread.currentThread().getName();};
	
	public static void main(String[] args) {
		out.println("In main thread starting, printing from thread - " + Thread.currentThread().getName()+ "\n==========================");
		
		Thread t1 = new Thread(() -> {out.println(threadPrinter.get());});
		Thread t2 = new Thread(() -> {out.println(threadPrinter.get());});
		Thread t3 = new Thread(() -> {out.println(threadPrinter.get());});
		
		t1.start();
		t3.start();
		t2.start();
		
	}
	
}