package multiThreading;

public class Students1 extends Thread{
	
	String name;
	int studyDuration;
	
	Students1(){
		
	}
	
	Students1(String name, int workduration){
		
		this.name = name;
		this.studyDuration = workduration;
		
	}
	
	public void run() {
		study();
	}
	
	public void study() {
		System.out.println(name+ " has started studying================");
		//System.out.println(10/0);//This is to see weather the programe is terminating and exception is coming or not
		
		for(int i=1;i<=studyDuration;i++) {
			System.out.println(name+" has completed" +i+" hours of study");
			try {
			 if(name.equalsIgnoreCase("Mohan"))
				Thread.sleep(800);
			} catch (InterruptedException e) {
				System.out.println("Mai Jag Gaya Hoon! Humkum Kiya jaye");
			}
		}
		System.out.println("================"+name+"has completed the study================");
	}

}
