package design;

public abstract class Information implements Employee {

    final String address= "120-55 Queens Blvd, Kew Gardens,NY 11424";

    static String retireDate = "01/19/2014";

    public void farewell () {

        System.out.println("Employee's last day was: "+retireDate);
    }


}
