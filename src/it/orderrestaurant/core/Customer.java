package it.orderrestaurant.core;

/**
 * @author Alejoooooo
 *
 */
public interface Customer {
	public int getId();
	public String getName();
	public String getMailAddress();
	public String getPhoneNumber();
	public void setId(int id);
	public void setName(String name);
	public void setMailAddress(String mailAddress);
	public void setPhoneNumber(String phoneNumber);

}
