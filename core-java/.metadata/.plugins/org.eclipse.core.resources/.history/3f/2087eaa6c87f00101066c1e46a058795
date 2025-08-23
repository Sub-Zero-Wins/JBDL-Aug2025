package multithreading;

import java.util.Iterator;

class VideoStreaming implements Runnable//extends Thread
{
	@Override
	public void run()
	{
		System.out.println("video streaming start");
		System.out.println(Thread.currentThread());
		for (int i = 0; i < 5; i++) 
		{
		System.out.println("video playing...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}	
		}
		System.out.println("video streaming end");
	}
	
}
class CommentReading  implements Runnable//extends Thread
{
	@Override
	public void run()
	{
		System.out.println("comment reading start");
		System.out.println(Thread.currentThread());
		for (int i = 97; i <= 101; i++) 
		{
		System.out.println("comments ..."+(char)i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
		System.out.println("comment reading end");
	}
	
}
class VideoDownloading implements Runnable//extends Thread
{
	@Override
	public void run()
	{
		System.out.println("video download start");
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 100; i=i+10) 
		{
		System.out.println("downloading ..."+i+"%");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
		System.out.println("video download complete");
	}
}



public class YoutubeDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println(Thread.currentThread());
		VideoStreaming vs = new VideoStreaming();
		CommentReading cr = new CommentReading();
		VideoDownloading vd = new VideoDownloading();
		
		Thread t1= new Thread(vs);
		Thread t2= new Thread(cr);
		Thread t3= new Thread(vd);
		
		t1.setName("video");
		t2.setName("comment");
		t3.setName("download");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
		
		
	}

}
