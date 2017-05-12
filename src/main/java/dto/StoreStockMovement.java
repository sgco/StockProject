package dto;



import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StoreStockMovement implements Serializable {
    
    
    private static final long serialVersionUID = 1L;
    
    private List<StoreStockMovementDetail> storeStockMovementDetails;
    private Long id;
    
    private StoreStock storeStock;
    
    private Date date;

    private Long quantity;

    private BigDecimal price;
    

    
    private Transfer transfer;

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StoreStockMovement)) {
            return false;
        }
        StoreStockMovement other = (StoreStockMovement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public Date getDate() {
        return date;
    }
    
    
    public Long getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Long getQuantity() {
        return quantity;
    }
    
    public StoreStock getStoreStock() {
        return storeStock;
    }

    public List<StoreStockMovementDetail> getStoreStockMovementDetail()
    {
        return this.storeStockMovementDetails;
    }

    public Transfer getTransfer() {
        return transfer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setStoreStock(StoreStock storeStock) {
        this.storeStock = storeStock;
    }




    public void setStoreStockMovementDetail(List<StoreStockMovementDetail> storeStockMovementDetails)
    {
        this.storeStockMovementDetails = storeStockMovementDetails;
    }

    public void setTransfer(Transfer transfer) {
        this.transfer = transfer;
    }

    @Override
    public String toString() {
        return "com.model.StoreStockMovement[ id=" + id + " ]";
    }
    
}
