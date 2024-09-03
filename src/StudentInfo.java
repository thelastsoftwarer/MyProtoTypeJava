
public class StudentInfo implements ProtoType {
	private int id ;
	private String name, surname ;
	private int grade;
	private String address;
	 public StudentInfo(){  
         System.out.println("   Employee Records of Oracle Corporation ");  
         System.out.println("---------------------------------------------");  
         System.out.println("ÝD"+"\t"+"name"+"\t"+"surname"+"\t"+"grade"+"\t"+"address");  
   
}  
	 public  StudentInfo(int id, String name, String surname, int grade,String address) {  
         
	        this();  
	        this.id = id;  
	        this.name = name;  
	        this.surname = surname;  
	        this.grade = grade;  
	        this.address = address;  
	    }
	
	public void showRecord(){  
         
	        System.out.println(id+"\t"+name+"\t"+surname+"\t"+grade+"\t"+address);  
	   }  
	 public ProtoType getClone() {
		 return new StudentInfo(id,name,surname,grade,address); 
	}
	
	
}
