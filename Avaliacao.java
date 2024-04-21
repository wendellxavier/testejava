public class Avaliacao {

    double n1, n2, n3;

    Avaliacao(){

    }

    Avaliacao(double n1, double n2, double n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double media(){
        return(n1+n2+n3)/3;
    }

    public double mediaponderada(){
        return(n1*2+n2*3+n3*4)/9;
    }
}