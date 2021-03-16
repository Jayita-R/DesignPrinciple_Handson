package pattern;

public class DBConnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DBConn object = DBConn.getInstance();
		 int instance1=object.hashCode();
         System.out.println(instance1);
         DBConn object1 = DBConn.getInstance();
         int instance2=object1.hashCode();
         System.out.println(instance2);
         
         if (instance1 == instance2) {
 			System.out.println("SingleTon Design Principal is applied");
 		}
	}

}
