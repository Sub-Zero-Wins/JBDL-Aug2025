package enums;

public enum OrderStatus 
{
	PROCESSING(10),OUT_FOR_DELIVERY(20),DELIVERED(30),SHIPPED(40);
	
	int i;
	OrderStatus(int i) {
		this.i=i;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	


	//	public static final OrderStatus DELIVERED = new OrderStatus();
	//	public static final OrderStatus SHIPPED = new OrderStatus();
	//	public static final OrderStatus PROCESSING = new OrderStatus();

}
