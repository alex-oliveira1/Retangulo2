public class Retangulo {
    private double base;
    private double altura;
    
public Retangulo() {
}

public double getBase() {
    return base;
}

public void setBase(double base) {
    this.base = base;
}

public double getAltura() {
    return altura;
}

public void setAltura(double altura) {
    this.altura = altura;
}
public double araaRetagulo(){
   return base*altura; 
}
public double perimetroRetangulo(){
    return base*2+altura*2;
}
public double diagonalRetangulo(){
   return Math.sqrt((altura*altura)+(base*base)); 
}
}
