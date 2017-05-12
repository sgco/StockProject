angular
		.module('Stock')
		.controller(
				'Company',
				function($scope, $http) {

					$http(
							{
								method : 'GET',
								url : "http://localhost:8081/stock-web/rest/netstock/companies",
							}).then(function successCallback(response) {

						$scope.Companies = response.data;
					});

					

					$scope.deleteCompany = function(id) {
						if (confirm("are you sure you want to delete this item?")) {

							$http(
									{
										method : 'DELETE',
										url : "http://localhost:8081/stock-web/rest/netstock/remCompany/"
												+ id
									}).then(function(response) {

								$scope.Companies = response.data;
								$scope.show =true;
								$scope.message= "deleted";
								
								if($scope.Companies == ""){
									$scope.message ='There are no companies available';
								}
								
							});

						} else {
							console.log("not deleted");
						}

					};

					
				});