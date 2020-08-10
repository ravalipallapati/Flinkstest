package Flinkstest.Filinksone;

import java.util.List;

import org.json.simple.JSONArray;

import io.restassured.path.json.JsonPath;

public class Testone {

	public static void main(String[] args) {
		
	GenInput gen = new GenInput();	
		
	String input = gen.getInput();	
	JsonPath js = new JsonPath(input);
	
   List<Object> accounts_list =js.getList("Accounts");  

   
   for (int i=0;i<accounts_list.size();i++)
   {
	   
	   List<Object> transactionsone_list = js.get("Accounts["+i+"].Transactions");	 
	   
	   
	   for (int j=0;j<transactionsone_list.size();j++)   
		   
	   {
		   
		   JSONArray array = new JSONArray();		   
		   
		    array.add(js.get("Accounts["+i+"].Transactions["+j+"]"));		    
		
		   
//		   String Dateone = js.get("Accounts["+i+"].Transactions["+j+"].Date").toString();
//		   
//		   String Datetwo = js.get("Accounts["+i+"].Transactions["+(j+1)+"].Date").toString();	   
//		  
		   
		   
	   }
	   
   }
   
   
	}
}
