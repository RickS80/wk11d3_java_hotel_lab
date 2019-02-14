

public class Booking {

private Bedroom bedroom;
private int numberOfnights;

public Booking(Bedroom bedroom, int numberOfnights){
    this.bedroom = bedroom;
    this.numberOfnights = numberOfnights;
}

public double getBill(){
    return this.numberOfnights * bedroom.getNightlyRate();
}

}
