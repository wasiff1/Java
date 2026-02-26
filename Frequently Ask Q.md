Q What are solid principle 
SOLID is a set of 5 object-oriented design principles that help you write clean, maintainable, and scalable code.

S — Single Responsibility Principle (SRP)
-----------------------------------------
A class should have only one reason to change.
That means: one class = one responsibility.
Single Responsibility Principle (SRP)

In a typical Spring Boot layered architecture:
Controller → Handles HTTP request/response
Service → Business logic
Repository → Database interaction

Example:

@RestController
class UserController {
    private final UserService userService;
}
Each layer has one responsibility ✔
If you write business logic inside repository ❌

Open and closed principle- OCP 
-----------------------------
Class should be open for extension but closed for modification.
You should be able to add new behavior without changing existing code.
interface Notification {
    void send();
}

class EmailNotification implements Notification {
    public void send() {
        System.out.println("Sending email");
    }
}

class SmsNotification implements Notification {
    public void send() {
        System.out.println("Sending SMS");
    }
}

Liskov Substitution Principle (LSP)
----------------------------------
If class B extends class A,
then B should be usable everywhere A is used
without breaking the application.
👉 Child class should behave like the parent class.
👉 It should not change expected behavior.
If parent says:
“I can do X”
Then child must also be able to do X properly.

class Bird {
    void fly() {}
}

class Ostrich extends Bird {
    void fly() { throw new UnsupportedOperationException(); }
}
❌ Ostrich cannot fly, so it violates LSP.

Better design:

class Bird {}

interface Flyable {
    void fly();
}

class Sparrow extends Bird implements Flyable {
    public void fly() {}
}
A class should NOT be forced to implement methods it does not use.

OR even simpler:

👉 Make small, specific interfaces.
👉 Don’t create large “God interfaces”.


I — Interface Segregation Principle (ISP)
-------------------------------------
A class should NOT be forced to implement methods it does not use.
simpler:
👉 Make small, specific interfaces.
👉 Don’t create large “God interfaces”.
Suppose in Spring Boot you write:
public interface UserOperations {
    void createUser();
    void deleteUser();
    void generateReport();
    void sendEmail();
}
now if AdminService implements UserOperation then its fine becoz it can perform the all operation .
what if report service implements UserOperation then it does not need all methods like user methods it does not need
So better make separate specific interface.

D — Dependency Inversion Principle (DIP)
--------------------------------------
High-level modules should not depend on low-level modules.
Both should depend on abstractions.
Even simpler:
👉 Depend on interfaces, not concrete classes.
In Spring Boot:
Controller = High-level module
Service = Business logic
Repository = Low-level module
DIP says:

Controller should NOT directly create Service object.
It should depend on an interface.
Controller depends on abstraction
✔ Spring injects implementation
✔ Loose coupling
✔ Easy to test (mock interface)
DIP satisfied ✅
