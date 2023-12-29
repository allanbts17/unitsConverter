package converter;

import java.util.HashMap;

public class Volumen extends BaseConverter {
    public Volumen(){
        conversionMap = new HashMap<String,Float>();
        conversionMap.put("Litro (l)",1F);
        conversionMap.put("Decilitro (dl)",10F);
        conversionMap.put("Centilitro (cl)",100F);
        conversionMap.put("Centímetro cúbico (cm3)",1000F);
        conversionMap.put("Mililitro (ml)",1000F);
        conversionMap.put("Mililitro cúbico (ml3)",10E6F);
        conversionMap.put("Microlitro (ul)",10E6F);
        conversionMap.put("Galón (gal)",0.26F);
        conversionMap.put("Onza líquida (oz)",33.81F);
    }
}
