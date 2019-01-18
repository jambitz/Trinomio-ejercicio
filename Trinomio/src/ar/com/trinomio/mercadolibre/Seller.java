package ar.com.trinomio.mercadolibre;

public class Seller {
	
	private String id;

	private String power_seller_status;
	
	private boolean car_dealer;

	private boolean real_estate_agency;
	
	private String[] tags;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPower_seller_status() {
		return power_seller_status;
	}

	public void setPower_seller_status(String power_seller_status) {
		this.power_seller_status = power_seller_status;
	}

	public boolean isCar_dealer() {
		return car_dealer;
	}

	public void setCar_dealer(boolean car_dealer) {
		this.car_dealer = car_dealer;
	}

	public boolean isReal_estate_agency() {
		return real_estate_agency;
	}

	public void setReal_estate_agency(boolean real_estate_agency) {
		this.real_estate_agency = real_estate_agency;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}
	
	public Seller(){
		
	}
}
