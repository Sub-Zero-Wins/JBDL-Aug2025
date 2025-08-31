package lambdaExpressions;

import java.io.Serializable;

public class AtmData implements Serializable
{
	public static final long SerialVersionUID =1L;
	
	transient private int id;
	private long accountNum;
	private String userName;
	private int PIN;
	private double amtWidthdraw;
	public int getId() {
		return id;
	}
	
	public AtmData(int id, long accountNum, String userName, int pIN, double amtWidthdraw) {
		super();
		this.id = id;
		this.accountNum = accountNum;
		this.userName = userName;
		PIN = pIN;
		this.amtWidthdraw = amtWidthdraw;
	}

	public void setId(int id) {
		this.id = id;
	}
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getPIN() {
		return PIN;
	}
	public void setPIN(int pIN) {
		PIN = pIN;
	}
	public double getAmtWidthdraw() {
		return amtWidthdraw;
	}
	public void setAmtWidthdraw(double amtWidthdraw) {
		this.amtWidthdraw = amtWidthdraw;
	}
	@Override
	public String toString() {
		return "AtmData [id=" + id + ", accountNum=" + accountNum + ", userName=" + userName + ", PIN=" + PIN
				+ ", amtWidthdraw=" + amtWidthdraw + "]";
	}
	
	
	

}
