import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Moneda {

    @SerializedName("base_code")
    String baseCode;

    @SerializedName("conversion_rates")
    Map<String, Double> conversionRates;

    public String getBaseCode() {
        return baseCode;
    }

    public Map<String, Double> getConversionRates() {
        return conversionRates;
    }

}
