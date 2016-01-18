import HelloApp.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;

import java.util.Properties;

class HelloImpl extends HelloPOA {
  private ORB orb;

  public void setORB(ORB orb_val) {
    orb = orb_val; 
  }
    
  // implement sayHello() method
  public String sayHello(){
    String msg = "\nHello world !! with Java-IDL\n";
    return msg; 
  }
  // implement sum() method
    public  int[] sum(int[] a,int[] b)
     {
       int[] result=new int[a.length];
       int i=0;
       for(i=0;i<a.length;i++)
            result[i]=a[i]+b[i];
       return result;    
     }
     
  // implement shutdown() method
  public void shutdown() {
    orb.shutdown(false);
  }
} 
