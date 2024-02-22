package judith.week20.Schwarzwaldklinik;

import java.util.ArrayList;

public class Hospital {

    private String hpName;
    private ArrayList<Department> departmentArrayList = new ArrayList<>();


    public Hospital(String hpName) {
        this.hpName = hpName;
    }

    public void addDepartment(Department department) {
        departmentArrayList.add(department);
    }

    public String getHpName() {
        return hpName;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hpName='" + hpName + '\'' +
                ", departmentArrayList=" + departmentArrayList +
                '}';
    }
}


