package Modulo_15.tarefa_mod_15;

public class Customer {

    private String gradeRequest;
    private String customerType;

    public Customer(String gradeRequest, String customerType){
        this.gradeRequest = gradeRequest;
        this.customerType = customerType;
    }

    public String getGradeRequest(){
        return gradeRequest;
    }

    public String getCustomerType() {
        return customerType;
    }
}
