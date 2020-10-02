import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSONExample
{
    @SuppressWarnings("unchecked")
	public static void main( String[] args )
    {
    	JSONObject employeeDetails = new JSONObject();
    	employeeDetails.put("firstName", "Deepak");
    	employeeDetails.put("lastName", "Singh");
    	employeeDetails.put("website", "google.com");
    	
    	JSONObject employeeObject = new JSONObject(); 
    	employeeObject.put("employee", employeeDetails);
    	
    	//Second Employee
    	JSONObject employeeDetails2 = new JSONObject();
    	employeeDetails2.put("firstName", "Dexter");
    	employeeDetails2.put("lastName", "Jackson");
    	employeeDetails2.put("website", "example.com");
    	
    	JSONObject employeeObject2 = new JSONObject(); 
    	employeeObject2.put("employee", employeeDetails2);
    	JSONArray employeeList = new JSONArray();
    	employeeList.add(employeeObject);
    	employeeList.add(employeeObject2);
    	try (FileWriter file = new FileWriter("employees.json")) {

            file.write(employeeList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
