package day1.classroom;

public class Mobile {
	
	public int makecall (int number) {
		System.out.println("Calling" );
	return number;
	}
	public boolean sendsms( String SMS)
	{
		System.out.println("SMS Sent");
		return true;
	}
	public void shutdown() {
		System.out.println("System Shutdown");
	}
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		int no = mobile.makecall(99);
		System.out.println(no);
		boolean status = mobile.sendsms("Hi");
		System.out.println(status);
		mobile.shutdown();
				
	}

}
