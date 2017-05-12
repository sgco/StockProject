angular.module('Stock')
.controller('Supplier',function($scope,$http){
	
	


		$http({
			method : 'GET',
			url : "http://localhost:8081/stock-web/rest/netstock/suppliers",
		}).then(function successCallback(response) {

			$scope.Suppliers = response.data;
			

		});

	
	
	
	$scope.addSupplier = function(){
		
		var supplier= {
				id:$scope.id,
				description:$scope.description,
				contactNumber:$scope.contactNumber,
				contactPerson:$scope.contactPerson,
				address:$scope.address,
				email:$scope.email,
				reference:$scope.reference,
				branchCode:$scope.branchCode,
				accountNumber:$scope.accountNumber,
				vatNumber:$scope.vatNumber
				
		};
		
		console.log(supplier);
		$http({
			method : 'POST',
			data : supplier,
			url : "http://localhost:8081/stock-web/rest/netstock/newSupplier"
		}).then(function(response) {
			$scope.show =true;
			$scope.message= "added";
		});
		
	}	
	
	
	
	
  $scope.deleteSupplier = function(id){
		
		if(confirm("are you sure u want to delete this item")){
		console.log(id);
		$http({
			method :'DELETE',
			url : "http://localhost:8081/stock-web/rest/netstock/remSupplier/" + id
		}).then(function(response) {

			$scope.show =true;
			$scope.message= "deleted";
		
		});
		}else{
			console.log("not deleted");
		}
	}
	
	
  
  
  

		
		
		
		$scope.Cancel =function(){
			$scope.id="";
			$scope.description="";
			$scope.contactNumber="";
			$scope.contactPerson="";
			$scope.address="";
			$scope.email="";
			$scope.reference="";
			$scope.branchCode="";
			$scope.accountNumber="";
			$scope.vatNumber="";
			
			
		}
		
		
		
		
})