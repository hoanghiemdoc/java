package dethi;

public class Flight {
    private int number;
    private String destination;

    public Flight(){

    }
    public Flight(int number, String destination){
      this.number = number;
      this.destination = destination;

    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public void display(){
        if (getDestination()==null){
            System.out.println(getNumber()+",khong co gi");
            return;

        }else {
            System.out.println(getNumber()+","+getDestination());
        }
    }


}
