package org.hbnugeek.thread;

public class SampleThread {
	public static void main(String args[]) {
		 System.out.println("我是主线程!");
		 Thread t1 = new Thread(new Runnable(){  
			    public void run(){  
			        System.out.println("进入线程 Mythread 线程t1");  
			        int ncount = 0;
			        while (ncount < 100) {  
	                    try {
	           
	                        System.out.println("线程t1输出 " + ncount);  
	                        System.out.println("t1休眠两秒"); 
	                        //休眠两秒  
	                        Thread.sleep(2 * 1000);  
	                        ncount++;
	                    } catch (InterruptedException e) {  
	                        e.printStackTrace();  
	                    }  
	                } 
			          
			    }  
			});  
	t1.start();
	Thread t2 = new Thread(new Runnable(){  
	    public void run(){  
	        System.out.println("进入线程 Mythread 线程t2");  
	        int ncount = 0;
	        while (ncount < 100) {  
                try {
       
                    System.out.println("线程t2输出 " + ncount);  
                    System.out.println("t2休眠两秒"); 
                    //休眠两秒  
                    Thread.sleep(2 * 1000);  
                    ncount++;
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
            } 
	          
	    }  
	});  
t2.start();
	
	int ncount = 0;
    while (ncount < 100) {  
       
            System.out.println("主线程输出 " + ncount);  
            ncount++;
             
    }
	
	}

}
