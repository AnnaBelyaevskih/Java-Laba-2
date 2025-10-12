import java.util.ArrayList;
import java.util.List;

public class Assistant {
    private String name;
    private String department;
    private String managerName;
    private boolean isManager;
    private static List<Assistant> allEmployees = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Validator.validateString(name, "Имя");
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        Validator.validateString(department, "Название отдела");
        this.department = department;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        Validator.validateString(managerName, "Имя начальника");
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

    public List<Assistant> getColleagues() {
        List<Assistant> colleagues = new ArrayList<>();
        for (Assistant emp : allEmployees) {
            if (emp.getDepartment().equals(this.department)) {
                colleagues.add(emp);
            }
        }
        return colleagues;
    }
}
