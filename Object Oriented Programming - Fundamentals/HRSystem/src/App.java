public class App {
    public static void main(String[] args) throws Exception {
        

       SalesRep s1=new SalesRep("Gaurav", "Bruno", 10, 30, 730, 05, 30000, 2,"gauravB", "1234", 20000);
       SalesRep s2=new SalesRep("Sumit", "Nokar", 10, 30, 730, 05, 30000, 2,"sumitN", "12345", 30000);
       SalesRep s3=new SalesRep("Harshal", "Teko", 10, 30, 730, 05, 30000, 2,"harshalT", "123456", 20000);
       SalesRep s4=new SalesRep("Manoj", "Roto", 10, 30, 730, 05, 30000, 2, "manojR", "1234567", 30000);
    
       SalesManager SM=new SalesManager("Tejas", "Wakchaure", 10, 30, 730, 05, 30000, 2, "Tejas", "1234", 30000,s1.getSalesMade()+s2.getSalesMade()+s3.getSalesMade()+s4.getSalesMade());
       SM.calculateComission();
       System.out.println(SM.login("Tejas", "1234"));
    }   
}