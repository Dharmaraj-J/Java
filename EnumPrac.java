enum Status{    
    RUNNING,FAILED,PENDING,SUCCESS; // enum constants are public, static and final (unchangeable - cannot be overridden)
}
                                // An enum cannot be used to create objects, and it cannot 
                                //extend other classes (but it can implement interfaces).



public class EnumPrac {
    public static void main(String[] args){

        Status[] ss = Status.values();

        for(Status s : ss){
            System.out.println(s + " : " + s.ordinal());
        }
        


        // in switch statement

        Status s = Status.SUCCESS;

        switch(s){

            case RUNNING:
                System.out.println("All Good ");
                break;

            case FAILED:
                System.out.println("Try Again");
                break;

            case PENDING:
                System.out.println("Please Wait");
                break;

            case SUCCESS:
                System.out.println("Done");    

        }

    }
}