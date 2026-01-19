A constructor reference is a special type of method reference used to create objects.

👉 Syntax:
ClassName::new

Basic Example
Supplier<Employee> s = Employee::new;
Employee e = s.get();


Equivalent lambda:
Supplier<Employee> s = () -> new Employee();

Constructor Reference with Arguments
Single Parameter
Function<String, Employee> f =
        Employee::new;

Equivalent lambda:
name -> new Employee(name);
Multiple Parameters
BiFunction<String, Integer, Employee> bf =
        Employee::new;
Equivalent lambda:
(name, salary) -> new Employee(name, salary);

=========================================


package methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorRefrences {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Alice,Bob,Wasif");
        //List<Student> studentList = name.stream().map(x -> new Student(x)).collect(Collectors.toList());
        List<Student> studentList1 = name.stream().map(Student::new).collect(Collectors.toList());
        // constructor reference

        System.out.println(studentList1);
    }
}
