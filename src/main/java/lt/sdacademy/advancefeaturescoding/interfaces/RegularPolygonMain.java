package lt.sdacademy.advancefeaturescoding.interfaces;

/*Daugiakampiai:
        Interfeisas RegularPolygon turi 2 metodus getNumSides ir getSideLength
        Klasė EquilateralTriangle, kuri implementuoja interfeisą RegularPolygon metodą getNumSides gražina skaičių 3, metodą getSideLength gražina kintamojo reikšmę, inicializuotą per konstruktorių;
        Klasė Square, kuri implementuoja interfeisą RegularPolygon metodą getNumSides gražina skaičių 4, metodą getSideLength gražina kintamojo reikšmę, inicializuotą per konstruktorių;
        Interfeise pridėti 2 defaultinius metodus: getPerimeter(n * length) ir getInteriorAngle((n / 2) PI / n)
        Sukurtoje RegularPolygonMain klasėje apskaičiuoti figūrų perimetrus ir plotus.*/

public class RegularPolygonMain {
    public static void main (String []args){
        Square square = new Square(10);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(10);

        System.out.println("Kvadrato perimetras - " + square.getPerimeter());
        System.out.println("Kvadrato vidinas kampas - " + square.getInteriorAngle());
        System.out.println("Kvadrato plotas - " + Math.pow(square.getSideLength(),2));

        System.out.println("Trikampio perimetras - " + equilateralTriangle.getPerimeter());
        System.out.println("Trikampio vidinas kampas - " + equilateralTriangle.getInteriorAngle());
        System.out.println("Kvadrato plotas - " + Math.pow(equilateralTriangle.getSideLength(),2)/2);


    }
}
