package dev.nnhao.barberproduct;

public class Product {
    private String name;
    private String cost;
    private String imageUrl;

    public Product(String name, String cost, String imageUrl) {
        this.name = name;
        this.cost = cost;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost='" + cost + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
