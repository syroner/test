package com.internousdev.templateX.dto;

public class LoginDTO {

		private String loginId;
		private String loginPassword;
		private String userName;
		private boolean loginFlg = false;

		public String getLoginId(){
			return loginId;
		}

		public void setLoginId(String loginId) {

			this.loginId = loginId;
		}

		public String getLoginPassword() {

			return loginPassword;
		}

		public void setLoginPassword(String loginpassword) {

			this.loginPassword=loginpassword;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName){
			this.userName=userName;
		}

		public boolean getLoginFlg() {
			return loginFlg;
		}

		public void setLoginFlg(boolean loginFlg){

			this.loginFlg=loginFlg;
		}


}