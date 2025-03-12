package objects_and_APIs.interfaces.products;

public class Book implements Product
{
    private String name;
    private String author;
    private int pages;
    private String ISBN;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
