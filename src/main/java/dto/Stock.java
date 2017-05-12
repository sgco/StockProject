package dto;



import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Stock implements Serializable {


    
    private static final long serialVersionUID = 1L;

 
    
    private List<StockSupplier> stockSuppliers;

    private Integer id;

    
    

    private String code;
   
    protected String description;

    protected Boolean requireSerialNo;

    protected int measurementId;

    private int childCount;

    private Stock parentStock;

    private byte[] picture;

    public Stock() {
    }

    public Stock(int id, String code, String description, Boolean requireSerialNo, int measurementId, int childCount) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.requireSerialNo = requireSerialNo;
        this.measurementId = measurementId;
        this.childCount = childCount;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stock)) {
            return false;
        }
        Stock other = (Stock) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public int getChildCount() {
        return childCount;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public int getMeasurementId() {
        return measurementId;
    }

    public Stock getParentStock() {
        return parentStock;
    }

    /**
     * Get a byte array(image) confirming the banking details of this
     * supplier
     *
     * @return the value of picture
     */
    public byte[] getPicture() {
        return picture;
    }

    public Boolean getRequireSerialNo() {
        return requireSerialNo;
    }

    public List<StockSupplier> getStockSuppliers() {
        return stockSuppliers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    
    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMeasurementId(int measurementId) {
        this.measurementId = measurementId;
    }

    public void setParentStock(Stock parentStock) {
        this.parentStock = parentStock;
    }

    /**
     * set a byte array(image) confirming the banking details of this
     * supplier
     *
     * @param picture new value of picture
     */
    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
    
    
    public void setRequireSerialNo(Boolean requireSerialNo) {
        this.requireSerialNo = requireSerialNo;
    }

    public void setStockSuppliers(List<StockSupplier> stockSuppliers) {
        this.stockSuppliers = stockSuppliers;
    }

    @Override
    public String toString() {
        return "com.model.Stock[ id=" + id + " ]";
    }    

}

