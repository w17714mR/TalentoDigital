import tareas.*;

public class Main {

    public static void main(String[] args) {
            for (int i=1;i<7;i++){

            switch (i) {

                case 1:
                    args = new String[]{"3001", "1402", "1304", "1505"};
                    System.out.println(Visitas.promedio(args));
                    break;

                case 2:
                    args = new String[]{"300", "405", "403", "506", "100020040", "45006", "-1044"};
                    System.out.println(Smartwatch.promedio(Smartwatch.clearSteps(args)));
                    break;

                case 3:
                    args = new String[]{"10", "20", "30", "33", "21", "8", "2", "61"};
                    System.out.println(MultiplosDeTres.sumaValores(MultiplosDeTres.filtro(args)));
                    break;

                case 4:
                    args = new String[]{"10", "20", "30", "33", "21", "8", "2", "61"};
                    System.out.println(MultiplosDeTres.promedio(MultiplosDeTres.filtro(args)));
                    break;

                case 5:
                    args = new String[]{"0", "1", "2", "3", "-1", "0", "-4", "-2", "3", "0", "1", "-1"};
                    for (int e : NumerosPositivos.filtrador(args)) {
                        System.out.println(e);
                    }
                    break;

                case 6:
                    Likes l = new Likes();
                    l.principal("likes");
                    break;
            }
        }
    }
}