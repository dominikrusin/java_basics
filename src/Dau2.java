public class Dau2 {
    public static void main (String[] args){
//        /*1*/ int x=3;
//        /*2*/ int y;
//        /*3*/ System.out.println(x++);// x + 1 wyświetli się 3 najpierw wykona dodawanie pożniej wyświetli
//        /*4*/ System.out.println(++x);// 4 + 1 wyświetli się 5 najpierw doda pożniej wyświetli
//        /*5*/ System.out.println(x);// 5
//        /*6*/ y = x++;// y=5
//        /*7*/ System.out.println (y);//5
//        /*8*/ y = ++x;// 7
//        /*9*/ System.out.println (y);//7
//        /*10*/ System.out.println (++y);//8
//        int [] TablicaCyfr = new int[5]; //tablica z wartosciami cyfrowymi
//        TablicaCyfr = new int[]{6,7,8,9,0};
//        System.out.println(TablicaCyfr[3]);// zliczanie zaczyna od zera
        String [] TablicaPieskow = new String[4];
        TablicaPieskow = new String[]{"Azor", "Boss", "King", "Kudłaty"};
        System.out.println(TablicaPieskow[2]);
        for (int i = 0 ; i< TablicaPieskow.length ; i++ ){
            System.out.println(TablicaPieskow[i]);
        }

    }
}
