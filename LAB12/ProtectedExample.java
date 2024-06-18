package projectanudip;

class Parent {
    protected int protectedVariable;

    public Parent() {
        protectedVariable = 10;
    }

    protected void display() {
        System.out.println("Value of protectedVariable: " + protectedVariable);
    }
}

class Child extends Parent {
    public Child() {
        protectedVariable = 20;
    }
}

public class ProtectedExample {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        parentObj.display();

        Child childObj = new Child();
        childObj.display();
    }
}
