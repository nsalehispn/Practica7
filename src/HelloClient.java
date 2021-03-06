import HelloApp.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import java.util.*;
import java.lang.*;

public class HelloClient {
  static Hello helloImpl;

  public static void main(String args[]){
    try{
      // create and initialize the ORB
      ORB orb = ORB.init(args, null);
       long start=0;
       long end=0;
 
     
       
      // get the root naming context
      org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");

      // Use NamingContextExt instead of NamingContext, 
      // part of the Interoperable naming Service.  
      NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
 
      // resolve the Object Reference in Naming
      String name = "Hello";
      helloImpl = HelloHelper.narrow(ncRef.resolve_str(name));

      System.out.println ("Obtained a handle on server object: " + helloImpl);
      System.out.println(helloImpl.sayHello());
       start=System.currentTimeMillis();
       System.out.println("\nstart:"+start);
       int[] a={10,10,10,10,10,10,10,10,10,10};
       int[] b={2,2,2,2,2,2,2,2,2,2};
       int[] r=new int[10];
       
       r=helloImpl.sum(a,b);
       end=System.currentTimeMillis();
       System.out.println("\nend:"+end);

      
       System.out.println("\n La resultado de la suma de los dos array es:");
       int i;
       for(i=0;i<10;i++)
           System.out.print("\t"+r[i]);
       
       System.out.println("--------- La suma realizo en :"+(end-start));  
      
      
       helloImpl.shutdown();
   
  
    } 
    catch (Exception e) {
      System.out.println("ERROR : " + e) ;
      e.printStackTrace(System.out);
    } 
  } 
} 
