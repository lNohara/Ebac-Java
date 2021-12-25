package Modulo_15.Aula04;

public class Customer {

    private String gradeRequest;
    private boolean hasCompanyContract;

    public Customer(String gradeRequest, Boolean hasCompanyContract){
        this.gradeRequest = gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }

    public boolean isHasCompanyContract(){
        return hasCompanyContract;
    }

    public String getGradeRequest(){
        return gradeRequest;
    }

}
