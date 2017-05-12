package dto;



import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class CurrentStoreStock implements Serializable {
   
   private static final long serialVersionUID = 1L;
   
   private Long id;

   public Long getId() {
       return id;
   }

   public void setId(Long id) {
       this.id = id;
   }
   
   private String serialNumber;

   public String getSerialNumber() {
       return serialNumber;
   }

   public void setSerialNumber(String serialNumber) {
       this.serialNumber = serialNumber;
   }
   
   
   private StoreStock storeStock;

   public StoreStock getStoreStock() {
       return storeStock;
   }

   public void setStoreStock(StoreStock storeStock) {
       this.storeStock = storeStock;
   }

   private Long status;

   public Long getStatus() {
       return status;
   }

   public void setStatus(Long status) {
       this.status = status;
   }
   

   @Override
   public int hashCode() {
       int hash = 0;
       hash += (id != null ? id.hashCode() : 0);
       return hash;
   }

   @Override
   public boolean equals(Object object) {
       // TODO: Warning - this method won't work in the case the id fields are not set
       if (!(object instanceof CurrentStoreStock)) {
           return false;
       }
       CurrentStoreStock other = (CurrentStoreStock) object;
       if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
           return false;
       }
       return true;
   }

   @Override
   public String toString() {
       return "com.model.CurrentStoreStock[ id=" + id + " ]";
   }
   
}
