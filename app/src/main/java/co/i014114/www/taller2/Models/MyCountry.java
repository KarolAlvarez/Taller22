package co.i014114.www.taller2.Models;

/**
 * Created by root on 27/09/17.
 */

public class MyCountry extends Country {

    private int numeroHabitantes, area,prefijoTelefonico,dominioInternet;


    public String getNumeroHabitantes() {
        return ""+numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getArea() {
        return ""+area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getPrefijoTelefonico() {
        return ""+prefijoTelefonico;
    }

    public void setPrefijoTelefonico(int prefijoTelefonico) {
        this.prefijoTelefonico = prefijoTelefonico;
    }

    public String getDominioInternet() {
        return ""+dominioInternet;
    }

    public void setDominioInternet(int dominioInternet) {
        this.dominioInternet = dominioInternet;
    }


}
