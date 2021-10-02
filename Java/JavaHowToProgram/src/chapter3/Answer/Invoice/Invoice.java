package chapter3.Answer.Invoice;

/**
 * 
 * @author DHREY
 *
 */

public class Invoice {
	
	String partNumber;
	String partDescription;
	int quantityPurchased;
	double pricePerPart;
	
	//Constructor
	public Invoice(String partNumber, String partDecription,int quantityPurchased, double pricePerPart) {
		this.partNumber = partNumber;
		this.partDescription = partDecription;
		this.pricePerPart = pricePerPart;
		this.quantityPurchased = quantityPurchased;
	}

	/**
	 * @return the partNumber
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * @param partNumber the partNumber to set
	 */
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	/**
	 * @return the partDecription
	 */
	public String getPartDecription() {
		return partDescription;
	}

	/**
	 * @param partDecription the partDecription to set
	 */
	public void setPartDecription(String partDecription) {
		this.partDescription = partDecription;
	}

	/**
	 * @return the quantityPurchased
	 */
	public int getQuantityPurchased() {
		return quantityPurchased;
	}

	/**
	 * @param quantityPurchased the quantityPurchased to set
	 */
	public void setQuantityPurchased(int quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
	}

	/**
	 * @return the pricePerPart
	 */
	public double getPricePerPart() {
		return pricePerPart;
	}

	/**
	 * @param pricePerPart the pricePerPart to set
	 */
	public void setPricePerPart(double pricePerPart) {
		this.pricePerPart = pricePerPart;
	}
	
	public double getInvoicceAmount() {
		double getInvoicceAmount = pricePerPart * quantityPurchased;
		return getInvoicceAmount;
	}
}
