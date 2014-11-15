package class_object;
 
public class PersonConstractor {
    //Below are the properties/class variable/ instance variable/member variable       
        private String name;       
        private int age;
        private String ssn;
         
        public PersonConstractor(){    
            System.out.println("This is from default constructor");
        }
         
        public PersonConstractor(String name, int age, String ssn){
            this.name = name;
            this.age = age;
            this.ssn = ssn;
        }
         
        public PersonConstractor(String name, int age){
            this(name,age,null);
        }
         
        public PersonConstractor(String name){
            this(name,0,null);     
        }
         
        //This is an example of a function / instance method / behavior of a class
        public void printName(){
            System.out.println("My name is : "+name);
        }  
         
        public static void main(String args[]){        
             
            PersonConstractor objDefConstr = new PersonConstractor();
            System.out.println("Creating objects with overloaded constructors *****");
            PersonConstractor personObject = new PersonConstractor("myName",23);           
            personObject.printName();
            System.out.println("Age is : "+personObject.age);          
             
            PersonConstractor personObject2 = new PersonConstractor("yourName",534);           
            personObject2.printName();
            System.out.println("Age is : "+personObject2.age);         
        }
}