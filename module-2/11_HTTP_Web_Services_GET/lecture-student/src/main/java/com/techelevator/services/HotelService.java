package com.techelevator.services;

import com.techelevator.models.City;
import com.techelevator.models.Hotel;
import com.techelevator.models.Review;
import org.springframework.web.client.RestTemplate;

public class HotelService {

    private final String API_BASE_URL;
    private RestTemplate restTemplate = new RestTemplate();

    public HotelService(String apiURL) {
        API_BASE_URL = apiURL;
    }

    public Hotel[] listHotels() {
        String endPoint = API_BASE_URL + "hotels";
        //Raw JSON response
        //String rawJson = restTemplate.getForObject(endPoint, String.class);
        Hotel[] hotels = restTemplate.getForObject(endPoint, Hotel[].class);
        return hotels;
    }

    public Review[] listReviews() {
        String  endPoint = API_BASE_URL + "reviews";
        Review[] reviews = restTemplate.getForObject(endPoint, Review[].class);
        return reviews;
    }

    public Hotel getHotelById(int id) {
        String endPoint = API_BASE_URL + "hotels/" + id;
        Hotel hotel = restTemplate.getForObject(endPoint, Hotel.class);
        return hotel;
    }

    public Review[] getReviewsByHotelId(int hotelID) {
        String endPoint = API_BASE_URL + "hotels/" + hotelID + "/reviews";
        Review[] reviewForHotel = restTemplate.getForObject(endPoint, Review[].class);
        return reviewForHotel;
    }

    public Hotel[] getHotelsByStarRating(int stars) {
        String endPoint = API_BASE_URL + "hotels?stars=" + stars;
        Hotel[] hotelsReviewsWithStars = restTemplate.getForObject(endPoint, Hotel[].class);
        return hotelsReviewsWithStars;
    }

    public City getWithCustomQuery(){
        String endPoint = "https://api.teleport.org/api/cities/geonameid:5128581/";
        City city = restTemplate.getForObject(endPoint, City.class);
        return city;
    }

}
