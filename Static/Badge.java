package it.Static;

public class Badge {

    private static int totalNumberOfEmployees;

    private String badgeIdCode;
    public Employee employee;

    /*a private String method called generateBadgeIdCode()
    that returns a String containing name and surname of
    the employee between two random String codes (e.g.XYZNameSurnameZYX)
    non o capito come farlo
    * */
    private static void  generateBadgeIdCode(){
        System.out.println(this.employee.namme + this.employee.surname);
    }

    public void showBadgeDetails(){
        System.out.println("total nuber of employee: " );
        System.out.println("details of the employee: " + employee.getEmployeeDetails() );
        System.out.println("badge IdCode: " + this.badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge){
        /*call the static method for keeping track of the number of employees
        * non ho capito come farlo*/
        static ;
        employeeThatNeedsBadge = employee;
        /* assign a generated id code to the object's badgeIdCode
        *non ho capito come fare questa cosa */
        Badge.generateBadgeIdCode() ;
    }

}
