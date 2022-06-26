public class Main {
    public static void modNewton(double e){
        int n=0;
        double x0=-0.5, x1, fx;
        double fx0=(3*Math.pow(x0, 2) -6*x0-14);
        System.out.println("n\txn\t\t\t\tf(xn)");
        while(true){
            fx=(Math.pow(x0, 3) -3*Math.pow(x0, 2)-14*x0-8);
            x1=x0-fx/fx0;
            System.out.println(n+"\t"+String.format("%,.10f", x0)+"\t"+String.format("%,.10f", fx));
            if(Math.abs(x1-x0)<e) break;
            n++;
            x0=x1;
        }
    }
    public static void relaxationMethod(double e){
        int n=0;
        double x0=-1, x1, t=0.1311475, fx;
        System.out.println("n\txn\t\t\t\ttf(xn)");
        while(true){
            fx=t*(Math.pow(x0,3)-3*Math.pow(x0, 2)-14*x0-8);
            x1=x0+fx;
            System.out.println(n+"\t"+String.format("%,.10f", x0)+"\t"+String.format("%,.10f", fx));
           // System.out.println(x1+" "+x0);
            if(Math.abs(x1-x0)<e) break;
            n++;
            x0=x1;
        }
    }
    public static void relaxationCount(double e){
        double q=0.344262, x0=-1, x1=-0.5;
        double logTop=Math.log(Math.abs(x0-x1)/e);
        double logBot=Math.log(1/q);
        int n=(int)(logTop/logBot +1);
        System.out.println(n);
    }
    public static void simpleIter(double e){
        int n=0;
        double x0=-1, x1;
        System.out.println("n\txn\t\t\t\txn-fi(xn)  ");
        while (true){
            x1=8*Math.pow(Math.pow(x0, 2)-3*x0-14, -1);
            System.out.println(n+"\t"+String.format("%,.10f", x0)+"\t"+String.format("%,.10f", (x0-x1)));
            if(Math.abs(x1-x0)<e) break;
            n++;
            x0=x1;
        }
    }
    public static void countSimpleIter(double e){
        double q=0.4, a=-1, b=-0.5;
        double logTop=Math.log(Math.abs(a-b)/((1-q)*e));
        double logBot=Math.log(1/q);
        int n=(int) (logTop/logBot+1);
        System.out.println(n);
    }

    public static void main(String[] args) {
       simpleIter(0.0001);
       countSimpleIter(0.0001);
    }
}
