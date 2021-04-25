package BTVN.Task10.session1;

public class PartTimeEmployee extends Employee {

    String shift;

    public PartTimeEmployee(String id, String name, int sal, String shift)
    {
// Invoke the super class constructor
        super(id, name, sal);
        this.shift=shift;
    }
    /**
     * Overridden method to display employee details
     *
     * @return void
     */
    @Override
    public void displayDetails(){
        calcCommission(12); // Invoke the inherited method
        super.displayDetails(); // Invoke the super class display method
        System.out.println("Working shift:"+shift);
    }
}



