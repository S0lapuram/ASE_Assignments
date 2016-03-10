var app = angular.module("myApp", [])


app.controller("RegisterController", function ($scope, $http, $httpParamSerializerJQLike) {

    $scope.pageClass = 'register';
    $scope.register = function(username, password, email, Address) {
   console.log("inside login function");
$http({
    method: 'POST',
    url : 'https://api.mongolab.com/api/1/databases/firstmangodb/collections/User?apiKey=NEmGW5zGla87U5p5fSbIM_fzNSDI2ZMe',
    data: JSON.stringify({
                name: username,
                password: password,
                email: email,
                Address: Address
            }),
    contentType: "application/json"
}).success(function() {
    $scope.userName ="";
    $scope.password ="";
    $scope.email ="";
    $scope.Address ="";
    
    $scope.msg ="User created successfully";
        })
}
    
});  
