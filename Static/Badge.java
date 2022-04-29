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
    private String  generateBadgeIdCode(){
        //System.out.println("blSVH34Bz3" + this.employee.namme + this.employee.surname + "sbdj4hciuh8");
        return "blSVH34Bz3" + this.employee.namme + this.employee.surname + "sbdj4hciuh8" ;
    }

    public void showBadgeDetails(){
        System.out.println("total nuber of employee: " + totalNumberOfEmployees);
        System.out.println("details of the employee: " + employee.getEmployeeDetails() );
        System.out.println("badge IdCode: " + this.badgeIdCode);
    }

    //constractor
    public Badge(Employee employeeThatNeedsBadge){
        /*call the static method for keeping track of the number of employees
        */
        keepTrackOfEmployeesNumber();

        employee = employeeThatNeedsBadge;
        /* assign a generated id code to the object's badgeIdCode
        *non ho capito come fare questa cosa */
        this.badgeIdCode = generateBadgeIdCode();

    }

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

}
