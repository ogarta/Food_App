package com.example.foodapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FoodModel {
    private int image;
    private String name;
    private String address;
    private List<CatetoryItem> catetoryItemList;
    private String discount;
    private float distance;
    private Date openTime;
    private Date closeTime;

    public FoodModel(int image, String name, String address, List<CatetoryItem> catetoryItemList, String discount, float distance, Date openTime, Date closeTime) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.catetoryItemList = catetoryItemList;
        this.discount = discount;
        this.distance = distance;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<CatetoryItem> getCatetoryItemList() {
        return catetoryItemList;
    }

    public void setCatetoryItemList(List<CatetoryItem> catetoryItemList) {
        this.catetoryItemList = catetoryItemList;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public static List<FoodModel> getMock(){
        return new ArrayList<>(Arrays.asList(
            new FoodModel(R.drawable.foody_com_tam_minh_long,"C??m T???m Minh Long - Nguy???n Th??? Th???p","607 Nguy???n Th??? Th???p, P. T??n H??ng, Qu???n 7, TP. HCM",Arrays.asList(CatetoryItem.FAMILY,CatetoryItem.SHOP_ONLINE),"Ca ngay - 30%",22f,Utils.createDateForHour(7),Utils.createDateForHour(21)),
            new FoodModel(R.drawable.foody_pizza_4p,"Pizza 4P???s - Pizza Ki???u Nh???t - L?? Th??nh T??n","8/15 L?? Th??nh T??n, P. B???n Ngh??,  Qu???n 1, TP. HCM",Arrays.asList(CatetoryItem.RESTAURANT,CatetoryItem.FAMILY,CatetoryItem.GROUP),"Ca ngay 50%",10.5f,Utils.createDateForHour(10),Utils.createDateForHour(23)),
            new FoodModel(R.drawable.foody_restaurant_sanfulou,"San Fu Lou - ???m Th???c Qu???ng ????ng - L?? Lai","T???ng Tr???t, AB Tower, 76A L?? Lai, P. B???n Th??nh,  Qu???n 1, TP. HCM",Arrays.asList(CatetoryItem.RESTAURANT,CatetoryItem.FAMILY,CatetoryItem.GROUP),"Buoi sang - 10%",15f,Utils.createDateForHour(7),Utils.createDateForHour(3)),
            new FoodModel(R.drawable.foody_ut_ut_quan,"Qu??n ???t ???t - Barbecue & Beer - V?? V??n Ki???t","168 V?? V??n Ki???t, P. C???u ??ng L??nh,  Qu???n 1, TP. HCM",Arrays.asList(CatetoryItem.BIRTHDAY,CatetoryItem.FAMILY,CatetoryItem.GROUP),"Buoi toi - 20%",18f,Utils.createDateForHour(11),Utils.createDateForHour(23)),
            new FoodModel(R.drawable.foody_restaurant_fuji,"Fuji Japanese Restaurant ?????? - Nikko Saigon Hotel","T???ng Tr???t Nikko Saigon Hotel, 235 Nguy???n V??n C???, P. Ph???m Ng?? L??o,  Qu???n 1, TP. HCM",Arrays.asList(CatetoryItem.RESTAURANT,CatetoryItem.FAMILY,CatetoryItem.GROUP),"Kh??ng c?? ??u ????i",14.7f,Utils.createDateForHour(11),Utils.createDateForHour(22)),
            new FoodModel(R.drawable.foody_buffet_sabusabu,"Shabu Ya - SC VivoCity","T???ng 4 - SC VivoCity, 1058 Nguy???n V??n Linh, KP. 1, P. T??n Phong,  Qu???n 7, TP. HCM",Arrays.asList(CatetoryItem.BUFFET,CatetoryItem.RESTAURANT,CatetoryItem.FAMILY,CatetoryItem.GROUP),"Ca ngay 15%",28.4f,Utils.createDateForHour(9),Utils.createDateForHour(22)),
            new FoodModel(R.drawable.foody_buffet_hana_bbq_and_hot_pot,"Hana BBQ & Hot Pot Buffet - Nguy???n Qu?? ?????c","65 Nguy???n Qu?? ?????c, P. An Ph??,  Qu???n 2, TP. HCM",Arrays.asList(CatetoryItem.BUFFET,CatetoryItem.RESTAURANT,CatetoryItem.FAMILY),"Buoi sang 10%",13.2f,Utils.createDateForHour(8),Utils.createDateForHour(22)),
            new FoodModel(R.drawable.foody_restaurant_kvegetarian,"Qu??n Chay KVegetarian - B??nh Th???nh","20/15 Phan ????ng L??u, P. 6,  Qu???n B??nh Th???nh, TP. HCM",Arrays.asList(CatetoryItem.RESTAURANT,CatetoryItem.FAMILY,CatetoryItem.GROUP),"Kh??ng c?? ??u ????i",7.3f,Utils.createDateForHour(9),Utils.createDateForHour(21)),
            new FoodModel(R.drawable.foody_streetfood_223flan,"Qu??n 223 - B??nh Flan Th???p C???m","223 Tr???n B??nh Tr???ng,  Qu???n 5, TP. HCM",Arrays.asList(CatetoryItem.STREETFOOD,CatetoryItem.SHOP_ONLINE,CatetoryItem.GROUP),"Kh??ng c?? ??u ????i",20f,Utils.createDateForHour(11),Utils.createDateForHour(21)),
            new FoodModel(R.drawable.foody_streetfood_banh_mi_bo_a_tung,"A T??ng - B??nh M?? B?? N?????ng B?? Cambodia - C???ng Qu???nh","171 C???ng Qu???nh,  Qu???n 1, TP. HCM",Arrays.asList(CatetoryItem.STREETFOOD,CatetoryItem.SHOP_ONLINE,CatetoryItem.GROUP),"Kh??ng c?? ??u ????i",11f,Utils.createDateForHour(14),Utils.createDateForHour(21)),
            new FoodModel(R.drawable.foody_shop_online_bep_rua,"B???p R??a - Ch??n G?? R??t X????ng Ng??m S??? T???c - Shop Online","127/5/9 L?? Th??c Ho???ch, P. Ph?? Th??? H??a,  Qu???n T??n Ph??, TP. HCM",Arrays.asList(CatetoryItem.SHOP_ONLINE,CatetoryItem.GROUP,CatetoryItem.FAMILY),"Ca ngay 10%",20f,Utils.createDateForHour(5),Utils.createDateForHour(24)),
            new FoodModel(R.drawable.foody_shop_online_bep_9_sach,"B??nh 9 S???ch - B??nh S???u Ri??ng - Shop Online","73 An D????ng V????ng, P. 8,  Qu???n 5, TP. HCM",Arrays.asList(CatetoryItem.SHOP_ONLINE,CatetoryItem.GROUP,CatetoryItem.FAMILY),"Ca ngay 5%",16f,Utils.createDateForHour(8),Utils.createDateForHour(21))

            ));
    }

}
