package it.generics_and_wilcards;

import java.util.ArrayList;
import java.util.List;

public class Strart {

    public static void main(String[] args) {
        System.out.println("start");

        List<Car> mylist = new ArrayList();
        mylist.add(new Car());
        Car car = mylist.get(0);

        List myGeneralList = new ArrayList();
        myGeneralList.add(new Car());
        myGeneralList.add(new UserFromDb());
        myGeneralList.add(new String("This is a string"));


        List<? super IUser> listiUsers = new ArrayList<>();
        listiUsers.add(new Usrebase());
        listiUsers.add(new Usrebase());
        listiUsers.get(0);
        //questa lista implementa IUser quindi la posiamo tratare come IUser
            /*posiamo forzarlo a esere IUser con legereza perche ci sono tatte cose che implementoano IUser */
        IUser singleIUser = (IUser) listiUsers.get(0);

        List<? super Usrebase> listUserBase = new ArrayList<>();
        listUserBase.add(new UserFromDb());

        List<? extends UserFromDb> adasd = new ArrayList<>();


        System.out.println("--------------------------");
        Factrory myFactrory = new Factrory();
        myFactrory.employee = new UserFromDb();
        myFactrory.printEmployee();

    }

}
