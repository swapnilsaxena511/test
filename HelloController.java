package hello;

import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public Map<String, List<Properties>> index() {
    	
    	List <FormData> formData=new ArrayList<>();
    	FormData formData1=new FormData("actEs", "actEsRw1", "lcArcd", "Local Area Code",false, "lcArcdVld", true);
    	FormData formData2=new FormData("actEs", "actEsRw2", "rngStrt", "Range Strat",false, "rngStrtVld", true);
    	FormData formData3=new FormData("actEs", "actEsRw1", "mainNmbr", "Main Number",false, "mainNmbrVld", true);
    	FormData formData4=new FormData("actEs", "actEsRw2", "rngEnd", "Range End",false, "rngEndVld", true);
    	
    	//formData.addAll(formData1,formData2,formData3,formData4);
    	formData.add(formData1);
    	formData.add(formData2);
    	formData.add(formData3);
    	formData.add(formData4);
    	
    	Gson gson =new Gson();
    	gson.toJson(formData);
    	List <Properties> propertiesList =new ArrayList<Properties>();
    	Map<String,Validator>validators=new  HashMap<String, Validator>();
    	Map<String,Properties>propertiesMap=new  HashMap<String, Properties>();
    	Map<String,List <Properties>>rowPropMap=new HashMap<String, List <Properties>>();
    	formData.forEach(f->{
    		
    		Validator v=new Validator(f.isRequired(), f.getRowPropValidatorId());
    		validators.put(f.getRowPropValidatorId(), v);
    		
    		Properties prop=new Properties(f.getRowPropId(), f.getLabel(), f.isReadOnly(),
    				validators.get(f.getRowPropValidatorId()));
    		propertiesMap.put(f.getRowPropId(), prop);
    		
    		
    		if(rowPropMap.containsKey(f.getRowId())) {
    			rowPropMap.get(f.getRowId()).add(propertiesMap.get(f.getRowPropId()));
    		}
    		else {
    			List <Properties> propertiesList1 =new ArrayList<Properties>();
    			propertiesList1.add(propertiesMap.get(f.getRowPropId()));
    			rowPropMap.put(f.getRowId(),propertiesList1);
    		}
    		
    		//propertiesList.add(prop);
    	
    	});
    	
    	gson.toJson(propertiesList);
    	gson.toJson(rowPropMap);
    	
        return rowPropMap;
       
    }
    
}
