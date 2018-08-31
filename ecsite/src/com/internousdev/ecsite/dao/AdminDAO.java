package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.AdminDTO;
import com.internousdev.ecsite.util.DBConnector;

public class AdminDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private AdminDTO adminDTO = new AdminDTO();

	public AdminDTO getAdminUserInfo(String loginUserId, String loginPassword){

		String sql="SELECT * FROM login_user_transaction where login_id=7 AND login_passwprd=syrone12";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				adminDTO.setLoginId(resultSet.getString("login_id"));
				adminDTO.setLoginPassword(resultSet.getString("login_pass"));
				adminDTO.setUserName(resultSet.getString("user_name"));

				if(!(resultSet.getString("login_id").equals(null))) {
					adminDTO.setLoginFlg(true);
				}
			}

		}catch (Exception e){
			e.printStackTrace();
		}
		return adminDTO;
	}

	public AdminDTO getAdminDTO(){
			return adminDTO;
	}


}
