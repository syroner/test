package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemAddConfirmDAO;
import com.opensymphony.xwork2.ActionSupport;;



public class BuyItemAddConfirmAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;
	private BuyItemAddConfirmDAO buyItemAddConfirmDAO = new BuyItemAddConfirmDAO();
	private String id;
	private String itemName;
	private String itemPrice;
	private String itemStock;


	public String execute() throws SQLException{


				String result=SUCCESS;

				session.put("id", id);
				session.put("itemName", itemName);
				session.put("itemPrice", itemPrice);
				session.put("itemStock", itemStock);
				
				/*for(Entry<String, Object> entry : session.entrySet()){
				    System.out.println(entry.getKey() + ":" + entry.getValue());
				}*/


				return result;

		}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public BuyItemAddConfirmDAO getBuyItemAddConfirmDAO() {
		return buyItemAddConfirmDAO;
	}


	public void setBuyItemAddConfirmDAO(BuyItemAddConfirmDAO buyItemAddConfirmDAO) {
		this.buyItemAddConfirmDAO = buyItemAddConfirmDAO;
	}



}
