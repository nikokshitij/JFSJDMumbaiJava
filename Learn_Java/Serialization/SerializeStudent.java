//17-10-2024
//1. Serialization

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
 
class Student implements Serializable{
  String name;  
  int id;
    public Student(int id,String name){
      this.id = id;
      this.name = name;
 
    }
}
public class SerializeStudent {
    public static void main(String[] args) {
      Student s1 = new Student(1,"Komal");
      Student s2 = new Student(2,"Pratiksha");
      Student s3 = new Student(3,"Prasad");
      Student s4 = new Student(4,"Vedanti");
      Student s5 = new Student(5,"Rutuja");
 
      try{
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Komal\\Desktop\\Java Programs Files JSD\\Serialization\\input.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
 
        objectOutputStream.writeObject(s1);
        objectOutputStream.writeObject(s2);
        objectOutputStream.writeObject(s3);
        objectOutputStream.writeObject(s4);
        objectOutputStream.writeObject(s5);
        objectOutputStream.flush();
 
        fileOutputStream.close();
        System.out.println("Success");
      }
      catch(Exception e){
          System.out.println(e);
      }
 
      try{
       
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Komal\\Desktop\\Java Programs Files JSD\\Serialization\\input.txt"));
        Student temp = (Student)objectInputStream.readObject();
        System.out.println(temp.id);
        System.out.println(temp.name);
        objectInputStream.close();
 
      }
      catch(Exception e){
        System.out.println(e);
      }
     
    }
}
 
 