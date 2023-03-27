package Chapter_10.CodeTestsFromBook;

public class Student {
    int rollno;  
    String name,course;  
    float fee;  
    Student(int rollno,String name,String course){  
    this.rollno=rollno;  
    this.name=name;  
    this.course=course;  
    }  
    Student(int rollno,String name,String course,float fee){  
    this(rollno,name,course);//reusing constructor  
    this.fee=fee;  
    }  
    void display(){
        System.out.println(this.rollno+" "+this.name+" "+this.course+" "+this.fee);
        System.out.println(this.rollno+" ");        
        }  

        }  
    class TestThis7{  
    public static void main(String args[]){  
    Student s1=new Student(111,"ankit","java");  
    Student s2=new Student(112,"sumit","java",6000f);  
    s1.display();  
    s2.display();  
    }}  