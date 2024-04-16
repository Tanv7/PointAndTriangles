package Tanya;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Triangle> triList=new ArrayList();
        final int n=2;
        getTrianglesFromConsole(n, triList);
        System.out.println("Вы ввели треугольники:");
        printTriArray(triList);
        double summPerim=0;
        for (int i = 0; i < n; i++) {
            summPerim+=triList.get(i).perim();
        }
        System.out.println("Средннее значение периметра= "+(summPerim/n));

        String filename="input.txt";
        ArrayList<Triangle> triList2=new ArrayList();
        getTrianglesFromFile(triList2, filename);
        System.out.println("\n Из файла прочитаны треугольники ");

        printTriArray(triList2);

        double summS=0;
        for (int i = 0; i < triList2.size(); i++) {
            summS+=triList2.get(i).perim();
        }
        System.out.println("Суммарная площадь= "+summS);




    }

    private static void printTriArray(ArrayList<Triangle> triList) {

        for (int i = 0; i < triList.size(); i++) {
            System.out.println(triList.get(i));
        }
    }

    private static void getTrianglesFromFile( ArrayList<Triangle> triList, String filename) throws FileNotFoundException {
        Scanner scanner=new Scanner(new File(filename));
        while (scanner.hasNext()){

            triList.add(new Triangle(new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble())));

        }
    }
    private static void getTrianglesFromConsole(int n, ArrayList<Triangle> triList) {
        System.out.println("Введите координаты "+ n +" треугольника (ов) (координаты "+(n *3)+" точек)");
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < n; i++) {

            triList.add(new Triangle(new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble())));

        }
    }
}