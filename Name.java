public class Name {
    private String surname;
    private String name;
    private String patronymic;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setSurname(String surname) {
        this.surname = cleanStr(surname);
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым.");
        }
        this.name = cleanStr(name);
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = cleanStr(patronymic);
    }

    public Name() {
        this.surname = null;
        this.name = null;
        this.patronymic = null;
    }

    // Только имя
    public Name(String name) {
        setName(name);
        this.surname = null;
        this.patronymic = null;
    }

    // Имя и фамилия
    public Name(String name, String surname) {
        setName(name);
        this.surname = cleanStr(surname);
        this.patronymic = null;
    }

    // Имя, фамилия и отчество
    public Name(String name, String surname, String patronymic) {
        setName(name);
        this.surname = cleanStr(surname);
        this.patronymic = cleanStr(patronymic);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (surname != null) result.append(surname).append(" ");
        if (name != null) result.append(name).append(" ");
        if (patronymic != null) result.append(patronymic);
        return result.toString().trim();
    }

    //метод для очистки строки
    private String cleanStr(String input) {
        if (input == null) return null;
        input = input.trim();
        return input.isEmpty() ? null : input;
    }
}
