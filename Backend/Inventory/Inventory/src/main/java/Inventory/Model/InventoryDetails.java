package Inventory.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;



public class InventoryDetails {


	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";

	@Id
	Long id;

	Long RoomNo;
	String AirConditioner;
	String Lights;
	String Blankets;

	public InventoryDetails() {
	}

	public InventoryDetails(Long id, Long roomNo, String airConditioner, String lights, String blankets) {
		this.id = id;
		RoomNo = roomNo;
		AirConditioner = airConditioner;
		Lights = lights;
		Blankets = blankets;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRoomNo() {
		return RoomNo;
	}

	public void setRoomNo(Long roomNo) {
		RoomNo = roomNo;
	}

	public String getAirConditioner() {
		return AirConditioner;
	}

	public void setAirConditioner(String airConditioner) {
		AirConditioner = airConditioner;
	}

	public String getLights() {
		return Lights;
	}

	public void setLights(String lights) {
		Lights = lights;
	}

	public String getBlankets() {
		return Blankets;
	}

	public void setBlankets(String blankets) {
		Blankets = blankets;
	}

	@Override
	public String toString() {
		return "InventoryDetails{" +
				"id=" + id +
				", RoomNo=" + RoomNo +
				", AirConditioner='" + AirConditioner + '\'' +
				", Lights='" + Lights + '\'' +
				", Blankets='" + Blankets + '\'' +
				'}';
	}
}