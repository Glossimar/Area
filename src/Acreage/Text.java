package Acreage;
/**
 * Created by LENOVO on 2016/10/28.
 */
public class Text {
    public static void main(String[] args) {
        AcreageCricle cir = new AcreageCricle(7);
        cir.acreage();

        AcreageRectangle rec=new AcreageRectangle(4,5);
        rec.acreage();

        AcreageSquare squ=new AcreageSquare(6);
        squ.acreage();

        AcreageTriangle tir=new AcreageTriangle(3,200);
        tir.acreage();

    }
}
