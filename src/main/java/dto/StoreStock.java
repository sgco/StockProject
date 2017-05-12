package dto;



import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StoreStock implements Serializable {
    
   
    private static final long serialVersionUID = 1L;
    
    private List<CurrentStoreStock> currentStoreStocks;
    private List<StoreStockMovement> storeStockMovements;
    
    private Integer id;
    
    protected Store store;
    private Stock stock;
    
    
    private Long quantity;
    
    private Long minQuantity;

    private Long pendingQuantity;

    private Long missingQuantity;
    
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StoreStock)) {
            return false;
        }
        StoreStock other = (StoreStock) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public List<CurrentStoreStock> getCurrentStoreStock()
    {
        return this.currentStoreStocks;
    }

    public Integer getId() {
        return id;
    }
    
    
    public Long getMinQuantity() {
        return minQuantity;
    }

    public Long getMissingQuantity() {
        return missingQuantity;
    }

    public Long getPendingQuantity() {
        return pendingQuantity;
    }
    
    public Long getQuantity() {
        return quantity;
    }

    public Stock getStock() {
        return stock;
    }

    public Store getStore() {
        return store;
    }

    public List<StoreStockMovement> getStoreStockMovement()
    {
        return this.storeStockMovements;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public void setCurrentStoreStock(List<CurrentStoreStock> currentstoreStock)
    {
        this.currentStoreStocks = currentstoreStock;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setMinQuantity(Long minQuantity) {
        this.minQuantity = minQuantity;
    }

    public void setMissingQuantity(Long missingQuantity) {
        this.missingQuantity = missingQuantity;
    }

    public void setPendingQuantity(Long pendingQuantity) {
        this.pendingQuantity = pendingQuantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }




    public void setStore(Store store) {
        this.store = store;
    }

    public void setStoreStockMovement(List<StoreStockMovement> storeStockMovements)
    {
        this.storeStockMovements = storeStockMovements;
    }

    @Override
    public String toString() {
        return "com.model.StoreStock[ id=" + id + " ]";
    }
    
}
