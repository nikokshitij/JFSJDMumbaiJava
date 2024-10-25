abstract class Animal {
    abstract void sound();
}

class car {
    void run()
    {
        System.out.println("Car is running in highway");
    }
}

public class abstract_trial{

    public static void main(String[] args) {

        Animal cat= new Animal(){ /// Anonymous class
           void sound(){
                System.out.println("Maow");
            }
        };

        cat.sound();
      car c1=new car(){ //normal class has an anonyomus class

        void run(){
            System.out.println("I am called in anonymous");
        }
     };

     c1.run();

    }
}

 

