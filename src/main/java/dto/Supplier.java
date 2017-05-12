package dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Supplier implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;

    private String description;

    private String contactNumber;
    private String contactPerson;

    private Long paymentTypeId;

    private String address;

    private String email;

    private List<StockSupplier> stockSuppliers;

    private String reference;

    private Long bankId;

    private String branchCode;

    private String accountNumber;
    private String bankConfirmationDocFileName;

    private byte[] bankConfirmationDoc;

    private String vatNumber;

    private String bbbeeStatus;

    private byte[] bbbeeCertificate;

    private String bbbeeCertificateExpiry;

    private String bbbeeCertificateFileName;

    public Supplier(){
    	
    }
    public Supplier(int id, String description, String contactNumber, String contactPerson, String address, String email,
			String reference, String branchCode, String accountNumber, String vatNumber) {
		
  this.id=id;
  this.description =description;
this.contactNumber=contactNumber;
  this.contactPerson =contactPerson;
this.paymentTypeId =paymentTypeId;
this.address =address;
this.email=email;
         this.reference=reference;
this.bankId=bankId;
this.branchCode =branchCode;
this.accountNumber =accountNumber;
    	  this.vatNumber=vatNumber;
this.bbbeeStatus=bbbeeStatus;

this.bbbeeCertificateExpiry= bbbeeCertificateExpiry;
}

	@Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Supplier)) {
            return false;
        }
        Supplier other = (Supplier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * Get the bank account Number of this supplier
     *
     * @return the value of accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    
    public String getAddress() {
        return address;
    }

    /**
     * Get a byte array(pdf document) confirming the banking details of this
     * supplier
     *
     * @return the value of bankConfirmationDoc
     */
    public byte[] getBankConfirmationDoc() {
        return bankConfirmationDoc;
    }

    /**
     * Get the file name of bankConfirmationDoc
     *
     * @return the value of bankConfirmationDocFileName
     */
    public String getBankConfirmationDocFileName() {
        return bankConfirmationDocFileName;
    }


    /**
     * Get the value of bankId 1 Absa 2 FNB 3 Nedbank 4 Standard Bank There is
     * no 'Banks' Table
     *
     * @return the value of bankId
     */
    public Long getBankId() {
        return bankId;
    }

    /**
     * set a pdf doc(byte array) of the bbbeeCertificate of this supplier
     *
     * @return the value of bbbeeCertificate
     */
    public byte[] getBbbeeCertificate() {
        return bbbeeCertificate;
    }

    /**
     * Get the bbbeeCertificateExpiry date
     *
     * @return the value of bbbeeCertificateExpiry
     */
    public String getBbbeeCertificateExpiry() {
        return bbbeeCertificateExpiry;
    }

    /**
     * Get the file name of the bbbeeCertificate
     *
     * @return the value of bbbeeCertificateFileName
     */
    public String getBbbeeCertificateFileName() {
        return bbbeeCertificateFileName;
    }

    /**
     * Get the bbbeeStatus of this supplier (not exactly sure how this works)
     *
     * @return the value of bbbeeStatus
     */
    public String getBbbeeStatus() {
        return bbbeeStatus;
    }

    /**
     * Get the branchCode of the bank of this Supplier
     *
     * @return the value of branchCode
     */
    public String getBranchCode() {
        return branchCode;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getDescription() {
        return description;
    }

    public String getEmail() {
        return email;
    }

    public Integer getId() {
        return id;
    }

    public Long getPaymentTypeId() {
        return paymentTypeId;
    }

    /**
     * Get the value of reference number that will appear on the payment
     * receivers bank statement
     *
     * @return the value of reference
     */
    public String getReference() {
        return reference;
    }

    public List<StockSupplier> getStockSuppliers() {
        return stockSuppliers;
    }

    /**
     * Get the registered vat number of this supplier
     *
     * @return the value of vatNumber
     */
    public String getVatNumber() {
        return vatNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /**
     * Set the bank account Number of this supplier
     *
     * @param accountNumber new value of accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    /**
     * set a byte array(pdf document) confirming the banking details of this
     * supplier
     *
     * @param bankConfirmationDoc new value of bankConfirmationDoc
     */
    public void setBankConfirmationDoc(byte[] bankConfirmationDoc) {
        this.bankConfirmationDoc = bankConfirmationDoc;
    }

    /**
     * Set the file name of bankConfirmationDoc
     *
     * @param bankConfirmationDocFileName new value of
     * bankConfirmationDocFileName
     */
    public void setBankConfirmationDocFileName(String bankConfirmationDocFileName) {
        this.bankConfirmationDocFileName = bankConfirmationDocFileName;
    }

    /**
     * Set the value of bankId
     *
     * @param bankId new value of bankId
     */
    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    /**
     * get the pdf doc (byte array) of the bbbeeCertificate of this supplier
     *
     * @param bbbeeCertificate new value of bbbeeCertificate
     */
    public void setBbbeeCertificate(byte[] bbbeeCertificate) {
        this.bbbeeCertificate = bbbeeCertificate;
    }

    /**
     * Set the bbbeeCertificateExpiry date
     *
     * @param bbbeeCertificateExpiry new value of bbbeeCertificateExpiry
     */
    public void setBbbeeCertificateExpiry(String bbbeeCertificateExpiry) {
        this.bbbeeCertificateExpiry = bbbeeCertificateExpiry;
    }

    /**
     * Set the file name of bbbeeCertificate
     *
     * @param bbbeeCertificateFileName new value of bbbeeCertificateFileName
     */
    public void setBbbeeCertificateFileName(String bbbeeCertificateFileName) {
        this.bbbeeCertificateFileName = bbbeeCertificateFileName;
    }

    /**
     * Set the bbbeeStatus of this supplier
     *
     * @param bbbeeStatus new value of bbbeeStatus
     */
    public void setBbbeeStatus(String bbbeeStatus) {
        this.bbbeeStatus = bbbeeStatus;
    }

    /**
     * Set the branchCode of the bank of this Supplier
     *
     * @param branchCode new value of branchCode
     */
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPaymentTypeId(Long paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    /**
     * Set the value of reference number that will appear on the payment
     * receivers bank statement
     *
     * @param reference new value of reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setStockSuppliers(List<StockSupplier> stockSuppliers) {
        this.stockSuppliers = stockSuppliers;
    }

    /**
     * Set the registered vat number of this supplier
     *
     * @param vatNumber new value of vatNumber
     */
    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    @Override
    public String toString() {
        return "com.model.Supplier[ id=" + id + " ]";
    }

}
