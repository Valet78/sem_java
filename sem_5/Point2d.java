package sem_5;

public class Point2d {
    private int x = 0, y = 0;
    private String sst = "0:0";
    private String[] strIn = new String[2];

    // Конвертация позиции в массиве (поле) в строку для очереди
    public String GetStr(int inY, int inX){
        this.x = inY;
        this.y = inX;
        return Integer.toString(y) + ":" + Integer.toString(x);
    }

    // Конвертация адреса из очереди в число
    public int GetY(String adr){
        this.sst = adr;
        strMass();        
        return Integer.parseInt(this.strIn[0]);        
    }
    
    public int GetX(String adr){
        this.sst = adr;
        strMass();        
        return Integer.parseInt(this.strIn[1]);
    }

    private void strMass(){
        this.strIn = this.sst.split(":");
    }



    
}
