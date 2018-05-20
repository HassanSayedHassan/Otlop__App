package salma.example.com.trainnavigationdrawer;

/**
 * Created by saloom on 15/05/2018.
 */

public class Restaurant_info {


    private int rest_image ;



    private String rest_name ;
    private String rest_menu ;
    private String delivery_time ;



public Restaurant_info(){

}



    public Restaurant_info(String delivery_time, String rest_menu, String rest_name, int rest_image) {
        this.delivery_time = delivery_time;
        this.rest_menu = rest_menu;
        this.rest_name = rest_name;
        this.rest_image = rest_image;
    }

    public String getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(String delivery_time) {
        this.delivery_time = delivery_time;
    }

    public String getRest_menu() {
        return rest_menu;
    }

    public void setRest_menu(String rest_menu) {
        this.rest_menu = rest_menu;
    }

    public String getRest_name() {
        return rest_name;
    }

    public void setRest_name(String rest_name) {
        this.rest_name = rest_name;
    }

    public int getRest_image() {
        return rest_image;
    }

    public void setRest_image(int rest_image) {
        this.rest_image = rest_image;
    }





}
