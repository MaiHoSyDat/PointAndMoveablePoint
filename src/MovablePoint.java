public class MovablePoint extends Point {
    private float xSpeed = 4.7f;
    private float ySpeed = 3.9f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {

        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = {this.xSpeed, this.ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                " ( " + super.getX() + " , " + super.getY() + " )" +
                ", speed = ( " + xSpeed +" , " + ySpeed + " )"+
                '}';
    }

    public MovablePoint move() {
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1.3f, 2.2f);
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());
    }

}
