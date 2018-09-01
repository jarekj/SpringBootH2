package database.dto;

public class AddressDto {

    private String uuid;
    private String street;
    private String city;
    private String state;


    public AddressDto() {
    }

    public AddressDto(String uuid, String street, String city, String state) {
        this.uuid = uuid;
        this.street = street;
        this.city = city;
        this.state = state;
    }


    public String getUuid() {
        return uuid;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}
