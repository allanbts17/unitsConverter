package converter;

import java.util.HashMap;

public class BaseConverter implements ConverterInterface {
    protected String mainUnit;
    protected HashMap<String,Float> conversionMap;
    public Float convert(String unit1, String unit2, float value){
        Float result;
        if(unit1.equals(mainUnit)){
            result = value * conversionMap.get(unit2);
        } else if (unit2.equals(mainUnit)) {
            result = value / conversionMap.get(unit1);
        } else {
            result = value / conversionMap.get(unit1) * conversionMap.get(unit2);
        }
        return  result;
    }

    public String[] getConvertUnits(){
        return conversionMap.keySet().toArray(new String[0]);
    }
}
