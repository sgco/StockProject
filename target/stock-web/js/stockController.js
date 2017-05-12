angular.module('Stock')
.controller('Stockks',function($scope,$http){
	

	

		$http({
			method : 'GET',
			url : "http://localhost:8081/stock-web/rest/netstock/stocks",
		}).then(function successCallback(response) {

			$scope.Stocks = response.data;
			

		});

	
	
	
	$scope.addStock = function(){
		
		var stock= {
				id : $scope.id,
		        code :$scope.code,
				description:$scope.description,
				requireSerialNo:$scope.requireSerialNo,
				measurementId:$scope.measurementId,
				childCount:$scope.childCount
		}
		
		console.log(stock);
		$http({
			method : 'POST',
			data : stock,
			url : "http://localhost:8081/stock-web/rest/netstock/newStock"
		}).then(function(response) {

			
		});
		
	}	
	
	
	
	
  $scope.deleteStock = function(id){
		
		
		console.log(id);
		if(confirm("Are you sure you want to delete this stock item?")){
		$http({
			method :'DELETE',
			url : "http://localhost:8081/stock-web/rest/netstock/remStock/" + id
		}).then(function(response) {

			
			$scope.show =true;
			$scope.message= "deleted";
		
		
		});
		}else{
			console("not deleted");
		}
	}
	
	

 


	})