package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class BuyItemAddConfirmDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();


	private String sql="INSERT INTO item_info_transaction(id,item_name,item_price,item_stock) VALUES(?,?,?,?)";


	public void buyItemAddInfo(String id,String item_name,String item_price,String item_stock) throws SQLException{


		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,id);
			preparedStatement.setString(2,item_name);
			preparedStatement.setString(3,item_price);
			preparedStatement.setString(4,item_stock);
			preparedStatement.execute();



		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}

	}

}
