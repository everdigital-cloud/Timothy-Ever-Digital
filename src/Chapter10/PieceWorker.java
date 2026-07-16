package Chapter10;

public class PieceWorker extends Employee {
    private double wage;
    private double pieces;
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, double pieces){
        super(firstName, lastName, socialSecurityNumber);
        if (wage<0.0){
            throw new IllegalArgumentException("Wage should be > 0.0");
        }
        this.wage=wage;
        if (pieces<0.0){
            throw new IllegalArgumentException("Pieces should be > 0.0");
        }
        this.pieces=pieces;
    }

    public void setWage(double wage) {
        if (wage<0.0){
            throw new IllegalArgumentException("Wage should be > 0.0");
        }
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setPieces(double pieces) {
        if (pieces<0.0){
            throw new IllegalArgumentException("Pieces should be > 0.0");
        }
        this.pieces = pieces;
    }

    public double getPieces() {
        return pieces;
    }

    @Override
    public double earnings() {
        return getWage()*getPieces();
    }

    @Override
    public String toString(){
        return String.format("Piece worker employee: %s%n%s: %.2f%n%s: $%,.2f", super.toString(),"Pieces", getPieces(), "wages", getWage());

    }
}
