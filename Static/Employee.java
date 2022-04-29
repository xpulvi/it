package it.Static;

public class Employee {

    String namme;
    String surname;
    String address;

    //constractor metod
    protected Employee(String newEmployeeName, String newEmployeeSurname,
                       String newEmployeeAddress){
        this.namme = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    protected String getEmployeeDetails(){
        System.out.println("Employee Details: " + "name: " + namme + " surname " + this.surname +
                " address: " + this.address);
        return "Employe details " +this.namme + this.surname + this.address ;
    }

}
