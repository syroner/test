package com.internousdev.ecsite.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemAddConfirmDAO;
import com.opensymphony.xwork2.ActionSupport;;



public class BuyItemAddCompleteAction extends ActionSupport implements SessionAware{

		public Map<String, Object> session;
		private BuyItemAddConfirmDAO buyItemAddConfirmDAO = new BuyItemAddConfirmDAO();


		public String execute() throws SQLException{

//			buyItemAddCompleteDAO.buyItemAddInfo(
//
//
//
					String result = SUCCESS;
//
					return result;

			}


		public Map<String, Object> getSession() {
			return session;
		}


		public void setSession(Map<String, Object> session) {
			this.session = session;
		}


		public BuyItemAddConfirmDAO getBuyItemAddCompleteDAO() {
			return buyItemAddConfirmDAO;
		}


		public void setBuyItemAddCompleteDAO(BuyItemAddConfirmDAO buyItemAddConfirmDAO) {
			this.buyItemAddConfirmDAO = buyItemAddConfirmDAO;
		}





}
