// Strategy Interface
interface Drive
{
    public void drive();
}
// Concrete Strategies
class NormalDrive implements Drive
{
    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}
class LuxuryDrive implements Drive
{
    @Override
    public void drive() {
        System.out.println("luxury drive capability");
    }
}
// Vehicle class
class Vehicle {
    Drive driveCapability;
    public Vehicle(Drive driveCapability)
    {
        this.driveCapability = driveCapability;
    }
    public void drive()
    {
        driveCapability.drive();
    }
}
// Concrete Contexts
class LuxuryVehicle extends Vehicle
{
    public LuxuryVehicle(Drive driveCapability)
    {
        super(driveCapability);
    }
    public void drive()
    {
        super.drive();
    }
}
class SportsVehicle extends Vehicle
{
    public SportsVehicle(Drive driveCapability)
    {
        super(driveCapability);
    }
    public void drive()
    {
        super.drive();
    }
}
class PublicVehicle extends Vehicle
{
    public PublicVehicle(Drive driveCapability)
    {
        super(driveCapability);
    }
    public void drive()
    {
        super.drive();
    }

}


public class Strategy_Design_Pattern {
    public static void main(String[] args) {
        Vehicle mercedes = new LuxuryVehicle(new LuxuryDrive());
        mercedes.drive();

        Vehicle audi = new SportsVehicle(new LuxuryDrive());
        audi.drive();
        Vehicle bmw=new LuxuryVehicle(new NormalDrive());
        bmw.drive();
    }
}