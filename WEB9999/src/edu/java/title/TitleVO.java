package edu.java.title;

public class TitleVO {

		private String title;
		private String address;
		private String latitude;
		private String longitude;
		private String phone;
		
		public TitleVO(){}
		public TitleVO(String title, String address, String latitude, String longitude, String phone){
			this.title = title;
			this.address = address;
			this.latitude = latitude;
			this.longitude = longitude;
			this.phone = phone;
		}
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getLatitude() {
			return latitude;
		}
		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}
		public String getLongitude() {
			return longitude;
		}
		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		


}
