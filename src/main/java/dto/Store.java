package dto;



import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class Store implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer id;

    private String address;

    private String contactNumber;
    
    private String contactPerson;

    private Long companyId;

    private Store parentStore;
    
    public Store(){
    	
    }

    public Store(int id, String address, String contactNumber, String contactPerson, long companyId) {
    	this.id = id;

        this.address = address;

        this.contactNumber =contactNumber;
        
        this.contactPerson = contactPerson;

         this.companyId= companyId;

        
    	
    	
    	
    	
    	
	}

	@Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Store)) {
            return false;
        }
        Store other = (Store) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public String getAddress() {
        return address;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public Integer getId() {
        return id;
    }
    
    public Store getParentStore() {
        return parentStore;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
    
    
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public void setParentStore(Store parentStore) {
        this.parentStore = parentStore;
    }

    @Override
    public String toString() {
        return "com.model.Store[ id=" + id + " ]";
    }
    
}

