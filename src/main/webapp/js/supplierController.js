angular.module('Stock')
.controller('SupplierUp',function($scope,$http,$routeParams){
	
	
	
	
		$http({
			method :'GET',
			url : "http://localhost:8081/stock-web/rest/netstock/getSupplier/" + $routeParams.id
		}).then(function(response) {

			$scope.id=response.data.id;
			$scope.description=response.data.description;
			$scope.contactNumber=response.data.contactNumber;
			$scope.contactPerson=response.data.contactPerson;
			$scope.address=response.data.address;
			$scope.email=response.data.email;
			$scope.reference=response.data.reference;
			$scope.branchCode=response.data.branchCode;
			$scope.accountNumber=response.data.accountNumbe;
			$scope.vatNumber=response.data.vatNumber;
			
			
			
			
		});
		
		
					
		$scope.updateSupplier = function(){

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
	 


	$http({
		method :'PUT',
		data : supplier,
		url : "http://localhost:8081/stock-web/rest/netstock/upSupplier"
	}).then(function(response) {

		$scope.show =true;
		$scope.message= "updated";
		
	});

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