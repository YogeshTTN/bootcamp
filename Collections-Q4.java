import java.util.HashMap;
import java.util.Map;

class Employee1{
    String name,designation;
    int age,salary;
    public Employee1(String n,String d,int a){
        this.designation = d;
        this.age = a;
        this.name = n;
    }
    public int setSalary(int s){
        this.salary = s;
        return s;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String getDesignation(){
        return this.designation;
    }
}
public class question4 {
    public static void main(String[] args){
        Employee1 e1 = new Employee1("Yogesh","SE",21);
        Employee1 e2 = new Employee1("Yogesh","SE2",22);
        Employee1 e3 = new Employee1("Yogesh","SE3",23);
        Employee1 e4 = new Employee1("Yogesh","SE4",24);
        Map<Employee1,Integer> mp = new HashMap<Employee1, Integer>();
        mp.put(e1, e1.setSalary(10000));
        mp.put(e2, e2.setSalary(20000));
        mp.put(e3, e3.setSalary(30000));
        mp.put(e4, e4.setSalary(40000));
        for(Employee1 emp: mp.keySet()){
            System.out.println(emp.getName()+"("+emp.designation+"-"+emp.getAge()+") "+mp.get(emp));
        }
    }
}
