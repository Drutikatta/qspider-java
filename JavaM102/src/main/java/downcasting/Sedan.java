package downcasting;

public class Sedan extends Cab{
    int Seats;
    double Fare;
    int Rating;

    Sedan(String CabDriverName,int CabNo,int DriverNumber,int Seats,double Fare,int Rating){
        super(CabDriverName,CabNo,DriverNumber);
        this.Seats=Seats;
        this.Fare=Fare;
        this.Rating=Rating;

    }

    public void PrintDetails() {
        System.out.println("Cab Driver Name is: " + CabDriverName);
        System.out.println("Cab Number is: " + CabNo);
        System.out.println("Driver Number: " + DriverNumber);
        System.out.println("Seats in a Car are: " + Seats);
        System.out.println("Fare of ride is: " + Fare);
        System.out.println("Rating are : " + Rating);
        System.out.println("====================");
    }
}
