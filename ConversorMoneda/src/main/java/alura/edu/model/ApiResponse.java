package alura.edu.model;

/**
 * Author: Erick Santamaria
 * Represents the response structure from the currency exchange API.
 */

public class ApiResponse {
    private String result;
    private String documentation;
    private String terms_of_use;
    private int time_last_update_unix;
    private String time_last_update_utc;
    private int time_next_update_unix;
    private String time_next_update_utc;
    private String base_code;
    private String target_code;
    private double conversion_rate;
    private double conversion_result;

    public double getConversion_result() {
        return conversion_result;
    }
}
