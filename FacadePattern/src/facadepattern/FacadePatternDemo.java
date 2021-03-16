package facadepattern;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader; 

public class FacadePatternDemo {
	private static int  choice;  

	public static void main(String[] args) throws NumberFormatException, IOException {
		do{       
            System.out.print("========= Shape ============ \n");  
            System.out.print("            1. CIRCLE.              \n");  
            System.out.print("            2. RECTANGLE.              \n");  
            System.out.print("            3. SQUARE.            \n");  
            System.out.print("            4. Exit.                     \n");  
            System.out.print("Enter your choice: ");  
              
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            choice=Integer.parseInt(br.readLine());  
            ShapeMaker sm=new ShapeMaker();  
              
            switch (choice) {  
            case 1:  
                {   
                  sm.drawCircle();  
                    }  
                break;  
       case 2:  
                {  
                  sm.drawRectangle();        
                    }  
                break;    
       case 3:  
                           {  
                           sm.drawSquare();;       
                           }  
                   break;     
            default:  
            {    
                System.out.println("No Shape You Chose");  
            }         
                return;  
            }  
              
      }while(choice!=4);  
		

	}

}
