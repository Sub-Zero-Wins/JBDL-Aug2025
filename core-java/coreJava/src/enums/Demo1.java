package enums;

class Order
{
	int id;
	String username;
	OrderStatus status;
	public Order(int id, String username, OrderStatus status) {
		super();
		this.id = id;
		this.username = username;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", username=" + username + ", status=" + status + "]";
	}
	
}


public class Demo1 {

	
	public static void main(String[] args) {
		Order order = new Order(1,"Syed",OrderStatus.DELIVERED);
        System.out.println(order.status.ordinal());
        System.out.println(order.status.getI());
	}
	
	
}
