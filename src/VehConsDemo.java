class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
    Vehicle (int p,int f,int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    int range (){
        return  (int) mpg*fuelcap;
    }
    double fuelneeded (int miles){
        return (double) miles / mpg;
    }
}

public class VehConsDemo {
    public static void main (String args[]) {
        Vehicle minivan = new Vehicle (7,16,21);
        Vehicle sportcar = new Vehicle (2,14,12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded (dist);

        System.out.println("Для преодоления "+dist+ " миль фургону стребуется " + gallons + " галлонов топлива.");

        gallons = sportcar.fuelneeded (dist);
        System.out.println("Для преодоления " + dist + " миль спорткару необходимо "+ gallons + " галлонов топлива.");
    }
}
