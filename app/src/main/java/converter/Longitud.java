package converter;

import java.util.HashMap;

public class Longitud extends BaseConverter {
    public Longitud(){
        conversionMap = new HashMap<String,Float>();
        conversionMap.put("Metro (m)",1F);
        conversionMap.put("Kilometro (km)",10E-3F);
        conversionMap.put("Decímetro (dm)",10F);
        conversionMap.put("Centímetro (cm)",100F);
        conversionMap.put("Milímetro (mm)",1000F);
        conversionMap.put("Micrómetro (um)",10E6F);
        conversionMap.put("Nanómetro (nm)",10E9F);
        conversionMap.put("Pie (ft)",3.28F);
        conversionMap.put("Yarda (ft)",1.09F);
        conversionMap.put("Milla (mi)", (float) (6.21*10E-4));
        conversionMap.put("Estadio", (float) (4.97*10E-3));
        mainUnit = "Metro (m)";
    }
}
