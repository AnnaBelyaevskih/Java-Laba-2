import java.util.ArrayList;
import java.util.List;

public class Assistant {
    private String name;
    private String department;
    private String managerName;
    private boolean isManager;
    private static List<Assistant> allEmployees = new ArrayList<>(); //список всех сотрудников

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым.");
        }
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department == null || department.trim().isEmpty()) {
            throw new IllegalArgumentException("Название отдела не может быть пустым.");
        }
        this.department = department;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        if (managerName == null || managerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя начальника не может быть пустым.");
        }
        this.managerName = managerName;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public Assistant() {}

    public Assistant(String name, String department, String managerName, boolean isManager) {
        setName(name);
        setDepartment(department);
        setManagerName(managerName);
        setManager(isManager);
        allEmployees.add(this);
    }

    @Override
    public String toString() {
        if (isManager) {
            return String.format("%s начальник отдела %s", name, department);
        } else {
            return String.format("%s работает в отделе %s, начальник которого %s",
                    name, department, managerName);
        }
    }

    //метод для получения списка всех сотрудников отдела
    public List<Assistant> getColleagues() {
        //создаём новый пустой список
        List<Assistant> colleagues = new ArrayList<>();

        //проходим по всем сотрудникам
        for (Assistant emp : allEmployees) {
            //проверяем принадлежит ли текущий сотрудник к тому же отделу, что и текущий объект
            if (emp.getDepartment().equals(this.department)) {
                colleagues.add(emp);
            }
        }
        return colleagues;
    }
}


