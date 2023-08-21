package lesson24.paper;

public class MainPaper {
    public static void main(String[] args) {
        Paper paper = new Paper();
        Pencil pencil = new Pencil();
        Marker marker = new Marker();
        Brush brush = new Brush();
        Pen pen = new Pen();

        paper.drawFigureOnMe("Round", pencil);
        paper.drawFigureOnMe("Round", brush);
        paper.drawFigureOnMe("Round", marker);
        paper.drawFigureOnMe("Round", pen);
    }
}
