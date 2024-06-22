package alura.edu.service;

import alura.edu.model.ApiResponse;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Author: Erick Santamaria
 * Service class for handling currency exchange operations.
 */

public class Service {
    static String api = "https://v6.exchangerate-api.com/v6/";
    static String apiKey = "62e163fc9f11abd866a208e8";
    static String baseUrl = api + apiKey + "/pair/";

    /**
     * Perform currency exchange operation using the specified base and target currencies.
     *
     * @param baseCurrency
     * @param targetCurrency
     * @param value
     * @return An instance of ApiResponse containing the conversion result.
     * @throws IOException
     * @throws InterruptedException
     */

    public ApiResponse exchangeCurrency(String baseCurrency, String targetCurrency, double value) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + baseCurrency + "/" + targetCurrency + "/" +  value))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        Gson gson = new Gson();
        ApiResponse objResponse = gson.fromJson(json, ApiResponse.class);
        return objResponse;
    }

}
