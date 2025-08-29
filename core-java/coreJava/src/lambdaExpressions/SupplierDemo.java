package lambdaExpressions;

import java.util.function.Supplier;

public class SupplierDemo
{
	public static void main(String[] args) 
	{
		Supplier<String> otps = ()->{
			
			String otp= "";
			
			for (int i = 0; i < 4; i++) {
			otp+=(int)(Math.random()*10); // 0.0 to 0.9
			}		
			
			//otp+=(int)(Math.random()*10000);
			
			return otp;
			
		};
		
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());	
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());
	}

}
