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
        this.surname = Validator.cleanStr(surname);
    }

    public void setName(String name) {
        Validator.validateString(name, "Имя");
        this.name = Validator.cleanStr(name);
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = Validator.cleanStr(patronymic);
    }

    public Name() {
        this.surname = null;
        this.name = null;
        this.patronymic = null;
    }

    public Name(String name) {
        setName(name);
        this.surname = null;
        this.patronymic = null;
    }

    public Name(String name, String surname) {
        setName(name);
        this.surname = Validator.cleanStr(surname);
        this.patronymic = null;
    }

    public Name(String name, String surname, String patronymic) {
        setName(name);
        this.surname = Validator.cleanStr(surname);
        this.patronymic = Validator.cleanStr(patronymic);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (surname != null) result.append(surname).append(" ");
        if (name != null) result.append(name).append(" ");
        if (patronymic != null) result.append(patronymic);
        return result.toString().trim();
    }
}
