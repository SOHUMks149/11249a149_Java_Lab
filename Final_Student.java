final class Student
{
    final int ROLL_NO = 101;   // Final variable

    final void display()       // Final method
    {
        System.out.println("Roll Number: " + ROLL_NO);
        System.out.println("This is a final method.");
    }
}

public class Final_Student
{
    public static void main(String[] args)
    {
        Student s = new Student();
        s.display();
    }
}