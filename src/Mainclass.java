import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainclass {

	public static void main(String[] args) throws IOException {  
        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
        System.out.print("Enter Student Id: ");  
        int id=Integer.parseInt(br.readLine());  
        System.out.print("\n");  
          
        System.out.print("Enter Student Name: ");  
        String name=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Student Surname: ");  
        String surname=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Student Address: ");  
        String address=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Student Grade: ");  
        int grade= Integer.parseInt(br.readLine());  
        System.out.print("\n");  
        // We created constructor about the student info so we have to know student info for put there 
        
           
        StudentInfo s1= new StudentInfo(id, name, surname, grade, address);  
          
        s1.showRecord();  
        System.out.println("\n");  
        StudentInfo s2=(StudentInfo) s1.getClone();  
        s2.showRecord();  
        // And now we used prototype model for clone
    }     

}
