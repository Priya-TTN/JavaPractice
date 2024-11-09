package finalClassMethodVariable;

public class FinalClass {
    public static void main(String[] args) {
        ToTheNew ttn = new ToTheNew(23);
        ttn.attendence(5);
    }}


final class ToTheNew{ // final class can't be inherit
    final int empId; // final instance variable must be initialize inside constructor
    ToTheNew(int id){
       this.empId = id; // initilize
    }

    public final void attendence(int id){ // final method
        final int emp = id; // local variable
        System.out.println("This employe is present --> "+emp);
    }
}


