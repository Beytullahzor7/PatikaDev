package FolksDev;

public class _9_DrawDiamonds {
    public static void main(String[] args) {
        drawDiamond2(4);
        drawLeftBottomCenterPerpendicularTriangle(4);

        
    }

    public static void drawLeftBottomCenterPerpendicularTriangle(int rowNumber){
        for(int i=0; i<rowNumber; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawDiamond2(int rowNumber){
        for(int i=rowNumber; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
