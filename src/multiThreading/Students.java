package multiThreading;

public class Students extends Thread{
	
	String name;
	int studyDuration;
	
	Students(){
		
	}
	
	Students(String name, int workduration){
		
		this.name = name;
		this.studyDuration = workduration;
		
	}
	
	public void run() {
	
		try {
			study();
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void study() throws InterruptedException {
		System.out.println(name+ " has started studying================");
		for(int i=1;i<=studyDuration;i++) {
			System.out.println(name+" has completed" +i+" hours of study");
			Thread.sleep(2000);
		}
		System.out.println("================"+name+"has completed the study================");
	}

}
