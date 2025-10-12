public class Human {
    private String name;
    private int height;

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        Validator.validateString(name, "Имя");
        this.name = Validator.cleanStr(name);
    }

    public void setHeight(int height) {
        Validator.validateNonNegative(height, "Рост");
        this.height = height;
    }

    public Human() {
        this.name = "null";
        this.height = 0;
    }

    public Human(String name, int height) {
        setName(name);
        setHeight(height);
    }

    @Override
    public String toString() {
        return "Человек с именем " + this.name + " и ростом " + this.height;
    }
}
