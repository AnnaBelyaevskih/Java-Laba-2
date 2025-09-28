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
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Имя не может быть пустым.");
        }
        this.name = name.trim();
    }

    public void setHeight(int height) {
        if (height <= 0) {
            System.out.println("Рост должен быть положительным числом.");
        }
        this.height = height;
    }

    public Human() {
        this.name = "null";
        this.height = 0;
    }

    public Human(String name, int height) {
        this.name = name;
        setHeight(height);
    }

    @Override
    public String toString() {
        if (height > 0 && name != null) {
            return "Человек с именем" + " " + this.name + " и ростом " + this.height;
        } else {
            return "Неверный ввод";
        }
    }
}
