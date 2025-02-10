enum HouseType {
    APARTMENT(500000),
    VILLA(12000000),
    BUNGALOW(20000000);
    int price;
    HouseType(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("House Types and Their Prices:");
        for (HouseType house : HouseType.values()) {
            System.out.println(house + " costs Rs." + house.getPrice());
        }
    }
}
