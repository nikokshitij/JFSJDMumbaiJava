import java.util.*;

class Node {
    int key ;
    int value;

    Node(int key,int value)
    {
        this.key=key;
        this.value=value;

    }
}

//Hash table funtion
class HashTable
{
    private int size;
    private List<List<Node>> table;

    HashTable(int size)
    {
        this.size=size;
        this.table=new ArrayList<> (size);
        for (int i=0;i<size;i++)
        {
            table.add(new ArrayList<> ());

        }
    }

    public int hashFunction(int key)
    {
        System.out.println("The index for the key :"+key+"is===>"+key%size);
        return key%size;
        
    }

    public void insert(int key,int value)
    {
        int index= hashFunction(key);
        List<Node> list=table.get(index);
        Node n=new Node(key, value);
        list.add(n);

    }

    int search(int key)
    {
        int index=hashFunction(key);
        List<Node> list = table.get(index);
        for(Node node:list)
        {
            if(node.key==key)
            {
                return node.value;
            }
        }
        return -1;
    }
}


public class hashing 
{

    public static void main(String[] args) 
    {
        System.out.println("Hello World!");
        int tableSize = 10;
        HashTable ht=new HashTable(tableSize);
        ht.insert(3,100);
        ht.insert(2,200);
        ht.insert(4,700);
        
         if(ht.search(6)!=-1)
        {
            System.out.println("Key is found");
        }
        else
        {
            System.out.println("NOPE Bad luck not found");
        }
       
    }
    
}

