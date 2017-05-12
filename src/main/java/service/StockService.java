package service;


import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dto.Company;
import dto.Stock;
import dto.Store;
import dto.StoreStock;
import dto.StoreStockMovementDetail;
import dto.Supplier;


public interface StockService {
	


    public List<Company> listCompanies();
    public Company createCompany(Company company);
    public List<Company> deleteCompany(int companyId);
    public Company updateCompany(Company company);
    public Company getCompany(int companyId);
    
    
    
    
    
    
    
    
    
    public Stock createStock(Stock stock);
    public List<Stock> deleteStock(int stockId);
    public Stock updateStock(Stock stock);
    public Stock getStock(int stockId);
    public List<Stock>listStocks();
    
    
    
    
        

   
    public Store createStore(Store store);
    public Store updateStore(Store store) ;
    public List<Store> deleteStore(int storeId);
    public Store getStore(int storeId);
    public List<Store>listStores();
    
    
    
    
    


    public Supplier createSupplier(Supplier supplier);
    public Supplier updateSupplier(Supplier supplier);
    public List<Supplier>listSuppliers() ;
    public List<Supplier>deleteSupplier(int supplierId);
    public Supplier getSupplier(int supplierId);
   
    
    
    
    
    
    public StoreStock updateStoreStock(StoreStock storeStock);
    public List<StoreStock>listStoreStocks();




    
    
    
    //not decided
   
  // public StoreStock checkinStoreStock(Long companyId,Long storeId) ;
    
    
 //  public StoreStock adjustStoreStock(Long companyId,Long storeId) ;
    
  
     
   // public Response addStoreStockitem(Long companyId, Long storeId, StoreStock storeStock) ;
    
   
  
  
  //
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  /*
    public Response getRootStockList();

    
    public Response getStockHierarchy();

    
    public Response getStockList(String description);

    
    public Response getStockSubList(final Long parentStockId);

    
   public Response addSubStock(Stock stock,final Long parentStockId);

    public Response getBankConfirmation(final Long supplierId) ;
        

    public Response getBBBEECertificate(final Long supplierId);
        

    public Response getStockPicture(final Long stockid) ;
       
    public Response getCompanyStoreList(Long companyId);
        
    public Response getStockMovement(Long companyId,Long storeId,  Long stockid);
       
    
    public Response addStockMovement(Long companyId,Long storeId);
        
    
    public Response getTransfers(Long companyId,Long storeId);
        

    public Response getTransferDetails(Long companyId,Long storeId,Long transferId) ;
       
    
    public Response updateTransferDetails(Long companyId,Long storeId,Long transferId) ;
       

   
    public Response transferStoreStock(Long companyId,Long storeId) ;
       

    
    public Response checkinStoreStock(Long companyId,Long storeId) ;
 

    private dto.StoreStock getOrCreateStoreStock(Long storeId, Long stockId) ;
       
    private dto.Transfer createTransfer(StoreStockTransferList sstl) ;
       

    private dto.StoreStockMovement getStoreStockMovement(Long transferId, Long stockId) ;
       
    private StoreStockMovementDetail getStoreStockMovementDetail(Long transferId, String serialNo, Long stockId) ;
       
  */

}

	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


