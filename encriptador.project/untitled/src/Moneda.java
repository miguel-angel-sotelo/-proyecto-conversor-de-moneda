import java.util.Map;

public class Moneda {
    private String result;
    private String documentation;
    private long time_last_update_unix;
    private String time_last_update_utc;
    private String base_code;
    private Map<String, Double> conversion_rates;  // Mapa que contiene las tasas de conversión

    // Getters y setters
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public long getTime_last_update_unix() {
        return time_last_update_unix;
    }

    public void setTime_last_update_unix(long time_last_update_unix) {
        this.time_last_update_unix = time_last_update_unix;
    }

    public String getTime_last_update_utc() {
        return time_last_update_utc;
    }

    public void setTime_last_update_utc(String time_last_update_utc) {
        this.time_last_update_utc = time_last_update_utc;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    // Método útil para obtener la tasa de conversión de una moneda en particular
    public Double getConversionRate(String currencyCode) {
        if (conversion_rates != null) {
            return conversion_rates.get(currencyCode);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "result='" + result + '\'' +
                ", documentation='" + documentation + '\'' +
                ", time_last_update_unix=" + time_last_update_unix +
                ", time_last_update_utc='" + time_last_update_utc + '\'' +
                ", base_code='" + base_code + '\'' +
                ", conversion_rates=" + conversion_rates +
                '}';
    }
}

