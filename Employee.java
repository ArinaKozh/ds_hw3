public class Employee{

    private String name;
    private int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("Работник %s возраста %d", this.name, this.age);
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        else if (o instanceof Employee){
            Employee employee = (Employee)o;
            if (this.name.equals(employee.name) && this.age == employee.age){
                return true;
            }
        }
        return false;
    }


}