import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Company Name :");
        String Name=in.nextLine();
        if (Name.equals("benz")){
            benz[] arrayLenght= makeBenz();
            for (int i = 0; i <arrayLenght.length ; i++) {
                System.out.println(arrayLenght[i]);

            }
        }
        else if (Name.equals("bmw")){
            Bmw[] arrayLenght1= makeBmw();
            for (int i = 0; i <arrayLenght1.length ; i++) {
                System.out.println(arrayLenght1[i]);
            }

        }

    }
    private static benz[] makeBenz(){
        benz benz= new benz();
        benz.setModel("S");
        benz.setEngine("V12");
        benz.setTuner("AMG");
        benz.setProductYear(2014);
        benz.setColor("Black");
        benz.setMilage(5000);
        benz.setAcceleration(6);
        benz.setTopSpeed(250);

        benz benz1= new benz();
        benz1.setModel("CLS");
        benz1.setEngine("V8");
        benz1.setTuner("AMG");
        benz1.setProductYear(2017);
        benz1.setColor("Blue");
        benz1.setMilage(0);
        benz1.setAcceleration(7);
        benz1.setTopSpeed(250);

        benz benz2= new benz();
        benz2.setModel("SLK");
        benz2.setEngine("V6");
        benz2.setTuner("MercedesBenz");
        benz2.setProductYear(2008);
        benz2.setColor("NardoGray");
        benz2.setMilage(25600);
        benz2.setAcceleration(5);
        benz2.setTopSpeed(280);

        benz benz3=new benz();
        benz3.setModel("G");
        benz3.setEngine("V8 Bitourbo");
        benz3.setTuner("AMG");
        benz3.setProductYear(2020);
        benz3.setColor("Matt Black");
        benz3.setMilage(0);
        benz3.setAcceleration(4);
        benz3.setTopSpeed(250);

        benz benz4=new benz();
        benz4.setModel("C");
        benz4.setEngine("L4");
        benz4.setTuner("MercedesBenz");
        benz4.setProductYear(2019);
        benz4.setColor("Red");
        benz4.setMilage(5480);
        benz4.setAcceleration(8);
        benz4.setTopSpeed(230);

        benz[] arrayBenz =new benz[5];
        arrayBenz[0]=benz;
        arrayBenz[1]=benz1;
        arrayBenz[2]=benz2;
        arrayBenz[3]=benz3;
        arrayBenz[4]=benz4;
        return arrayBenz;
    }
    private static Bmw[] makeBmw(){
        Bmw bmw=new Bmw();
        bmw.setModel("1 seri");
        bmw.setEngine("L4");
        bmw.setTuner("Bmw Motorsport");
        bmw.setProductYear(2013);
        bmw.setColor("white");
        bmw.setMilage(32400);
        bmw.setAcceleration(10);
        bmw.setTopSpeed(200);

        Bmw bmw1=new Bmw();
        bmw1.setModel("2 seri");
        bmw1.setEngine("L6 Bitourbo");
        bmw1.setTuner("Mpower");
        bmw1.setProductYear(2017);
        bmw1.setColor("Gray");
        bmw1.setMilage(3500);
        bmw1.setAcceleration(6);
        bmw1.setTopSpeed(270);

        Bmw bmw2=new Bmw();
        bmw2.setModel("4 seri");
        bmw2.setEngine("v8 Twintourbo");
        bmw2.setTuner("Bmw Motorsport");
        bmw2.setProductYear(2018);
        bmw2.setColor("Midnight Blue");
        bmw2.setMilage(0);
        bmw2.setAcceleration(4);
        bmw2.setTopSpeed(250);

        Bmw bmw3=new Bmw();
        bmw3.setModel("5 seri");
        bmw3.setEngine("v10");
        bmw3.setTuner("Mpower");
        bmw3.setProductYear(2019);
        bmw3.setColor("BlueBlack");
        bmw3.setMilage(1000);
        bmw3.setAcceleration(5);
        bmw3.setTopSpeed(250);

        Bmw bmw4=new Bmw();
        bmw4.setModel("7 seri");
        bmw4.setEngine("v12");
        bmw4.setTuner("Bmw Motorsport");
        bmw4.setProductYear(2020);
        bmw4.setColor("Sunrise Yeloow");
        bmw4.setMilage(340);
        bmw4.setAcceleration(4);
        bmw4.setTopSpeed(300);

        Bmw arrayBmw[]= new Bmw[5];
        arrayBmw[0]=bmw;
        arrayBmw[1]=bmw1;
        arrayBmw[2]=bmw2;
        arrayBmw[3]=bmw3;
        arrayBmw[4]=bmw4;
        return arrayBmw;
    }
}
