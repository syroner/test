package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.BuyItemAddDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemAddDAO {



		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		BuyItemAddDTO buyItemAddDTO = new BuyItemAddDTO();


		public void getBuyItemAddInfo(String id,String itemName,String itemPrice,String itemStock) throws SQLException{
			String sql="INSERT INTO item_info_transaction(id,item_name,item_price,item_stock)VALUES(?,?,?,?)";
			
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,id);
			preparedStatement.setString(2,itemName);
			preparedStatement.setString(3,itemPrice);
			preparedStatement.setString(4,itemStock);
			preparedStatement.execute();




		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}


	}



}
