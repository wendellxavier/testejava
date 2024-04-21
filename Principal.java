

public class Principal {

    public static void main(String[] args){

        Avaliacao wendell = new Avaliacao(7,7,8);

        Avaliacao mario = new Avaliacao();

        mario.n1=7;
        mario.n2=7;
        mario.n3=7;


        System.out.println("Média do mario: " + mario.media());
        System.out.println("Média ponderada do mario: " + mario.mediaponderada());

        System.out.println("media do wendell: " + wendell.media());
        System.out.println("Media ponderada do wendell: " + wendell.mediaponderada());
    }
 }