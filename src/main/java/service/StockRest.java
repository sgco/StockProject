package service;








import dto.Company;
import dto.Stock;
import dto.StockSupplier;
import dto.Store;
import dto.StoreStock;
import dto.StoreStockMovement;
import dto.Supplier;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;


@Stateless
@Path("/netstock")
public interface StockRest {

 String masterStockListTopic = "masterstocklist";
 String supplierListTopic = "supplierList";

 
 //**
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/companies")
    public List<Company> listCompanies();
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/newCompany")
    public Company addCompany(Company company);
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/upCompany")
    public Company updateCompany(Company company);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getCompany/{id}")
    public Company getCompany(@PathParam("id") int companyId);
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/remCompany/{id}")
    public List<Company> removeCompany(@PathParam("id") int companyId);
       
   // ***
    
    
    
    
    
    
    
    
    
    
    

    
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/newStock")
    public Stock addStock(Stock stock);
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/upStock")
    public Stock updateStock(Stock stock);


    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/remStock/{id}")
    public List<Stock> removeStock(@PathParam("id")int stockId);
       
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getStock/{id}")
    public Stock getStock(@PathParam("id") int stockId);
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/stocks")
    public List<Stock> listStocks();
    
    //***
    
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/newStore")
    public Store addStore(Store store);
       
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/upStore")
    public Store updateStore(Store store) ;
        
    
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/remStore/{id}")
    public List<Store> removeStore(@PathParam("id")int storeId);
       
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getStore/{id}")
    public Store getStore(@PathParam("id")int storeId);
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/stores")
    public List<Store> listStores();
    
    
    
    
  //'8888888******************88
    
    

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/newSupplier")
    public Supplier addSupplier(Supplier supplier);
        

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/upSupplier")
    public Supplier updateSupplier(Supplier supplier);
        
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/suppliers")
    public List<Supplier> getSupplierList() ;
    
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/remSupplier/{id}")
    public List<Supplier> removeSupplier(@PathParam("id") int supplierId);
       
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getSupplier/{id}")
    public Supplier getSupplier(@PathParam("id")int supplierId);
    
    
    
    
    
    //*****************************
    
    
    
    
    
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/storeStock")
    public StoreStock updateStoreStock(StoreStock storeStock);
       
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/storeStock")
    public List<StoreStock> getStoreStockList();
       

    
    
    
    
    
    
   /*
    @GET
    @Consumes({"application/simplexml", "application/xml", "application/json"})
    @Produces({"application/simplexml", "application/xml", "application/json"})
    @Path("/stock")
    public Response getRootStockList();

    @GET
    @Consumes({"application/simplexml", "application/xml", "application/json"})
    @Produces({"application/simplexml", "application/xml", "application/json"})
    @Path("/stockhierarchy")
    public Response getStockHierarchy();

    @GET
    @Consumes({"application/simplexml", "application/xml", "application/json"})
    @Produces({"application/simplexml", "application/xml", "application/json"})
    @Path("/allstock")
    public Response getStockList(@QueryParam("description") String description);

    @GET
    @Consumes({"application/simplexml", "application/xml", "application/json"})
    @Produces({"application/simplexml", "application/xml", "application/json"})
    @Path("/stock/{id}/stock")
    public Response getStockSubList(@PathParam("id") final Long parentStockId);

   

    @POST
    @Consumes({"application/simplexml", "application/xml", "application/json"})
    @Produces({"application/simplexml", "application/xml", "application/json"})
    @Path("/stock/{id}/stock")
    public Response addSubStock(Stock stock, @PathParam("id") final Long parentStockId);

        

    

   

    
        
    @GET
    @Consumes({"application/simplexml", "application/xml", "application/json"})
    @Produces({"application/pdf"})
    @Path("/supplier/{supplierId}/bankconfirmation")
    public Response getBankConfirmation(@PathParam("supplierId") final Long supplierId) ;
        

    
       
    @GET
    @Consumes({"application/simplexml", "application/xml", "application/json"})
    @Produces({"application/pdf"})
    @Path("/supplier/{supplierId}/bbbeecertificate")
    public Response getBBBEECertificate(@PathParam("supplierId") final Long supplierId);
        

   
        

    @GET
    @Consumes({"application/simplexml", "application/xml", "application/json"})
    @Produces({"image/jpg"})
    @Path("/stock/{id}/picture")
    public Response getStockPicture(@PathParam("id") final Long stockid) ;
       

    


    @GET
    @Consumes({"application/simplexml", "application/xml", "application/json"})
    @Produces({"application/simplexml", "application/xml", "application/json"})
    @Path("/companies/{id}/stores")
    public Response getCompanyStoreList(@PathParam("id") Long companyId);
       
   
 

    @GET
    @Consumes({"application/simplexml", "application/xml", "application/json"})
    @Produces({"application/simplexml", "application/xml", "application/json"})
    @Path("/companies/{id}/stores/{storeId}/stock/{stockid}")
    public Response getStockMovement(@PathParam("id") Long companyId, @PathParam("storeId") Long storeId, @PathParam("stockid") Long stockid);
    
    

    @POST
    @Consumes({"application/simplexml", "application/xml", "application/json"})
    @Path("/companies/{id}/stores/{storeId}/stock")
    public Response addStockMovement(@PathParam("id") Long companyId, @PathParam("storeId") Long storeId);
        
    @GET
    @Consumes({"application/simplexml", "application/xml", "application/json"})
    @Produces({"application/simplexml", "application/xml", "application/json"})
    @Path("/companies/{id}/stores/{storeId}/transfer")
    public Response getTransfers(@PathParam("id") Long companyId, @PathParam("storeId") Long storeId);
        

    @GET
    @Consumes({"application/simplexml", "application/xml", "application/json"})
    @Produces({"application/simplexml", "application/xml", "application/json"})
    @Path("/companies/{id}/stores/{storeId}/transfer/{transferId}")
    public Response getTransferDetails(@PathParam("id") Long companyId, @PathParam("storeId") Long storeId, @PathParam("transferId") Long transferId) ;
       
    @PUT
    @Consumes({"application/simplexml", "application/xml", "application/json"})
    @Produces({"application/simplexml", "application/xml", "application/json"})
    @Path("/companies/{id}/stores/{storeId}/transfer/{transferId}")
    public Response updateTransferDetails(@PathParam("id") Long companyId, @PathParam("storeId") Long storeId, @PathParam("transferId") Long transferId) ;
       

    @POST
    @Consumes({"application/simplexml", "application/xml", "application/json"})
    @Produces({"application/simplexml", "application/xml", "application/json"})
    @Path("/companies/{id}/stores/{storeId}/transfer")
    public Response transferStoreStock(@PathParam("id") Long companyId, @PathParam("storeId") Long storeId) ;
       

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/companies/{id}/stores/{storeId}/checkin")
    public StoreStock checkinStoreStock(@PathParam("id") Long companyId, @PathParam("storeId") Long storeId) ;
       

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/companies/{id}/stores/{storeId}/adjust")
    public StoreStock adjustStoreStock(@PathParam("id") Long companyId, @PathParam("storeId") Long storeId) ;
       
    

 
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/companies/{id}/stores/{storeId}/stockitem")
    public  StoreStock addStoreStockitem(@PathParam("id") Long companyId, @PathParam("storeId") Long storeId, StoreStock storeStock) ;
      

    private dto.StoreStock getOrCreateStoreStock(Long storeId, Long stockId) ;
       
    private dto.Transfer createTransfer(StoreStockTransferList sstl) ;
       

    private dto.StoreStockMovement getStoreStockMovement(Long transferId, Long stockId) ;
       
    private StoreStockMovementDetail getStoreStockMovementDetail(Long transferId, String serialNo, Long stockId) ;
       
   */
}

	
	
	
	
	
	
	

