package converter;

import java.util.HashMap;

public interface ConverterInterface {
    public Float convert(String unit1, String unit2, float value);
    public String[] getConvertUnits();
}
