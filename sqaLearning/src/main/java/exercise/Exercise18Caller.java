package exercise;


public class Exercise18Caller {
     
    public static void main(String args[]){
        Exercise18DBOps mySQl = new Exercise18MySQLDBOps();
        Exercise18DBOps oracle = new Exercise18OracleDBOps();
         
        System.out.println(" mySQl.update is - "+mySQl.update());
        System.out.println(" myOracle.update is - "+oracle.update());
        
        System.out.println(" mySQl.delete is - "+mySQl.delete());
        System.out.println(" myOracle.delete is - "+oracle.delete());
        
        System.out.println(" mySQl.read is - "+mySQl.read());
        System.out.println(" myOracle.read is - "+oracle.read());
        
        System.out.println(" mySQl.create is - "+mySQl.create());
        System.out.println(" myOracle.create is - "+oracle.create());
    }
}