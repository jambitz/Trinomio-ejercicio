package ar.com.trinomio.mercadolibre;

public class Results {
	
	private String id;
	
	private String site_id;
	
	private String title;
	
	private Seller seller;
	
	private Double price;
	
	private String currency_id;
	
	private int available_quantity;
	
	private int sold_quantity;
	
	private String buying_mode;
	
	private String listing_type_id;
	
	private String stop_time;

	private String condition;
	
	private String permalink;
	
	private String thumbnail;

	private boolean accepts_mercadopago;
	
	private Installments installments;
	
	private Address address;
	
	private Shipping shipping;

	private String logistic_type;

	private boolean store_pick_up;
	
	private SellerAddress seller_address;
	
	private Attributes[] attributes; 
	
	private DiferencialPricing differential_pricing;
	
	private int original_price;
	
	private String category_id;
	
	private int official_store_id;
	
	private String catalog_product_id;
	
	private Reviews reviews;
	
	private String[] tags;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSite_id() {
		return site_id;
	}

	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCurrency_id() {
		return currency_id;
	}

	public void setCurrency_id(String currency_id) {
		this.currency_id = currency_id;
	}

	public int getAvailable_quantity() {
		return available_quantity;
	}

	public void setAvailable_quantity(int available_quantity) {
		this.available_quantity = available_quantity;
	}

	public int getSold_quantity() {
		return sold_quantity;
	}

	public void setSold_quantity(int sold_quantity) {
		this.sold_quantity = sold_quantity;
	}

	public String getBuying_mode() {
		return buying_mode;
	}

	public void setBuying_mode(String buying_mode) {
		this.buying_mode = buying_mode;
	}

	public String getListing_type_id() {
		return listing_type_id;
	}

	public void setListing_type_id(String listing_type_id) {
		this.listing_type_id = listing_type_id;
	}

	public String getStop_time() {
		return stop_time;
	}

	public void setStop_time(String stop_time) {
		this.stop_time = stop_time;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getPermalink() {
		return permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public boolean isAccepts_mercadopago() {
		return accepts_mercadopago;
	}

	public void setAccepts_mercadopago(boolean accepts_mercadopago) {
		this.accepts_mercadopago = accepts_mercadopago;
	}

	public Installments getInstallments() {
		return installments;
	}

	public void setInstallments(Installments installments) {
		this.installments = installments;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	public String getLogistic_type() {
		return logistic_type;
	}

	public void setLogistic_type(String logistic_type) {
		this.logistic_type = logistic_type;
	}

	public boolean isStore_pick_up() {
		return store_pick_up;
	}

	public void setStore_pick_up(boolean store_pick_up) {
		this.store_pick_up = store_pick_up;
	}

	public SellerAddress getSeller_address() {
		return seller_address;
	}

	public void setSeller_address(SellerAddress seller_address) {
		this.seller_address = seller_address;
	}

	public Attributes[] getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes[] attributes) {
		this.attributes = attributes;
	}

	public int getOriginal_price() {
		return original_price;
	}

	public void setOriginal_price(int original_price) {
		this.original_price = original_price;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public int getOfficial_store_id() {
		return official_store_id;
	}

	public void setOfficial_store_id(int official_store_id) {
		this.official_store_id = official_store_id;
	}

	public String getCatalog_product_id() {
		return catalog_product_id;
	}

	public void setCatalog_product_id(String catalog_product_id) {
		this.catalog_product_id = catalog_product_id;
	}

	public Reviews getReviews() {
		return reviews;
	}

	public void setReviews(Reviews reviews) {
		this.reviews = reviews;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}
	
	public DiferencialPricing getDifferential_pricing() {
		return differential_pricing;
	}

	public void setDifferential_pricing(DiferencialPricing differential_pricing) {
		this.differential_pricing = differential_pricing;
	}

	
	public Results() {
		
	}

}
