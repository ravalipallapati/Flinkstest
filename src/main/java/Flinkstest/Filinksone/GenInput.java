package Flinkstest.Filinksone;

public class GenInput {

  public String getInput()
  {
	  
	  String input = "{\r\n" + 
	  		"    \"HttpStatusCode\": 200,\r\n" + 
	  		"    \"Accounts\": [\r\n" + 
	  		"             {\r\n" + 
	  		"            \"Transactions\": [\r\n" + 
	  		"                {\r\n" + 
	  		"                    \"Date\": \"2020-08-03\",\r\n" + 
	  		"                    \"Code\": null,\r\n" + 
	  		"                    \"Description\": \"TrxChe@Cr16.77\",\r\n" + 
	  		"                    \"Debit\": null,\r\n" + 
	  		"                    \"Credit\": 16.77,\r\n" + 
	  		"                    \"Balance\": 49999.99,\r\n" + 
	  		"                    \"Id\": \"2d4f74a4-7d57-426b-8e79-f0daa87226e4\"\r\n" + 
	  		"                },\r\n" + 
	  		"				{\r\n" + 
	  		"                    \"Date\": \"2020-08-05\",\r\n" + 
	  		"                    \"Code\": null,\r\n" + 
	  		"                    \"Description\": \"TrxChe@Cr16.79\",\r\n" + 
	  		"                    \"Debit\": null,\r\n" + 
	  		"                    \"Credit\": 16.79,\r\n" + 
	  		"                    \"Balance\": 50000.00,\r\n" + 
	  		"                    \"Id\": \"ad113462-507b-4301-9193-a0f80e0fccf3\"\r\n" + 
	  		"                },\r\n" + 
	  		"                {\r\n" + 
	  		"                    \"Date\": \"2020-08-06\",\r\n" + 
	  		"                    \"Code\": null,\r\n" + 
	  		"                    \"Description\": \"national money\",\r\n" + 
	  		"                    \"Debit\": 16.8,\r\n" + 
	  		"                    \"Credit\": null,\r\n" + 
	  		"                    \"Balance\": 49983.20,\r\n" + 
	  		"                    \"Id\": \"ea9a85f1-98cc-4d8f-a033-b8e3f5885632\"\r\n" + 
	  		"                },\r\n" + 
	  		"                {\r\n" + 
	  		"                    \"Date\": \"2020-08-04\",\r\n" + 
	  		"                    \"Code\": null,\r\n" + 
	  		"                    \"Description\": \"TrxChe@De16.78\",\r\n" + 
	  		"                    \"Debit\": 16.78,\r\n" + 
	  		"                    \"Credit\": null,\r\n" + 
	  		"                    \"Balance\": 49983.21,\r\n" + 
	  		"                    \"Id\": \"4c1f4551-9522-4185-bc7d-2125ec23e5ac\"\r\n" + 
	  		"                }\r\n" + 
	  		"            ],\r\n" + 
	  		"            \"TransitNumber\": null,\r\n" + 
	  		"            \"InstitutionNumber\": null,\r\n" + 
	  		"            \"Title\": \"Personal loan\",\r\n" + 
	  		"            \"AccountNumber\": \"LO020202\",\r\n" + 
	  		"            \"Balance\": {\r\n" + 
	  		"                \"Available\": null,\r\n" + 
	  		"                \"Current\": 49983.20,\r\n" + 
	  		"                \"Limit\": null\r\n" + 
	  		"            },\r\n" + 
	  		"            \"Category\": \"Credits\",\r\n" + 
	  		"            \"Type\": \"LoanPersonal\",\r\n" + 
	  		"            \"Currency\": \"CAD\",\r\n" + 
	  		"            \"Holder\": {\r\n" + 
	  		"                \"Name\": \"John Doe\",\r\n" + 
	  		"                \"Address\": {\r\n" + 
	  		"                    \"CivicAddress\": \"1275 avenue des Canadiens-de-Montréal\",\r\n" + 
	  		"                    \"City\": \"Montréal\",\r\n" + 
	  		"                    \"Province\": \"QC\",\r\n" + 
	  		"                    \"PostalCode\": \"H3B 5E8\",\r\n" + 
	  		"                    \"POBox\": null,\r\n" + 
	  		"                    \"Country\": \"CA\"\r\n" + 
	  		"                },\r\n" + 
	  		"                \"Email\": \"johndoe@flinks.io\",\r\n" + 
	  		"                \"PhoneNumber\": \"(514) 333-7777\"\r\n" + 
	  		"            },\r\n" + 
	  		"            \"Id\": \"2229d988-9f52-4738-9d9f-08d7dfd70efc\"\r\n" + 
	  		"        },\r\n" + 
	  		"		{\r\n" + 
	  		"            \"Transactions\": [\r\n" + 
	  		"                {\r\n" + 
	  		"                    \"Date\": \"2020-06-13\",\r\n" + 
	  		"                    \"Code\": null,\r\n" + 
	  		"                    \"Description\": \"TrxChe@Cr16.77\",\r\n" + 
	  		"                    \"Debit\": null,\r\n" + 
	  		"                    \"Credit\": 20.77,\r\n" + 
	  		"                    \"Balance\": 1020.77,\r\n" + 
	  		"                    \"Id\": \"2d4f74a4-7d57-426b-8e79-f0daa87226e4\"\r\n" + 
	  		"                },\r\n" + 
	  		"				{\r\n" + 
	  		"                    \"Date\": \"2020-06-20\",\r\n" + 
	  		"                    \"Code\": null,\r\n" + 
	  		"                    \"Description\": \"TrxChe@Cr16.79\",\r\n" + 
	  		"                    \"Debit\": null,\r\n" + 
	  		"                    \"Credit\": 25.79,\r\n" + 
	  		"                    \"Balance\": 1046.56,\r\n" + 
	  		"                    \"Id\": \"ad113462-507b-4301-9193-a0f80e0fccf3\"\r\n" + 
	  		"                },\r\n" + 
	  		"                {\r\n" + 
	  		"                    \"Date\": \"2020-06-06\",\r\n" + 
	  		"                    \"Code\": null,\r\n" + 
	  		"                    \"Description\": \"national money\",\r\n" + 
	  		"                    \"Debit\": 20.8,\r\n" + 
	  		"                    \"Credit\": null,\r\n" + 
	  		"                    \"Balance\": 1000.00,\r\n" + 
	  		"                    \"Id\": \"ea9a85f1-98cc-4d8f-a033-b8e3f5885632\"\r\n" + 
	  		"                },\r\n" + 
	  		"                {\r\n" + 
	  		"                    \"Date\": \"2020-06-23\",\r\n" + 
	  		"                    \"Code\": null,\r\n" + 
	  		"                    \"Description\": \"TrxChe@De16.78\",\r\n" + 
	  		"                    \"Debit\": 20,\r\n" + 
	  		"                    \"Credit\": null,\r\n" + 
	  		"                    \"Balance\": 1026.56,\r\n" + 
	  		"                    \"Id\": \"4c1f4551-9522-4185-bc7d-2125ec23e5ac\"\r\n" + 
	  		"                }\r\n" + 
	  		"            ],\r\n" + 
	  		"            \"TransitNumber\": null,\r\n" + 
	  		"            \"InstitutionNumber\": null,\r\n" + 
	  		"            \"Title\": \"Chequing Account\",\r\n" + 
	  		"            \"AccountNumber\": \"CO020200\",\r\n" + 
	  		"            \"Balance\": {\r\n" + 
	  		"                \"Available\": null,\r\n" + 
	  		"                \"Current\": 10003.00,\r\n" + 
	  		"                \"Limit\": null\r\n" + 
	  		"            },\r\n" + 
	  		"            \"Category\": \"Operations\",\r\n" + 
	  		"            \"Type\": \"Chequing\",\r\n" + 
	  		"            \"Currency\": \"CAD\",\r\n" + 
	  		"            \"Holder\": {\r\n" + 
	  		"                \"Name\": \"John Doe\",\r\n" + 
	  		"                \"Address\": {\r\n" + 
	  		"                    \"CivicAddress\": \"1275 avenue des Canadiens-de-Montréal\",\r\n" + 
	  		"                    \"City\": \"Montréal\",\r\n" + 
	  		"                    \"Province\": \"QC\",\r\n" + 
	  		"                    \"PostalCode\": \"H3B 5E8\",\r\n" + 
	  		"                    \"POBox\": null,\r\n" + 
	  		"                    \"Country\": \"CA\"\r\n" + 
	  		"                },\r\n" + 
	  		"                \"Email\": \"johndoe@flinks.io\",\r\n" + 
	  		"                \"PhoneNumber\": \"(514) 333-7777\"\r\n" + 
	  		"            },\r\n" + 
	  		"            \"Id\": \"2229d988-9f52-4738-9d9f-08d7dfd70efc\"\r\n" + 
	  		"        }\r\n" + 
	  		"    ],\r\n" + 
	  		"    \"Login\": {\r\n" + 
	  		"        \"Username\": \"Greatday_nomfa\",\r\n" + 
	  		"        \"IsScheduledRefresh\": false,\r\n" + 
	  		"        \"LastRefresh\": \"2020-08-06T17:16:42.9368424Z\",\r\n" + 
	  		"        \"Type\": \"Personal\",\r\n" + 
	  		"        \"Id\": \"2664a2bc-f943-4bc6-12c6-08d7dfdacaaa\"\r\n" + 
	  		"    },\r\n" + 
	  		"    \"Institution\": \"FlinksCapital\",\r\n" + 
	  		"    \"RequestId\": \"5ce48f52-5982-4a11-9cf5-eb43b73eef0b\"\r\n" + 
	  		"}\r\n" + 
	  		"";
	  
	  
	return input;  
	  
  }



}
