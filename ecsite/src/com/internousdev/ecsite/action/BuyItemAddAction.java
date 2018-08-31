package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;




public class BuyItemAddAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;
	private String id;
	private String itemName;
	private String itemPrice;
	private String itemStock;


		public String execute() throws SQLException {

		String result =SUCCESS;

		return result;

	}

		public Map<String, Object> getSession() {
			return session;
		}

		public void setSession(Map<String, Object> session) {
			this.session = session;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public String getItemPrice() {
			return itemPrice;
		}

		public void setItemPrice(String itemPrice) {
			this.itemPrice = itemPrice;
		}

		public String getItemStock() {
			return itemStock;
		}

		public void setItemStock(String itemStock) {
			this.itemStock = itemStock;
		}


}
