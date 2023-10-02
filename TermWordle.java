import java.util.Scanner;

class Main {
    public static final byte[][] chrs = {
        {0,1,1,1,0, 1,1,1,1,0, 0,1,1,1,0, 1,1,1,1,0, 1,1,1,1,1, 1,1,1,1,1, 0,1,1,1,0, 1,0,0,0,1, 1,1,1,1,1, 0,1,1,1,1, 1,0,0,0,1, 1,0,0,0,0, 1,0,0,0,1, 1,0,0,0,1, 0,1,1,1,0, 1,1,1,1,0, 0,1,1,1,0, 1,1,1,1,0, 0,1,1,1,0, 1,1,1,1,1, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,1, 1,1,1,1,1,},
        {1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,0, 1,0,0,0,0, 1,0,0,0,1, 1,0,0,0,1, 0,0,1,0,0, 0,0,0,0,1, 1,0,0,0,1, 1,0,0,0,0, 1,1,0,1,1, 1,1,0,0,1, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,1, 0,0,1,0,0, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,1, 0,1,0,1,0, 1,0,0,0,1, 0,0,0,0,1,},
        {1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,0, 1,0,0,0,1, 1,0,0,0,0, 1,0,0,0,0, 1,0,0,0,0, 1,0,0,0,1, 0,0,1,0,0, 0,0,0,0,1, 1,0,0,0,1, 1,0,0,0,0, 1,0,1,0,1, 1,0,1,0,1, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,0, 0,0,1,0,0, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,1, 0,1,0,1,0, 0,1,0,1,0, 0,0,0,1,0,},
        {1,1,1,1,1, 1,1,1,1,0, 1,0,0,0,0, 1,0,0,0,1, 1,1,1,1,1, 1,1,1,1,1, 1,0,1,1,1, 1,1,1,1,1, 0,0,1,0,0, 0,0,0,0,1, 1,1,1,1,0, 1,0,0,0,0, 1,0,0,0,1, 1,0,0,1,1, 1,0,0,0,1, 1,1,1,1,0, 1,0,0,0,1, 1,1,1,1,0, 0,1,1,1,0, 0,0,1,0,0, 1,0,0,0,1, 0,1,0,0,1, 1,0,0,0,1, 0,0,1,0,0, 0,0,1,0,0, 0,0,1,0,0,},
        {1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,0, 1,0,0,0,1, 1,0,0,0,0, 1,0,0,0,0, 1,0,0,0,1, 1,0,0,0,1, 0,0,1,0,0, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,0, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,0, 1,0,1,0,1, 1,0,0,0,1, 0,0,0,0,1, 0,0,1,0,0, 1,0,0,0,1, 0,1,0,1,0, 1,0,1,0,1, 0,1,0,1,0, 0,0,1,0,0, 0,1,0,0,0,},
        {1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,0, 1,0,0,0,0, 1,0,0,0,1, 1,0,0,0,1, 0,0,1,0,0, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,0, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,1, 1,0,0,0,0, 1,0,0,1,1, 1,0,0,0,1, 1,0,0,0,1, 0,0,1,0,0, 1,0,0,0,1, 0,0,1,0,0, 1,1,0,1,1, 0,1,0,1,0, 0,0,1,0,0, 1,0,0,0,0,},
        {1,0,0,0,1, 1,1,1,1,0, 0,1,1,1,0, 1,1,1,1,0, 1,1,1,1,1, 1,0,0,0,0, 0,1,1,1,0, 1,0,0,0,1, 1,1,1,1,1, 0,1,1,1,0, 1,0,0,0,1, 1,1,1,1,1, 1,0,0,0,1, 1,0,0,0,1, 0,1,1,1,0, 1,0,0,0,0, 0,1,1,1,1, 1,0,0,0,1, 0,1,1,1,0, 0,0,1,0,0, 0,1,1,1,0, 0,0,1,0,0, 1,0,0,0,1, 1,0,0,0,1, 0,0,1,0,0, 1,1,1,1,1,}};
        //a         b          c          d          e          f          g          h          i          j          k          l          m          n          o          p          q          r          s          t          u          v          w          x          y          z
        public static final char[] conv = {' ','█'};
        public static int[]  buffer = new int[30];
        public static Scanner scan = new Scanner(System.in);
        public static int ln = 0;
    public static final String[] c = {"\u001B[0m","\u001B[30m","\u001B[31m","\u001B[32m","\u001B[33m","\u001B[34m","\u001B[35m","\u001B[36m","\u001B[37m","\u001B[40m","\u001B[41m","\u001B[42m","\u001B[43m","\u001B[44m","\u001B[45m","\u001B[46m","\u001B[47m"}; //color codes, use like c[num] + "text" + c[0] <- c[0] ends coloring
    //colors: 0white,1black,2"red",3green,4yellow,5blue,6purple,7cyan,8white <- fill color <> background color -> 9 black,10 red,11green,12yellow,13blue,14purple,15cyan,16white
    public static void main(String args[]) {
        update();
        crs(1,59,"-");
        String inp = scan.nextLine();
        crs(1,59,""+inp);
        delay(120);
        for(int i = 0; i < 5; i++) {
        buffer[(ln*5)+i] = Character.getNumericValue( inp.charAt( i%inp.length() ) )-84;
        crs(i*3,55,""+buffer[(ln*5)+i]);
        }
        update();
    }
    public static void delay(int ms) {
    try { 
    Thread.sleep(ms);
    } catch (InterruptedException e) {
    Thread.currentThread().interrupt();
    }
    }

    public static void update() {
        cls();
        drawOutl();
        for(int i = 0; i<(buffer.length);i++) { //draws all characters for testing
            System.out.print(c[0]);
            letter(6+((i%5)*15),Math.min(3+((i/5)*10),52),buffer[i]);
            System.out.print(c[0]);
        }

    }

    public static void letter(int column, int row,int c) { //letter starts at top left corner
        for(int i = 0; i < 35; i++) {
        crs(column+i%5,row+i/5,""+conv[chrs[(i/5)][(c*5)+(int)i%5]]);
        }
    }
    public static void drawOutl() { //draws outline box
        crs(0,1,"╔");
        for(int i=0;i<76;i++) {
            crs(i+2,1,"═");
            for(int j=1;j<6;j++) {
                crs(i+2,j*10,"═");
                if(j==5) {
                crs(i+2,51,"═");
                }
            }
            if(i<58) {
                crs(0,i+2,"║");
                crs(78,i+2,"║");
            
                for(int j=1;j<5;j++) {
                    crs(1+j*15,i+2,"║");
                }
            }
    }
        crs(0,59,"╚");
        for(int i=0;i<76;i++) {
            crs(i+2,59,"═");
        }
            crs(78,1,"╗");
            crs(78,59,"╝");
}
    public static void cls() { //clear screen
        System.out.print("\033[2J");
    }
    
    public static void crs(int column, int row, String txt) { //allows cursor position setting and stuff
    System.out.print(String.format("%c[%d;%df",033,row,column));
    System.out.println(txt);
    }   
}