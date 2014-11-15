package basic_learning;
 
public class ComparLogicalOperatorsEx {
     
    public static void main(String args[]){
        //int a = 6;
        //int a;
        // a = 6;
        //int b = 5;
    	//boolean isEqual = (a==b);
    	//boolean isNotEqual = (a!=b);
    	//boolean greaterThan = (a>b);
    	//boolean lessThan = (a<b);
    	//boolean gtOrEq = (a>=b);
    	//boolean lsOrEq = (a<=b);
         
        //System.out.println(a+" isEqual "+b+" : "+isEqual);
        //System.out.println(a+" isNotEqual "+b+" : "+isNotEqual);
        //System.out.println(a+" greaterThan "+b+" : "+greaterThan);
        //System.out.println(a+" lessThan "+b+" : "+lessThan);
        //System.out.println(a+" gtThanEq "+b+" : "+gtOrEq);
        //System.out.println(a+" lsThanEq "+b+" : "+lsOrEq);
        
        int a = 2;
        int b = 5;
        int c = 4;
        int d = 7;
                 
        boolean orOperator = ((a+b)>20) || ((c+d)>10);
        boolean andOperator = ((a+b)>20) && ((c+d)>10);
        boolean notOperator = !((a+b)>20);
         
        System.out.println("result of orOperator is : "+orOperator);
        System.out.println("result of andOperator is : "+andOperator);
        System.out.println("result of notOperator is : "+notOperator);
        
        ///Reno's version ----------------------------------------------------------------
        
        int aa=2;
        int bb=5;
        int cc=4;
        int dd=7;
        
        boolean ab_Gt = ((aa+bb) > 20);
        //System.out.println(ab_Gt+" HAHAHAHAHA");
        boolean cd_Gt = ((cc+dd) > 10);
        
        boolean or_Operator = (ab_Gt || cd_Gt);
        boolean and_Operator = (ab_Gt && cd_Gt);
        boolean not_Operator = !(ab_Gt||cd_Gt);
        System.out.println("result of or_Operator is : "+or_Operator);
        System.out.println("result of and_Operator is : "+and_Operator);
        System.out.println("result of not_Operator is : "+not_Operator);
         
    }
}