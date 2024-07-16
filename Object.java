import java.util.*;

class Employee {
    int id;
    String name;

    public Employee(String my_name, int my_id) {
        setName(my_name);
        id = my_id;
    }

    public void getPrint(){
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee ID: 232-35-" + getId());
    }

    public void setName(String n) {
        if(n.matches("[a-zA-Z\\s]+")) { 
            this.name = n;
        } else {
            System.out.println("Invalid name");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
}

public class Object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while(true){
            System.out.print("Enter employee name (or 'quit' to exit): ");
            String n = sc.nextLine();
            if(n.equalsIgnoreCase("quit")){
                break;
            }
            System.out.print("Enter employee id: ");
            int i = sc.nextInt(); 
            sc.nextLine();

            Employee e1 = new Employee(n, i);
            employees.add(e1);
            System.out.println();
        }

        System.out.println("\nAll Employees:\n");
        for(Employee e : employees) {
            e.getPrint();
            System.out.println();
        }

        sc.close(); 
    }
}