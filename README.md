# accountdetails

Repo URL : https://github.com/karrasomu/accountdetails.git

Service URL: http://localhost:8090/user/api/account/details

Sample Request: 
{
	"accountNumber" : "12121212"
}

Headers:
Accept:application/json
Content-Type:application/json

Sample Response:

{
    "errors": null,
    "details": {
        "accountNumber": "12121212",
        "addresses": [
            {
                "addreessLine1": "1001 NW",
                "addreessLine2": "99 DR",
                "addreessLine3": "APT 2020",
                "city": "Plantation",
                "state": "FL",
                "zipcode": "FL",
                "country": "USA"
            }
        ],
        "phones": [
            {
                "number": "1234567890",
                "type": "MOBILE"
            }
        ]
    }
}
