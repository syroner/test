package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.UserListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserListDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	ArrayList<UserListDTO>userListDTO = new ArrayList<UserListDTO>();

	public ArrayList<UserListDTO> getUserListInfo() throws SQLException{

		String sql="SELECT * FROM login_user_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){

				UserListDTO dto= new UserListDTO();
				dto.setLoginId(resultSet.getString("login_id"));
				dto.setUserName(resultSet.getString("user_name"));
				dto.setLoginPassword(resultSet.getString("login_pass"));
				dto.setId(resultSet.getString("id"));
				dto.setInsert_date(resultSet.getString("insert_date"));
				userListDTO.add(dto);


			}


		}catch(Exception e){
			e.printStackTrace();

		}finally{
			connection.close();
		}

		return userListDTO;


	}

}