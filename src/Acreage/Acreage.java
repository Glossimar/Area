package Acreage;

/**
 * Created by LENOVO on 2016/10/28.
 */
abstract class Shape{
    public abstract void acreage();
}

class AcreageCricle extends Shape{
    private double ridus;
    public AcreageCricle(double ridus){
        this.ridus=ridus;
    }

    public double getRidus() {
        return ridus;
    }

    public void setRidus(double ridus) {
        this.ridus = ridus;
    }
    public void acreage(){
        double result=Math.PI*Math.pow(getRidus(),2);
        System.out.println("圆形的面积是"+result);
    }
}
class AcreageTriangle extends Shape{
    private double base;
    private double high;
    public AcreageTriangle(double base,double high){
        this.base=base;
        this.high=high;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
    public void acreage(){
        double result=((this.base*this.high)/2);
        System.out.println("三角形的面积是："+result);
    }
}
class AcreageRectangle extends Shape{
    private double length;   //rectangle's long
    private double width;
    public AcreageRectangle(double reclong,double width){
        this.length=reclong;
        this.width=width;
    }

    public double getReclong() {
        return length;
    }

    public void setReclong(double reclong) {
        this.length = reclong;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void acreage(){
        double result=this.length*this.width;
        System.out.println("长方形的面积是："+result);
    }
}
class AcreageSquare extends Shape{
    private double length;
    public AcreageSquare(double length){
        this.length=length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public void acreage(){
        double result =Math.pow(this.getLength(),2d);
        System.out.println("正方形的面积是："+result);
    }
}





