angular.module('Stock')
.controller('Store',function($scope,$http){
	
	
	
	

		$http({
			method : 'GET',
			url : "http://localhost:8081/stock-web/rest/netstock/stores",
		}).then(function successCallback(response) {

			$scope.Stores = response.data;
			

		});

	
	
	
	$scope.addStore = function(){
		
		var store= {
		id :$scope.id,
		address :$scope.address,
		contactNumber :$scope.contactNumber,
		contactPerson :$scope.contactPerson,
		companyId :$scope.companyId,
		}
		
		console.log(store);
		$http({
			method : 'POST',
			data : store,
			url : "http://localhost:8081/stock-web/rest/netstock/newStore"
		}).then(function(response) {

			$scope.show =true;
			$scope.message= "added";
		
		});
		
	}	
	
	
	
	
  $scope.deleteStore = function(id){
		
		if(confirm("are you sure you want to delete this item")){
		
		$http({
			method :'DELETE',
			url : "http://localhost:8081/stock-web/rest/netstock/remStore/" + id
		}).then(function(response) {

			
			$scope.show =true;
			$scope.message= "deleted";
		});
		
		}else{
			console.log("not deleted");
		}
		
	}
	
	

 
  
  


	
	
	$scope.Cancel = function(){
		
		
		$scope.id ="";
		$scope.address ="";
		$scope.contactNumber="";
		$scope.contactPerson="";
		$scope.companyId="";
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
})