package ute.com.bingo;

public class NumberBall {
    int number;
    boolean picked;

    public NumberBall() {
    }

    public NumberBall(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPicked() {
        return picked;
    }

    public void setPicked(boolean picked) {
        this.picked = picked;
    }
}
