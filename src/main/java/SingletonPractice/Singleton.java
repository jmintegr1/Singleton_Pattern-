package SingletonPractice;

public class Singleton {


	//Important for Framework & Interview.    |     **IQ: What you mean by Singleton pattern or Singleton class in Java and how can you achieve the same concept?
    //or implement the same concept in Selenium?      Ans: singleton is a special class that can have ONLY ONE OBJECT or INSTANCE of the class AT A TIME. Same thing..
    //Singleton is a pattern, it is not a keyword   |     .. we can do in Selenium as well. If the driver = NULL then create the object otherwise don't do that.
    //In OOP, a singleton class is a special class that can have ONLY ONE OBJECT or INSTANCE of the class AT A TIME.

    //***IQ: How do you design Singleton class?
	
    //1st: Make constructor of the class as PRIVATE
    //2nd: Write a PUBLIC static (getInstance) method that has return type of object of this Singleton class. This is also called (Lazy Initialization)
    // **IQ: What do you mean by Lazy Initialization?

	//***IQ: What is the difference between Singleton class and normal class?  
	
	//Ans: The difference between the two classes lies in terms of Instantiation. So for normal class we use Constructor to create an object, whereas for Singleton 
	//class we use getInstance() method for Instantiation. 
	
	


    private static Singleton singleton_instance = null;
    public String str;    //(Reference variable) = pointing to NULL


    private Singleton(){
        str = "Hey.. I am using singleton class pattern cuz it kicks ass!";

    }

         //**********     getInstance Method will return the Instance of this particular Singleton class, the object of this class
    public static Singleton getInstance(){  //During interview you have to WRITE this method and write this condition (this is called LAZY Initialization)
        if(singleton_instance == null) //If Reference Variable is = to NULL then Initialize this particular instance variable
            singleton_instance = new Singleton(); //If it is NULL only then we initialize, other wise no need to initialize
        return singleton_instance;
    }

    public static void main(String[] args) {  //Now to test it write PSVM, Inside we'll test this feature
        Singleton x = Singleton.getInstance(); //Call getInstance method with help of Singleton class . (dot) will give option for getInstance(), this will return Singleton Class object..
        Singleton y = Singleton.getInstance();                                                      //..then store it inside Singleton class reference variable like Singleton X =
        Singleton z = Singleton.getInstance();
        //Created three objects with three references so 3x calling getInstance() method

        x.str = (x.str).toUpperCase(); //Will return str = string & convert to capital with UpperCase() method then STORE it inside x.str on the other side of =

        System.out.println(x.str);  //Once object is created it is given to X so is the statement from str from line 29
        System.out.println(y.str); //Y will call getInstance() method as well and discover in Line 28, that Singleton_instance is NOT = NULL anymore cuz it is ALREADY Initialized by X, so that means ONLY 1 time Object is created, only 1 time this class gets to be instantiated by X
        System.out.println(z.str);//Z will discover that Singleton_instance is NOT NULL as well, so Y & Z will return the same statement cuz it is pointing to the same object which is X
                                 //So this returning "Singleton Instance" only, which is already pointed to an object (X) so these 3 objects will refer to "COMMON OBJECT" & this called = SINGLETON

        z.str = (z.str).toLowerCase();  //First we change Z to lower case with LowerCase() method then Store it on the other side of =

        System.out.println("*************************");

        System.out.println(x.str);   //Now all three objects calls the same statement but all 3 are lower case 
        System.out.println(y.str);
        System.out.println(z.str);

    }

}

